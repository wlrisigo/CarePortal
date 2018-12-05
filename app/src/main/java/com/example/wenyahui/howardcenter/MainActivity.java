package com.example.wenyahui.howardcenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView help;
    private TextView news;
    private TextView health;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        news = (TextView) findViewById(R.id.news_button);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, newsActivity.class);
                startActivity(intent);

            }
        });
        health = (TextView) findViewById(R.id.health_button);
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewApps.class);
                startActivity(intent);

            }
        });
        help = (TextView) findViewById(R.id.help_button);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, phoneCallActivity.class);
                startActivity(intent);

            }
        });

    }

}

