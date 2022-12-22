package com.example.parichay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Plantrip extends AppCompatActivity {

   public Button lg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantrip);
        lg= (Button) findViewById(R.id.button10);
        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Plantrip.this,Sugge.class);
                startActivity(intent);
            }
        });
    }
}