package com.example.androidhomework5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Challenge1(View view) {

        Intent intent = new Intent(this, Challenge3.class);
        startActivity(intent);

    }

    public void Challenge2(View view) {

        Intent intent = new Intent(this, Challenge5.class);
        startActivity(intent);
    }

    public void Challenge4 (View view) {

        Intent intent = new Intent(this, Challenge6.class);
        startActivity(intent);
    }
}