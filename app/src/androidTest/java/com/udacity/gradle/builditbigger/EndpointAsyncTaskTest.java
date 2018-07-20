package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest {

    @Test
    public void testDoInBackground() throws Exception {
        com.udacity.gradle.builditbigger.MainActivityFragment fragment =
                new com.udacity.gradle.builditbigger.MainActivityFragment();
        fragment.testFlag = true;

        new EndpointsAsyncTask().execute(fragment);
        Thread.sleep(5000);

        assertTrue(fragment.retrievedJoke,
                fragment.retrievedJoke != null);
    }
}

