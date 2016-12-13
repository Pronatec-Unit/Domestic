package com.example.wi.domestic;

import android.app.Activity;
import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class Domestic5 extends AppCompatActivity {
    ImageButton btn_V;
    double n1, n2, n3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domestic5);

        btn_V = (ImageButton)findViewById(R.id.btn_V);

        Button resultado = (Button) findViewById(R.id.resultado);
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
                n1 = Double.parseDouble(valor.getText().toString());
                n2 = Double.parseDouble(consumo.getText().toString());
                n3 = n2 / n1;

                gasto.setText(String.valueOf(n3));

            }
        });
    }
    public void onBackPressed(){
        Intent intent = new Intent(Domestic5.this, Domestic2.class);
        startActivity(intent);
        finish();
    }
}
