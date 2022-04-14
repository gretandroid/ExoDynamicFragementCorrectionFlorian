package com.example.exodynamicfragementcorrection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ListFragment listFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listFragment = new ListFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame,listFragment)
                .commit();
    }
}