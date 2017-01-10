package com.example.wi.domestic;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.math.BigDecimal;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.math.RoundingMode;


public class Domestic4 extends AppCompatActivity {

    Button  btn_Aparelhos , btn_Watz ;
    ImageButton btn_Voltar;
    EditText resultado, aparelhos, wattz;
    double n1 , n2 , n3, resul , n4;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domestic4);
        btn_Voltar = (ImageButton)findViewById(R.id.btn_Voltar);
        resultado = (EditText) findViewById(R.id.resultado);
        aparelhos = (EditText) findViewById(R.id.aparelhos);
        wattz = (EditText) findViewById(R.id.wattz);
        btn_Aparelhos = (Button) findViewById(R.id.btnAparelhos);
        btn_Watz = (Button) findViewById(R.id.btnWatz);

        Button total = (Button) findViewById(R.id.fim);

        total.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                try {
                    n2 = Double.parseDouble(aparelhos.getText().toString());
                    n3 = Double.parseDouble(wattz.getText().toString());

                    resul = (n2 * n3 * 30 * 3.5) / 1000;

                    if (resul <= 30){
                        n4 = resul * 1.50;
                    } else if (resul > 30 && resul <= 100 ){
                        n4 = resul * 1.85;
                    } else if (resul > 100 && resul <= 220){
                        n4 = resul * 2.75;
                    }else if (resul > 220){
                        n4 = resul * 3.45;
                    }

                    resultado.setText(String.valueOf(Math.ceil(n4)));
                } catch (NumberFormatException a){
                    Toast toast = Toast.makeText(getApplicationContext(),"Digite apenas numeros", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });


        btn_Voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Domestic4.this, Domestic2.class);
                startActivity(intent);
                finish();
            }
        });
        btn_Aparelhos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder info = new AlertDialog.Builder(Domestic4.this);
                info.setTitle("Aparelhos");
                info.setMessage("Voce deve informar a quantidade de aparelhos que consomem , de preferencia, a mesma quantidade de Wattz para que o calculo dê um resultado preciso\n" +
                        "Ex: 2 Aparelhos");
                info.setPositiveButton("Entendi", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface alerta, int i) {
                        alerta.cancel();
                    }
                });
                info.show();
            }
        });
        btn_Watz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder info = new AlertDialog.Builder(Domestic4.this);
                info.setTitle("Khw/Mes");
                info.setMessage("Kwh é uma medida da energia elétrica consumida por um aparelho durante um determinado período de funcionamento.\n" +
                        "Informe o consumo de energia eletrica por mes, do seu aparelho!\n" +
                        "Ex: 43.7 Kwh/Mes");
                info.setPositiveButton("Entendi", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface alerta, int i) {
                        alerta.cancel();
                    }
                });
                info.show();
            }
        });
    }
    public void onBackPressed(){
        Intent intent = new Intent(Domestic4.this, Domestic2.class);
        startActivity(intent);
        finish();
    }
}
