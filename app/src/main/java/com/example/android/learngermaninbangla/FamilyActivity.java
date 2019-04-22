package com.example.android.learngermaninbangla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("বাবা (baba)", "der Vater", R.drawable.family_father));
        words.add(new Word("মা (ma)", "die Mutter", R.drawable.family_mother));
        words.add(new Word("ছেলে (chhele)", "der Sohn", R.drawable.family_son));
        words.add(new Word("মেয়ে (meẏe)", "die Tochter", R.drawable.family_daughter));
        words.add(new Word("দাদা / বড় ভাই (dada / boro bhai)", "älterer Bruder", R.drawable.family_older_brother));
        words.add(new Word("ছোট ভাই  (choto bhai)", "jüngerer Bruder", R.drawable.family_younger_brother));
        words.add(new Word("বড় বোন / দিদি (boro bon / didi)", "ältere Schwester", R.drawable.family_older_sister));
        words.add(new Word("ছোট বোন  (choto bon)", "jüngere Schwester", R.drawable.family_younger_sister));
        words.add(new Word("দাদু (dadu)", "der Großvater / Opa", R.drawable.family_grandmother));
        words.add(new Word("দাদী (dadī)", "die großmutter / Oma", R.drawable.family_grandfather));
// Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
// adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
// There should be a {@link ListView} with the view ID called list, which is declared in the
// word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);
// Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
// {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
