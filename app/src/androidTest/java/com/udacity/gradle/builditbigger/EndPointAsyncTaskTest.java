package com.udacity.gradle.builditbigger;

import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {

    @Test
    public void testDoInBackground() {
        String response = null;

        try {
            com.udacity.gradle.builditbigger.free.MainActivityFragment fragment = new com.udacity.gradle.builditbigger.free.MainActivityFragment();
            fragment.testFlag = true;
            new EndpointAsyncTask().execute((Runnable) fragment);
            Thread.sleep(5000);
            assertTrue("Error: get Joke = " + fragment.loadedJoke, fragment.loadedJoke != null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

