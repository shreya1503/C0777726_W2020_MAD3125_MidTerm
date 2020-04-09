package com.shreya.c0777726_w2020_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class Splash_Activity extends AppCompatActivity
{
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash_Activity.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        },SPLASH_TIME_OUT);
    }
}
