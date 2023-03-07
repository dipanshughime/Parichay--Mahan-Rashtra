package com.example.parichay;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class caves extends AppCompatActivity {
    public Button button;
    public Button uplode;
    public Button Review;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caves);
        button = (Button) findViewById(R.id.button3);
        Review =(Button)findViewById(R.id.rbtn);
        uplode = (Button)findViewById(R.id.upid);

        uplode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(caves.this,ImageUplode.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(caves.this,elloramapview.class);
                startActivity(intent);
            }
        });

        Review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(caves.this,Comment.class);
                startActivity(intent);
            }
        });

    }
}