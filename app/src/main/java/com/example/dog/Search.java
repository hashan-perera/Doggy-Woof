package com.example.dog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Search extends AppCompatActivity {

    private static final String LOG_TAG = Search.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //LogCat statement.
        Log.d(LOG_TAG, ">Search");
    }
}
