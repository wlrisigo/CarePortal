package com.example.wenyahui.howardcenter;
import android.widget.ImageView;
import android.widget.TextView;


import android.widget.ImageView;
import android.widget.TextView;

public class newsInfo {
    protected static final String TEXTVIEW_PREFIX = "Text_";
    protected static final String DESCRIPTION_PREFIX = "Description_";
    //    protected static final String IMAGE_PREFIX = "Image_";
    private int mArticleId;
    protected String mlink;
    protected TextView mView;
    protected int mTextViewId;
    protected String mTextView;
    protected String mDescription;
    protected String mImageView;
    protected ImageView mImage;

    public newsInfo() {

    }

    public newsInfo(int articleId,String link, TextView view, int textViewId){
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
