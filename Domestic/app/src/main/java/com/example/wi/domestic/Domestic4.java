package com.example.wi.domestic;

import android.content.Context;
import android.content.Intent;
import android.icu.math.BigDecimal;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.math.RoundingMode;


public class Domestic4 extends AppCompatActivity {

    ImageButton btn_Voltar;
    EditText resultado, dia, aparelhos, wattz;
    double n1 , n2 , n3, resul , n4;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domestic4);
        btn_Voltar = (ImageButton)findViewById(R.id.btn_Voltar);
        resultado = (EditText) findViewById(R.id.resultado);
        dia = (EditText) findViewById(R.id.h_d);
        aparelhos = (EditText) findViewById(R.id.aparelhos);
        wattz = (EditText) findViewById(R.id.wattz);

        Button total = (Button) findViewById(R.id.fim);

        total.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                try {
                    n1 = Double.parseDouble(dia.getText().toString());
                    n2 = Double.parseDouble(aparelhos.getText().toString());
                    n3 = Double.parseDouble(wattz.getText().toString());

                    resul = (n1 * n2 * n3 * 30) / 1000;

                    if (resul <= 30){
                        n4 = resul * 0.14814;
                    } else if (resul > 30 && resul <= 100 ){
                        n4 = resul * 0.25396;
                    } else if (resul > 100 && resul <= 220){
                        n4 = resul * 0.38094;
                    }else if (resul > 220){
                        n4 = resul * 0.42328;
                    }

                    resultado.setText(String.valueOf(Math.ceil(n4)));
                } catch (NumberFormatException a){
                    Toast toast = Toast.makeText(getApplicationContext(),"Digite apenas numeros", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });


        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    n1 = Double.parseDouble(dia.getText().toString());
                    n2 = Double.parseDouble(aparelhos.getText().toString());
                    n3 = Double.parseDouble(wattz.getText().toString());

                    resul = (n1 * n2 * n3 * 30) / 1000;

                    if (resul <= 30){
                        n4 = resul * 0.14814;
                    } else if (resul > 30 && resul <= 100 ){
                        n4 = resul * 0.25396;
                    } else if (resul > 100 && resul <= 220){
                        n4 = resul * 0.38094;
                    }else if (resul > 220){
                        n4 = resul * 0.42328;
                    }
                    resultado.setText(String.valueOf(n4));
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
    }
    public void onBackPressed(){
        Intent intent = new Intent(Domestic4.this, Domestic2.class);
        startActivity(intent);
        finish();
    }
}
