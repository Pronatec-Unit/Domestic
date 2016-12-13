package com.example.wi.domestic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.wi.domestic.R.layout.activity_domestic;

public class Domestic extends AppCompatActivity implements View.OnClickListener {
    Button btn_Entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_domestic);
       btn_Entrar = (Button)findViewById(R.id.btn_Entrar);


       btn_Entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Domestic.this, Domestic2.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
    public void onBackPressed(){
        finish();
    }
}
