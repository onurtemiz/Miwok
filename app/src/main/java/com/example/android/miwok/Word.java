package com.example.android.miwok;

import android.view.View;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int imageResource = 0;
    private int audioResource;

    public Word(String defaultTranslation, String miwok,int i,int audio){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwok;
        this.imageResource = i;
        this.audioResource = audio;
    }

    public Word(String translation, String miwok,int audio){
        this.mMiwokTranslation = miwok;
        this.mDefaultTranslation = translation;
        this.audioResource = audio;
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

    public int getAudioResource() {
        return audioResource;
    }
}
