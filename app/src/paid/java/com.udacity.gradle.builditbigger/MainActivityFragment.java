package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android.androidlibraryjoke.AndroidLibraryJokeActivity;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public String retrievedJoke = null;
    private static final String JOKE_EXTRA = "jokeExtra";
    public boolean testFlag = false;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        Button button = root.findViewById(R.id.btn_joke);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                getJoke();
            }
        });


        return root;
    }

    public void getJoke(){
        new EndpointsAsyncTask().execute(this);
    }

    public void startJokeActivity() {
        if (!testFlag) {
            Context context = getActivity();
            Intent intent = new Intent(context, AndroidLibraryJokeActivity.class);
            intent.putExtra(JOKE_EXTRA, retrievedJoke);
            if (context != null) {
                context.startActivity(intent);
            }
        }
    }
}
