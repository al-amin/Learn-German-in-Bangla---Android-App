package com.example.android.learngermaninbangla;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alamin on 22,April,2019 at time - 15:16
 * Email : encrypt.h@gmail.com
 *
 * @project Learn-German-in-German-Android-App
 */
public class WordAdapter extends ArrayAdapter<Word> {

/** Resource ID for the background color for this list of words */
private int mColorResourceId;


/**
 * Create a new {@link WordAdapter} object.
 *
 * @param context is the current context (i.e. Activity) that the adapter is being created in.
 * @param words is the list of {@link Word}s to be displayed.
 * @param colorResourceId is the resource ID for the background color for this list of words
 */
public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
        }
//
//    public AndroidFlavorAdapter(Activity context, ArrayList<AndroidFlavor> androidFlavors) {
//        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
//        // the second argument is used when the ArrayAdapter is populating a single TextView.
//        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
//        // going to use this second argument, so it can be any value. Here, we used 0.
//        super(context, 0, androidFlavors);
//    }


@NonNull
@Override
public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(
        R.layout.list_item, parent, false);
        }


        // Get the {@link Word} object located at this position in the list
        Word currentWords = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID list_item_eng
        TextView engTextView = (TextView) listItemView.findViewById(R.id.list_item_eng);
        // Get the english translation from the current WOrd object and
        // set this text on the translation TextView
        engTextView.setText(currentWords.getDefaultTranslation());



        // Find the TextView in the list_item.xml layout with the ID list_item_miwok
        TextView miyokTextView = (TextView) listItemView.findViewById(R.id.list_item_miwok);
        // Get the list_item_miwok  from the current Word object and
        // set this text on the miwok TextView
        miyokTextView.setText(currentWords.getGermanTranslation());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

        if(currentWords.hasImage()){
        // If an image is available, display the provided image based on the resource ID
        iconView.setImageResource(currentWords.getmImageResourceId());
        // Make sure the view is visible
        iconView.setVisibility(View.VISIBLE);
        } else {
        // Otherwise hide the ImageView (set visibility to GONE)
        iconView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
        }
        }
