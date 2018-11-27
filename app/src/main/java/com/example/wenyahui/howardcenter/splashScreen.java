package com.example.wenyahui.howardcenter;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.support.v4.app.ActivityOptionsCompat;


public class splashScreen extends Activity {

    Thread splashTread;
    ImageView imageView;
    Animation animationfadein;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageView = (ImageView) findViewById(R.id.splash);
        animationfadein = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        imageView.startAnimation(animationfadein);
        Thread screenDisplayTimer = new Thread() {

            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                } finally {
                    startActivity(new Intent(splashScreen.this, MainActivity.class));
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
                finish();
            }
        };
        screenDisplayTimer.start();
    }

           }

