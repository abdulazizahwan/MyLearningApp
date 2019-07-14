package com.example.mylearningapp;

import androidx.appcompat.app.AppCompatActivity;
import static maes.tech.intentanim.CustomIntent.customType;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void slideUp(View view){
        startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
        customType(MainActivity.this,"bottom-to-up");
    }
}
