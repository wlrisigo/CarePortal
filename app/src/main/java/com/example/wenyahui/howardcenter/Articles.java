package com.example.wenyahui.howardcenter;

import android.support.v7.widget.CardView;
import android.widget.TextView;

public class Articles {
    private int mArticleId;
    private String mlink;
    private TextView mView;
    private int mTextViewId;
    public Articles(int articleId,String link, TextView view, int textViewId){
        mArticleId=articleId;
        mlink=link;
        mView=view;
        mTextViewId=textViewId;
    }
    public int getArticleId(){
        return mArticleId;
    }
    public void setArticleId(int articleId){
        mArticleId=articleId;
    }
    public String getLink(){
        return mlink;
    }
    public void setLink(String link){
        mlink=link;
    }

    public TextView getView() {
        return mView;
    }

    public void setView(TextView view) {
        mView = view;
    }

    public int getTextViewId() {
        return mTextViewId;
    }

    public void setTextViewId(int textViewId) {
        mTextViewId = textViewId;
    }
}
