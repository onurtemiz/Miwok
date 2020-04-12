package com.example.android.miwok;

import android.view.View;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwok){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwok;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
