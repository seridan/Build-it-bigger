package com.example.android.androidlibraryjoke;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_library_joke);

        jokeTv = findViewById(R.id.android_library_tv);

        tellJoke();
    }

    /**
     * This method use the java library to fetch the joke through jokesProvider method.
     */
    public void tellJoke() {
        jokesProvider = new JokesProvider();
        joke = jokesProvider.tellAJoke();
        jokeTv.setText(joke);
        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
    }
}
