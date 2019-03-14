package com.example.androidhomework5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Challenge3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_button_app);

    }

    public void displayFirstParagraph (View view) {

        Intent intent =  new Intent(this, ScrollView.class);
        intent.putExtra(getString(R.string.no_content), getString(R.string.text_one_paragraph));
        startActivity(intent);

    }

    public void displaySecondParagraph (View view) {

        Intent intent =  new Intent(this, ScrollView.class);
        intent.putExtra(getString(R.string.no_content), getString(R.string.text_two_paragraph));
        startActivity(intent);

    }

    public void displayThreeParagraph (View view) {

        Intent intent =  new Intent(this, ScrollView.class);
        intent.putExtra(getString(R.string.no_content), getString(R.string.text_three_paragraph));
        startActivity(intent);

    }

}
