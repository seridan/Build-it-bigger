package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.android.androidlibraryjoke.AndroidLibraryJokeActivity;
import com.example.android.jokesprovider.JokesProvider;


public class MainActivity extends AppCompatActivity {

    JokesProvider jokesProvider;
    String joke;
    private static final String JOKE_EXTRA = "jokeExtra";
    EndpointsAsyncTask endpointsAsyncTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void tellJoke(View view) {
       /* jokesProvider = new JokesProvider();
        joke = jokesProvider.tellAJoke();
        //Launch android library activity when the button is clicked
        Intent intent = new Intent(this, AndroidLibraryJokeActivity.class);
        intent.putExtra(JOKE_EXTRA, joke);
        startActivity(intent);*/

       /*endpointsAsyncTask = new EndpointsAsyncTask();
       endpointsAsyncTask.execute(this);*/
    }


}
