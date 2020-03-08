package com.example.dog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class IdentifyDog extends AppCompatActivity {

    private static final String LOG_TAG = IdentifyDog.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify_dog);

        //LogCat statement.
        Log.d(LOG_TAG, ">IdentifyDog");

        //Creating objects.
        Images image = new Images();
        Names2 name = new Names2();
        TextView textView_name2 = findViewById(R.id.textView_name2);
        final ImageButton imageButton_dog1 = findViewById(R.id.imageButton_dog1);
        final ImageButton imageButton_dog2 = findViewById(R.id.imageButton_dog2);
        final ImageButton imageButton_dog3 = findViewById(R.id.imageButton_dog3);
        final TextView textView_status2 = findViewById(R.id.textView_status2);
        final Button button_next = findViewById(R.id.button_next);

        //Random method used to randomize the imageButton image.
        Random randomImageGenerator = new Random();

        int num1 = randomImageGenerator.nextInt(120);
        int num2 = randomImageGenerator.nextInt(120);
        int num3 = randomImageGenerator.nextInt(120);

        String name1 = name.nameArray2[num1];
        String name2 = name.nameArray2[num2];
        String name3 = name.nameArray2[num3];

        //LogCat
        Log.d(LOG_TAG, "Dog 1 - " + name1);
        Log.d(LOG_TAG, "Dog 2 - " + name2);
        Log.d(LOG_TAG, "Dog 3 - " + name3);

        //Validating not to repeat the same image twice or thrice.
        if ((num1 == num2 && num2 == num3) && (name1 == name2 && name2 == name3)) {

        } else {
            imageButton_dog1.setImageResource(image.imageArray[num1]);
            imageButton_dog2.setImageResource(image.imageArray[num2]);
            imageButton_dog3.setImageResource(image.imageArray[num3]);
        }

        //Random method used to randomize the dog breed name displayes in the top textView.
        String[] nameArray = {name1, name2, name3};
        Random randomNameGenerator = new Random();
        int randomNameIndex = randomNameGenerator.nextInt(3);
        String randomName = nameArray[randomNameIndex];
        textView_name2.setText(randomName);

        //Result logic.
        //1st imageButton
        if (name1 == randomName) {
            imageButton_dog1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView_status2.setText("CORRECT!");
                    textView_status2.setTextColor(Color.GREEN);
                    imageButton_dog1.setEnabled(false);
                    imageButton_dog2.setEnabled(false);
                    imageButton_dog3.setEnabled(false);
                }
            });
            button_next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), IdentifyDog.class);
                    startActivity(intent);
                    finish();
                }
            });
        } else {
            imageButton_dog1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView_status2.setText("WRONG!");
                    textView_status2.setTextColor(Color.RED);
                    imageButton_dog1.setEnabled(false);
                    imageButton_dog2.setEnabled(false);
                    imageButton_dog3.setEnabled(false);
                }
            });
            button_next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), IdentifyDog.class);
                    startActivity(intent);
                    finish();
                }
            });
        }

        //2nd imageButton
        if (name2 == randomName) {
            imageButton_dog2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView_status2.setText("CORRECT!");
                    textView_status2.setTextColor(Color.GREEN);
                    imageButton_dog1.setEnabled(false);
                    imageButton_dog2.setEnabled(false);
                    imageButton_dog3.setEnabled(false);
                }
            });
            button_next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), IdentifyDog.class);
                    startActivity(intent);
                    finish();
                }
            });
        } else {
            imageButton_dog2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView_status2.setText("WRONG!");
                    textView_status2.setTextColor(Color.RED);
                    imageButton_dog1.setEnabled(false);
                    imageButton_dog2.setEnabled(false);
                    imageButton_dog3.setEnabled(false);
                }
            });
            button_next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), IdentifyDog.class);
                    startActivity(intent);
                    finish();
                }
            });
        }

        //3rd imageButton
        if (name3 == randomName) {
            imageButton_dog3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView_status2.setText("CORRECT!");
                    textView_status2.setTextColor(Color.GREEN);
                    imageButton_dog1.setEnabled(false);
                    imageButton_dog2.setEnabled(false);
                    imageButton_dog3.setEnabled(false);
                }
            });
            button_next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), IdentifyDog.class);
                    startActivity(intent);
                    finish();
                }
            });
        } else {
            imageButton_dog3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView_status2.setText("WRONG!");
                    textView_status2.setTextColor(Color.RED);
                    imageButton_dog1.setEnabled(false);
                    imageButton_dog2.setEnabled(false);
                    imageButton_dog3.setEnabled(false);
                }
            });

            button_next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), IdentifyDog.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }
}
