package com.example.wi.domestic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class Domestic4 extends AppCompatActivity {

    ImageButton btn_Voltar;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domestic4);
        btn_Voltar = (ImageButton)findViewById(R.id.btn_Voltar);


        btn_Voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Domestic4.this, Domestic2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
