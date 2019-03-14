package com.example.androidhomework5;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Challenge5 extends AppCompatActivity {

    private EditText mEditTextUrl;
    private EditText mEditTextLocation;
    private EditText mEditTextShareText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge5);

        initView();

    }

    private void initView() {
        mEditTextUrl = findViewById(R.id.edit_text_website);
        mEditTextLocation = findViewById(R.id.edit_text_map);
        mEditTextShareText = findViewById(R.id.edit_text_share);
}


    public void openWebsite(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(mEditTextUrl.getText().toString()));
        startActivity(intent);
    }

    public void openMap(View view) {

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.google_navigation_q) + mEditTextLocation.getText().toString()));
        startActivity(intent);
    }

    public void shareText(View view) {

        Intent shareIntent = ShareCompat.IntentBuilder.from(this)
                .setType(getString(R.string.text_plain))
                .setText(mEditTextShareText.getText().toString())
                .getIntent();
        if (shareIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(shareIntent, getString(R.string.empty)));
    }
    }
    }
