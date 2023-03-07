package com.example.parichay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginpg extends AppCompatActivity {
    public Button button;
    public Button gbtn;
    public Button reg;
    public Button skip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpg);
        button = (Button) findViewById(R.id.button4);
        gbtn=(Button)findViewById(R.id.googleid);
        reg = (Button) findViewById(R.id.button7);
        skip = (Button) findViewById(R.id.button11);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginpg.this,Registerpg.class);
                startActivity(intent);

            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginpg.this,homepg.class);
                startActivity(intent);

            }
        });

        gbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(loginpg.this,Gauth.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginpg.this,homepg.class);
                startActivity(intent);

            }
        });
    }
}

