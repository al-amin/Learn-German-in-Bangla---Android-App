package com.asif.alamin.learngermaninbangla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("আপনি কোথায় যাচ্ছেন?", "Wohin gehst du?"));
        words.add(new Word("আপনার নাম কি?", "Wie heißen Sie?"));
        words.add(new Word("আমার নাম...", "Ich heiße..."));
        words.add(new Word("আপনি কেমন অনুভব করেন?", "Wie fühlst du dich??"));
        words.add(new Word("আমি ভাল অনুভব করছি।", "Ich fühle mich gut."));
        words.add(new Word("তুমি কি আসছ?", "Kommst du?"));
        words.add(new Word("Yes, I’m coming.", "Ja, ich komme."));
        words.add(new Word("হ্যাঁ, আমি আসছি।", "әәnәm"));
        words.add(new Word("চলো যাই.", "Lass uns gehen."));
        words.add(new Word("এখানে আসো", "Komm her."));

// Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
// adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
// There should be a {@link ListView} with the view ID called list, which is declared in the
// word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);
// Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
// {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
