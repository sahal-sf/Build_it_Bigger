package com.udacity.gradle.builditbigger.androidlib;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityLib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lib);

        String jokeExtra = getIntent().getStringExtra("JOKE");
        TextView displayTextView = findViewById(R.id.jokeTextView);
        displayTextView.setText(jokeExtra);
    }
}
