package com.example.wi.domestic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class Domestic3 extends AppCompatActivity {

    ImageButton btn_vol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domestic3);
        btn_vol = (ImageButton)findViewById(R.id.btn_vol);

        btn_vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Domestic3.this, Domestic2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
