package com.example.dog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //LogCat field.
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //LogCat statement.
        Log.d(LOG_TAG, "On create.");

        final Button identifyBreed = (Button) findViewById(R.id.btn_breed);
        Button identifyDog = (Button) findViewById(R.id.btn_dog);
        Button search = (Button) findViewById(R.id.btn_search);

        //Button Identify The Breed.
        identifyBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                startActivity(intent);
                //LogCat statement.
                Log.d(LOG_TAG, "Button clicked, Identify The Breed.");

            }
        });
        //Button Identify The Dog.
        identifyDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IdentifyDog.class);
                startActivity(intent);
                //LogCat statement.
                Log.d(LOG_TAG, "Button clicked, Identify The Dog.");
            }
        });
        //Button Search Dog Breed.
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Search.class);
                startActivity(intent);
                //LogCat statement.
                Log.d(LOG_TAG, "Button clicked, Search Dog Breed.");
            }
        });
    }
}
