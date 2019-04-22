package com.example.android.learngermaninbangla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        //words.add(new Word("শুন্য", "null", R.drawable.number_one));
        words.add(new Word("এক", "eins", R.drawable.number_one));
        words.add(new Word("দুই", "zwei", R.drawable.number_two));
        words.add(new Word("তিন", "drei", R.drawable.number_three));
        words.add(new Word("চার", "vier", R.drawable.number_four));
        words.add(new Word("পাঁচ", "fünf", R.drawable.number_five));
        words.add(new Word("ছয়", "sechs", R.drawable.number_six));
        words.add(new Word("সাত", "sieben", R.drawable.number_seven));
        words.add(new Word("আট", "acht", R.drawable.number_eight));
        words.add(new Word("নয়", "neun", R.drawable.number_nine));
        words.add(new Word("দশ", "zehn", R.drawable.number_ten));
// Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
// adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
// There should be a {@link ListView} with the view ID called list, which is declared in the
// word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);
// Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
// {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
