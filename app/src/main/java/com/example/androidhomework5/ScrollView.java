package com.example.androidhomework5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScrollView extends AppCompatActivity {

    private TextView mTextViewText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        initView ();

        Bundle extras = getIntent().getExtras();

        if(extras != null){

            String valueSent = extras.getString(getString(R.string.no_content));
            mTextViewText.setText(valueSent);
        }
    }

    private void initView () {

        mTextViewText = findViewById(R.id.no_content);
    }
}
