package com.example.wi.domestic;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.view.MenuItem;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;

public class Domestic2 extends AppCompatActivity {
    Button btn_Agua,btn_Energia,btn_Comb;
    ImageButton btn_Back,btn_Next;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domestic2);
        btn_Agua = (Button)findViewById(R.id.btn_Agua);
        btn_Back = (ImageButton)findViewById(R.id.btn_Back);
        btn_Energia = (Button)findViewById(R.id.btn_Energia);
        btn_Comb = (Button)findViewById(R.id.btn_Comb);



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
    }
}
