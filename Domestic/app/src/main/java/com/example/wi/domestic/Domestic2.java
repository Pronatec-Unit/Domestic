package com.example.wi.domestic;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Domestic2 extends AppCompatActivity {
    Button btn_Agua,btn_Energia,btn_Comb;
    ImageButton btn_Back;
    ImageView agua, luz, gasolina;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domestic2);
        btn_Agua = (Button)findViewById(R.id.btn_Agua);
        btn_Back = (ImageButton)findViewById(R.id.btn_Back);
        btn_Energia = (Button)findViewById(R.id.btn_Energia);
        btn_Comb = (Button)findViewById(R.id.btn_Comb);
        agua = (ImageView) findViewById(R.id.imgAgua);
        luz = (ImageView) findViewById(R.id.imgLuz);
        gasolina = (ImageView) findViewById(R.id.imgCombustivel);



        btn_Comb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Domestic2.this, Domestic5.class);
                startActivity(intent);
                finish();

            }
        });


        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Domestic2.this, Domestic.class);
                startActivity(intent);
                finish();
            }
        });
        btn_Agua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Domestic2.this, Domestic3.class);
                startActivity(intent);
                finish();
            }
        });
        btn_Energia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Domestic2.this, Domestic4.class);
                startActivity(intent);
                finish();
            }
        });

        agua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder info = new AlertDialog.Builder(Domestic2.this);
                info.setTitle("Agua");
                info.setMessage("Esta area é destinada para quem deseja calcular o valor da conta de agua em sua residencia!\n" +
                        "Os valores foram retirados do site da DESO, mantendo assim suas tarifas devidamente atualizadas.");
                info.setPositiveButton("Entendi", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                info.show();
            }
        });
        luz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder info = new AlertDialog.Builder(Domestic2.this);
                info.setTitle("Energia").setMessage("Esta area é destinada para quem deseja calcular do valor da conta de energia por aparelho em sua residencia.\n" +
                        "As informaçoes necessarias devem estar contidas nas informaçoes de cada aparelho, como Woltagem/Mes").setPositiveButton("Entendi",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                info.show();
            }
        });
        gasolina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder info = new AlertDialog.Builder(Domestic2.this);
                info.setTitle("Combustivel");
                info.setMessage("Esta area é destinada para quem quer saber quanto de combustivel é consumido durando um determinado intervalo de espaco percorrido," +
                        " utilizando o rendimento do combustivel do seu automovel, com a distancia percorrida.");
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
        Intent intent = new Intent(Domestic2.this, Domestic.class);
        startActivity(intent);
        finish();
    }
}
