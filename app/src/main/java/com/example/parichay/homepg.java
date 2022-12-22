package com.example.parichay;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class homepg extends AppCompatActivity {
    public Button caves;
    public Button temples;
    public Button map;
    public Button cal;
    public Button bl;
    public Button fort;
    public Button pt;


    BottomNavigationView bottomNavigationView;

    HomeFragment   homeFragment= new HomeFragment();
    travelFragment   travelFragment= new travelFragment();
    bucketFragment bucketFragment = new bucketFragment();
    TravellFragment travellFragment = new TravellFragment();
    likeFragment likeFragment = new likeFragment();
    profileFragment profileFragment = new profileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepg);


        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

       // bottomNavigationView.setSelectedItemId(R.id.nav_home);

       bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
           @SuppressLint("NonConstantResourceId")
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
             //  Fragment fragment = null;
               switch (item.getItemId()){

                   case R.id.nav_home:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                       return true;

                   case R.id.nav_travel:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container,travellFragment).commit();
                       return true;

                   case R.id.nav_list:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container,bucketFragment).commit();
                       return true;



                   case R.id.nav_like:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container, likeFragment).commit();
                       return true;

                   case R.id.nav_profile:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment).commit();
                       return true;





               }

             //  getSupportFragmentManager().beginTransaction().replace(R.id.body_container,fragment).commit();
               return false;
           }
       });


        pt= (Button) findViewById(R.id.button24);
        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepg.this,Plantrip.class);
                startActivity(intent);

            }
        });


                fort= (Button) findViewById(R.id.button18);
        fort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepg.this,Fort.class);
                startActivity(intent);

            }
        });


        bl= (Button) findViewById(R.id.button22);
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepg.this, BC.class);
                startActivity(intent);

            }
        });


        cal= (Button) findViewById(R.id.button23);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepg.this,canlender.class);
                startActivity(intent);

            }
        });
        map = (Button) findViewById(R.id.button25);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepg.this,Map.class);
                startActivity(intent);

            }
        });

        temples = (Button) findViewById(R.id.button17);
        temples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepg.this,temples1.class);
                startActivity(intent);

            }
        });
        caves = (Button) findViewById(R.id.button12);
        caves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homepg.this,caves.class);
                startActivity(intent);

            }
        });
    }
}