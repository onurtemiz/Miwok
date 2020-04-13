package com.example.android.miwok;

import android.view.View;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int imageResource = 0;

    public Word(String defaultTranslation, String miwok,int i){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwok;
        this.imageResource = i;
    }

    public Word(String translation, String miwok){
        this.mMiwokTranslation = miwok;
        this.mDefaultTranslation = translation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResource() {
        return imageResource;
    }
}
