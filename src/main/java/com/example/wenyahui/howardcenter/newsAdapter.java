package com.example.wenyahui.howardcenter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import android.text.Html;
import android.text.method.LinkMovementMethod;

public class newsAdapter extends RecyclerView.Adapter<newsAdapter.newsViewHolder>{
    private List<newsInfo> newsList;
    private TextView mTextSample;
    public newsAdapter(List<newsInfo> newsList) {
        this.newsList = newsList;
    }


    @Override
    public int getItemCount() {
        return newsList.size();
    }
    @Override
    public void onBindViewHolder(newsViewHolder newsViewHolder, int i) {
        newsInfo ci = newsList.get(i);
        newsViewHolder.mTextView.setText(R.string.article1);
        //newsViewHolder.mDescription.setText("Description");
        newsViewHolder.mDescription.setText(ci.mDescription);
        mTextSample=newsViewHolder.mTextView;
        String linkText = "www.gmsavt.org";
        mTextSample.setText(Html.fromHtml("<a href='http://www.gmsavt.org'>Article</a>"));
        mTextSample.setMovementMethod(LinkMovementMethod.getInstance());

    }
    @Override
    public newsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card_layout, viewGroup, false);

        return new newsViewHolder(itemView);
    }
    public static class newsViewHolder extends RecyclerView.ViewHolder {

        protected ImageView mImageView;
        protected TextView mTextView;
        protected TextView mDescription;
        public newsViewHolder(View v) {
            super(v);
            mTextView = (TextView)  v.findViewById(R.id.textView);
            mDescription=(TextView) v.findViewById(R.id.description);
            mImageView=(ImageView)v.findViewById(R.id.image);
        }
    }

}
