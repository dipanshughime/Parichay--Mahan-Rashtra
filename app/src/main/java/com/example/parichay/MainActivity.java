package com.example.parichay;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private final static int SPLASH_SCREEN = 5000;

    public Button button;
    // variables
    Animation topAnim,bottomAnim;
    ImageView image;
    TextView logo , slogan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animation

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        // hooks
        image = findViewById(R.id.imageView10);
        logo = findViewById(R.id.textView17);

        image.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,loginpg.class);
                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View,String>(image, "logo_image");
                pairs[1] = new Pair<View,String>(image, "logo_text");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(intent,options.toBundle());

            }
        }, SPLASH_SCREEN);

//        button = (Button) findViewById(R.id.button15);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,loginpg.class);
//                startActivity(intent);
//
//            }
//        });
    }
}