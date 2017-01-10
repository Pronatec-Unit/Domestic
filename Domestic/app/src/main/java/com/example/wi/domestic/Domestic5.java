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


public class Domestic5 extends AppCompatActivity {
    ImageButton btn_V;
    double n1, n2, n3;
    Button btnValor , btnConsumo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domestic5);

        btn_V = (ImageButton)findViewById(R.id.btn_V);

        Button resultado = (Button) findViewById(R.id.resultado);
        btnConsumo = (Button) findViewById(R.id.btnConsumo);
        btnValor = (Button) findViewById(R.id.btnValor);
        final EditText valor = (EditText) findViewById(R.id.lblValor);
        final EditText consumo = (EditText) findViewById(R.id.lblConsumo);
        final EditText gasto = (EditText) findViewById(R.id.lblResultado);

        btn_V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Domestic5.this, Domestic2.class);
                startActivity(intent);
                finish();
            }
        });
        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    n1 = Double.parseDouble(valor.getText().toString());
                    n2 = Double.parseDouble(consumo.getText().toString());
                    n3 = n2 / n1;

                    gasto.setText(String.valueOf(n3));
                }catch (NumberFormatException a){
                    Toast toast = Toast.makeText(Domestic5.this, "Digite apenas numeros" , Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        btnValor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder info = new AlertDialog.Builder(Domestic5.this);
                info.setTitle("Valor");
                info.setMessage("Esse campo representa quantos Quilômetros seu automovel faz com 1 Litro de combustivel.\n" +
                        "Esse valor deve ser preenchido apenas com numeros.\n" +
                        "Ex: 33 Km/L");
                info.setPositiveButton("Entendi", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                info.show();
            }
        });
        btnConsumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder info = new AlertDialog.Builder(Domestic5.this);
                info.setTitle("Consumo");
                info.setMessage("Este campo representa a distancia percorrida pelo automovel.\n" +
                        "A distancia percorrida deve ser posta representando a medida em Km.\n" +
                        "Ex: 120 Km");
                info.setPositiveButton("Entendi", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                info.show();
            }
        });
    }
    public void onBackPressed(){
        Intent intent = new Intent(Domestic5.this, Domestic2.class);
        startActivity(intent);
        finish();
    }
}
