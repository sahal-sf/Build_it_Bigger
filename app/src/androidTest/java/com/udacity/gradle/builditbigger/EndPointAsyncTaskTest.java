package com.udacity.gradle.builditbigger;

import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {

    @Test
    public void testDoInBackground() {
        try {
            MainActivityFragment fragment = new MainActivityFragment();
            fragment.testFlag = true;
            new EndpointAsyncTask().execute(fragment);
            Thread.sleep(5000);
            assertTrue("Error: get Joke = " + fragment.Joke, fragment.Joke != null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

