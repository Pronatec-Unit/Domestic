package com.example.wi.domestic;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class Domestic3 extends AppCompatActivity {

    Button btn_consumo;
    ImageButton btn_vol;
    double n1, n2 , n3;
    EditText consumo, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domestic3);
        btn_vol = (ImageButton)findViewById(R.id.btn_vol);
        consumo = (EditText) findViewById(R.id.gastoMes);
        resultado = (EditText) findViewById(R.id.lblResultado);
        Button btnResul = (Button) findViewById(R.id.btnResultado);
        btn_consumo = (Button) findViewById(R.id.btnConsumo);

        n3 = 30.85;

        btnResul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    n1 = Double.parseDouble(consumo.getText().toString());
                    if (n1 > 10 && n1 <= 20){
                        n2 = ((n1 - 10) * 6.90) + n3;
                    }
                    if (n1 > 20 && n1 <=30) {
                        n2 = (((n1 - 20)*10.49) + (10*6.90) + n3 );
                    }
                    if (n1 > 30 && n1 <= 50) {
                        n2 = (((n1 - 30)*14.70) + (10*6.90) + n3 + (10*10.49) );
                    }
                    if (n1 > 50 && n1 <= 100) {
                        n2 = (((n1 - 50)*20.45) + (10*6.90) + n3 + (10*10.49) + (10*14.70));
                    }
                    if (n1 > 100) {
                        n2 = (((n1 - 100)*26.22) + (10*6.90) + n3 + (10*10.49) + (10*14.70) + (10*20.45));
                    }
                    if (n1 < 10) {
                        n2 = n1 + n3;
                    }

                    resultado.setText(String.valueOf(n2));
                } catch (NumberFormatException a){
                    Toast toast = Toast.makeText(Domestic3.this, "Digite apenas Numeros" , Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });

        btn_vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Domestic3.this, Domestic2.class);
                startActivity(intent);
                finish();
            }
        });
        btn_consumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder info = new AlertDialog.Builder(Domestic3.this);
                info.setTitle("Consumo de Agua");
                info.setMessage("O consumo da agua é representado pelo gasto em m³.\n" +
                        "Ex: 1m³ = 1000L ou 0.001m³ = 1L\n" +
                        "Aviso: Valor deve ser colocado em m³");
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
        Intent intent = new Intent(Domestic3.this, Domestic2.class);
        startActivity(intent);
        finish();
    }
}
