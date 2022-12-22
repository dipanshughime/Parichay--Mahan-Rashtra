package com.example.parichay;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Main extends AppCompatActivity {


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
        setContentView(R.layout.activity_main3);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
    getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

       //  bottomNavigationView.setSelectedItemId(R.id.nav_home);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
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





    }
}