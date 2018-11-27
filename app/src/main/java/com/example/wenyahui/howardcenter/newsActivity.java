package com.example.wenyahui.howardcenter;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.animation.AnimatorSet;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;

public class newsActivity extends AppCompatActivity {
    private TextView mTextSample;
    private ImageView mImageView;
    private static final String TAG = "newsActivity";
    private TextView view1;
    private TextView view2;
    private TextView view3;
    private Articles[] mArticlesBank=new Articles[]{
            new Articles(R.string.article1,"<a href='http://www.google.com'>article1</a>",view1,R.id.textView1),
            new Articles(R.string.article2,"<a href='http://www.google.com'>article2</a>",view2,R.id.textView2),
           //  new Articles(R.string.article3,"<a href='http://www.google.com'>article3</a>",view3,R.id.textView3)
    };
    private int mCurrentIndex=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG,"onCreate(Bundle) called");
        setContentView(R.layout.activity_news_main);
        //String linkText = "<a href='http://www.google.com'>Google</a> web page.";
        for(int i=0;i<mArticlesBank.length;i++){
            mTextSample=(TextView) findViewById(mArticlesBank[i].getTextViewId());
            String linkText = mArticlesBank[i].getLink();
            mTextSample.setText(Html.fromHtml(linkText));
            mTextSample.setMovementMethod(LinkMovementMethod.getInstance());
        }

    }


    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }
}
