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
                    startActivity(new Intent(splashScreen.this, newsActivity.class));
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
                finish();
            }
        };
        screenDisplayTimer.start();
    }

//        splashTread = new Thread() {
//            @Override
//            public void run() {
//                try {
//                    int waited = 0;
//                    // Splash screen pause time
//                    while (waited < 3500) {
//                        sleep(100);
//                        waited += 100;
//                    }
//                    Intent intent = new Intent(splashScreen.this,
//                            newsActivity.class);
//                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
//                    startActivity(intent);
//                    splashScreen.this.finish();
//                } catch (InterruptedException e) {
//                    // do nothing
//                } finally {
//                    splashScreen.this.finish();
//                }
//
//            }
//        };
//        splashTread.start();
           }

