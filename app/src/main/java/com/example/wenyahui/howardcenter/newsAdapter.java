package com.example.wenyahui.howardcenter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class newsAdapter extends RecyclerView.Adapter<newsAdapter.newsViewHolder>{
    private List<newsInfo> newsList;
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
        newsViewHolder.mTextView.setText(ci.mTextView);
        newsViewHolder.mDescription.setText(ci.mDescription);
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
