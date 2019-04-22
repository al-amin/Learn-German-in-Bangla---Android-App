package com.example.android.learngermaninbangla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the number list
        TextView numberTextView = (TextView) findViewById(R.id.numbers);

        // Find the View that shows the family list
        TextView familyTextView = (TextView) findViewById(R.id.family);

        // Find the View that shows the colors list
        TextView colorsTextView = (TextView) findViewById(R.id.colors);

        // Find the View that shows the phrases list
        TextView phrasesTextView = (TextView) findViewById(R.id.phrases);

        // Set a click listener on that numberTextView
        numberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberListIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberListIntent);
            }
        });

        // Set a click listener on that familyTextView
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // Set a click listener on that colorsTextView
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        // Set a click listener on that phrasesTextView
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }

//    public void openNumberList(View view) {
////        Intent numberListIntent = new Intent(MainActivity.this, NumbersActivity.class );
////        startActivity(numberListIntent);
//        Context context = getApplicationContext();
//        CharSequence text = "Hello toast!";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();
//    }


}