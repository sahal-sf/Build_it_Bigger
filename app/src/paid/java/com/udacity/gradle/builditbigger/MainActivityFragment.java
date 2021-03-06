package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.fragment.app.Fragment;

import com.udacity.gradle.builditbigger.androidlib.MainActivityLib;

public class MainActivityFragment extends Fragment {

    public boolean testFlag = false;
    ProgressBar progressBar = null;
    public String Joke = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main_activity, container, false);

        Button button = root.findViewById(R.id.joke_btn);
        progressBar = root.findViewById(R.id.joke_progressbar);
        progressBar.setVisibility(View.GONE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                getJoke();
            }
        });

        return root;
    }

    public void getJoke() {
        new EndpointAsyncTask().execute(this);
    }

    public void displayJokeActivity() {
        if (!testFlag) {
            Intent intent = new Intent(getActivity(), MainActivityLib.class);
            intent.putExtra("JOKE", Joke);
            getActivity().startActivity(intent);
            progressBar.setVisibility(View.GONE);
        }
    }
}
