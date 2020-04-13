package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int backColor;


    public WordAdapter(Activity context, ArrayList<Word> words, int backgroundColor) {
        super(context, 0, words);
        this.backColor = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.arr_layout, parent, false);
        }

        Word currentWord = getItem(position);

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.englishText);
        englishTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.foreignText);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        LinearLayout textLayout = (LinearLayout) listItemView.findViewById(R.id.textLayout);
        int color = ContextCompat.getColor(getContext(),this.backColor);
        textLayout.setBackgroundColor(color);

        ImageView image = (ImageView) listItemView.findViewById(R.id.imageView);
        if (currentWord.getImageResource() != 0) {
            image.setImageResource(currentWord.getImageResource());
        }else {
            image.setVisibility(View.GONE);
        }

        return listItemView;

    }
}
