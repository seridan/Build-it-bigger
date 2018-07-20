package com.example.android.androidlibraryjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.jokesprovider.JokesProvider;

public class AndroidLibraryJokeActivity extends AppCompatActivity {

    JokesProvider jokesProvider;
    String joke;
    TextView jokeTv;
    private static final String JOKE_EXTRA = "jokeExtra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_library_joke);

        jokeTv = findViewById(R.id.android_library_tv);

        Intent intent = getIntent();
        joke = intent.getStringExtra(JOKE_EXTRA);
        jokeTv.setText(joke);

        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
    }


   }
