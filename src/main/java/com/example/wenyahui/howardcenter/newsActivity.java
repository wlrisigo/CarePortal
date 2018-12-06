package com.example.wenyahui.howardcenter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
public class newsActivity extends AppCompatActivity {

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
            ci.mTextView = (TextView)findViewById(R.id.textView);
            //ci.mDescription= (TextView)findViewById(R.id.description);
            ci.mDescription= newsInfo.DESCRIPTION_PREFIX + i;


            result.add(ci);

        }
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