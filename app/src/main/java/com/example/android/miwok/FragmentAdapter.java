package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    private Context context;

    public FragmentAdapter(FragmentManager fm, Context con) {

        super(fm);
        this.context = con;
    }


    @Override
    public Fragment getItem(int p){
        if (p == 0){
            return new NumbersFragment();
        }else if (p == 1){
            return new ColorFragment();
        }else if (p == 2){
            return new FamilyFragment();
        }else {
            return new PharasesFragment();
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_numbers);
        } else if (position == 1) {
            return context.getString(R.string.category_family);
        } else if (position == 2) {
            return context.getString(R.string.category_colors);
        } else {
            return context.getString(R.string.category_phrases);
        }
    }

    @Override
    public int getCount(){
        return 4;
    }
}
