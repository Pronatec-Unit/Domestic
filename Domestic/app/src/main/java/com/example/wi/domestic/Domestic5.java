package com.example.wi.domestic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class Domestic5 extends AppCompatActivity {
    ImageButton btn_V;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domestic5);

        btn_V = (ImageButton)findViewById(R.id.btn_V);

        btn_V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Domestic5.this, Domestic2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
