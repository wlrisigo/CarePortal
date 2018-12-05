package com.example.wenyahui.howardcenter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;
public class newsActivity extends AppCompatActivity {
    private TextView mTextSample;
    private TextView view1;
    private TextView view2;
    private TextView view3;
    private TextView view4;
    private TextView view5;
    private static final String TAG = "newsActivity";
    newsInfo c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate(Bundle) called");
        setContentView(R.layout.activity_news_main);
        RecyclerView recList = (RecyclerView) findViewById(R.id.cardList);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        newsAdapter ca = new newsAdapter(createList(10));
        //newsAdapter ca = new newsAdapter(createList());
        recList.setAdapter(ca);

    }
    private List<newsInfo> createList(int size) {

        List<newsInfo> result = new ArrayList<newsInfo>();
        for (int i=1; i <= size; i++) {
            newsInfo ci = new newsInfo();
            ci.mTextView = newsInfo.TEXTVIEW_PREFIX + i;
            ci.mDescription= newsInfo.DESCRIPTION_PREFIX + i;
            //ci.mImageView = newsInfo.IMAGE_PREFIX+ i ;

            result.add(ci);

        }
//        newsInfo c1 = new newsInfo(R.string.article1,"<a href='http://www.google.com'>article1</a>",view1,R.id.textView);
//        newsInfo c2 = new newsInfo(R.string.article2,"<a href='http://www.google.com'>article1</a>",view1,R.id.textView);
//        newsInfo c3 = new newsInfo(R.string.article3,"<a href='http://www.google.com'>article1</a>",view1,R.id.textView);
//        newsInfo c4 = new newsInfo(R.string.article4,"<a href='http://www.google.com'>article1</a>",view1,R.id.textView);
//        newsInfo c5 = new newsInfo(R.string.article1,"<a href='http://www.google.com'>article1</a>",view1,R.id.textView);
//
//        result.add(c1);
//        result.add(c2);
//        result.add(c3);
//        result.add(c4);
//        result.add(c5);
        return result;
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