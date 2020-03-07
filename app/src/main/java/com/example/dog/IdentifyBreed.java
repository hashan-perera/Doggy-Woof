package com.example.dog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class IdentifyBreed extends AppCompatActivity {
    //LogCat field.
    private static final String LOG_TAG = IdentifyBreed.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify_breed);

        //LogCat statement.
        Log.d(LOG_TAG, ">IdentifyBreed");

        //Creating objects.
        Images image = new Images();
        final Names name = new Names();
        ImageView imageView_dog = findViewById(R.id.imageView_dog1);
        final Spinner spinner_breed = findViewById(R.id.spinner_breed);
        final TextView textView_status1 = findViewById(R.id.textView_status1);
        final TextView textView_name1 = findViewById(R.id.textView_name1);
        final Button button_submit1 = findViewById(R.id.button_submit1);

        //Random method used to randomize the imageArray.
        Random randomImageGenerator = new Random();
        final int number = randomImageGenerator.nextInt(120);
        imageView_dog.setImageResource(image.imageArray[number]);


        //ArrayAdapter used to add names to the spinner.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentifyBreed.this, android.R.layout.simple_spinner_dropdown_item, name.nameArray);
        spinner_breed.setAdapter(adapter);

        //On item selected listener to get user's selection.
        spinner_breed.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //OnClick Listner.
                button_submit1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int name_index = spinner_breed.getSelectedItemPosition();
                        int image_index = number;

                        //Result logic.
                        for (int i = 0; i < 1000; i++) {
                            //nameArray [0]
                            if (name_index == 0 && image_index <= 9) {

                                //LogCat statement.
                                Log.d(LOG_TAG, "Correct answer.");

                                textView_status1.setText("CORRECT!");
                                textView_status1.setTextColor(Color.GREEN);
                                button_submit1.setText("Next");

                                button_submit1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });
                            }
                            //nameArray [1]
                            else if (name_index == 1 && image_index >= 10 && image_index <= 19) {

                                //LogCat statement.
                                Log.d(LOG_TAG, "Correct answer.");

                                textView_status1.setText("CORRECT!");
                                textView_status1.setTextColor(Color.GREEN);
                                button_submit1.setText("Next");

                                button_submit1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });

                            }
                            //nameArray [2]
                            else if (name_index == 2 && image_index >= 20 && image_index <= 29) {

                                //LogCat statement.
                                Log.d(LOG_TAG, "Correct answer.");

                                textView_status1.setText("CORRECT!");
                                textView_status1.setTextColor(Color.GREEN);
                                button_submit1.setText("Next");

                                button_submit1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });

                            }
                            //nameArray [3]
                            else if (name_index == 3 && image_index >= 30 && image_index <= 39) {

                                //LogCat statement.
                                Log.d(LOG_TAG, "Correct answer.");

                                textView_status1.setText("CORRECT!");
                                textView_status1.setTextColor(Color.GREEN);
                                button_submit1.setText("Next");

                                button_submit1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });

                            }
                            //nameArray [4]
                            else if (name_index == 4 && image_index >= 40 && image_index <= 49) {

                                //LogCat statement.
                                Log.d(LOG_TAG, "Correct answer.");

                                textView_status1.setText("CORRECT!");
                                textView_status1.setTextColor(Color.GREEN);
                                button_submit1.setText("Next");

                                button_submit1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });

                            }
                            //nameArray [5]
                            else if (name_index == 5 && image_index >= 50 && image_index <= 59) {

                                //LogCat statement.
                                Log.d(LOG_TAG, "Correct answer.");

                                textView_status1.setText("CORRECT!");
                                textView_status1.setTextColor(Color.GREEN);
                                button_submit1.setText("Next");

                                button_submit1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });

                            }
                            //nameArray [6]
                            else if (name_index == 6 && image_index >= 60 && image_index <= 69) {

                                //LogCat statement.
                                Log.d(LOG_TAG, "Correct answer.");

                                textView_status1.setText("CORRECT!");
                                textView_status1.setTextColor(Color.GREEN);
                                button_submit1.setText("Next");

                                button_submit1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });

                            }
                            //nameArray [7]
                            else if (name_index == 7 && image_index >= 60 && image_index <= 79) {

                                //LogCat statement.
                                Log.d(LOG_TAG, "Correct answer.");

                                textView_status1.setText("CORRECT!");
                                textView_status1.setTextColor(Color.GREEN);
                                button_submit1.setText("Next");

                                button_submit1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });

                            }
                            //nameArray [8]
                            else if (name_index == 8 && image_index >= 80 && image_index <= 89) {

                                //LogCat statement.
                                Log.d(LOG_TAG, "Correct answer.");

                                textView_status1.setText("CORRECT!");
                                textView_status1.setTextColor(Color.GREEN);
                                button_submit1.setText("Next");

                                button_submit1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });

                            }
                            //nameArray [9]
                            else if (name_index == 9 && image_index >= 90 && image_index <= 99) {

                                //LogCat statement.
                                Log.d(LOG_TAG, "Correct answer.");

                                textView_status1.setText("CORRECT!");
                                textView_status1.setTextColor(Color.GREEN);
                                button_submit1.setText("Next");

                                button_submit1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });

                            }
                            //nameArray [10]
                            else if (name_index == 10 && image_index >= 100 && image_index <= 109) {

                                //LogCat statement.
                                Log.d(LOG_TAG, "Correct answer.");

                                textView_status1.setText("CORRECT!");
                                textView_status1.setTextColor(Color.GREEN);
                                button_submit1.setText("Next");

                                button_submit1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });

                            }
                            //nameArray [11]
                            else if (name_index == 11 && image_index >= 110 && image_index <= 119) {

                                //LogCat statement.
                                Log.d(LOG_TAG, "Correct answer.");

                                textView_status1.setText("CORRECT!");
                                textView_status1.setTextColor(Color.GREEN);
                                button_submit1.setText("Next");

                                button_submit1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });

                            } else {
                                //LogCat statement.
                                Log.d(LOG_TAG, "Wrong answer.");

                                textView_status1.setText("WRONG!");
                                textView_status1.setTextColor(Color.RED);
                                button_submit1.setText("Next");

                                //Display correct answer.
                                if (image_index <= 9) {
                                    textView_name1.setText(name.nameArray[0]);
                                } else if (image_index <= 19) {
                                    textView_name1.setText(name.nameArray[1]);
                                } else if (image_index <= 29) {
                                    textView_name1.setText(name.nameArray[2]);
                                } else if (image_index <= 39) {
                                    textView_name1.setText(name.nameArray[3]);
                                } else if (image_index <= 49) {
                                    textView_name1.setText(name.nameArray[4]);
                                } else if (image_index <= 59) {
                                    textView_name1.setText(name.nameArray[5]);
                                } else if (image_index <= 69) {
                                    textView_name1.setText(name.nameArray[6]);
                                } else if (image_index <= 79) {
                                    textView_name1.setText(name.nameArray[7]);
                                } else if (image_index <= 89) {
                                    textView_name1.setText(name.nameArray[8]);
                                } else if (image_index <= 99) {
                                    textView_name1.setText(name.nameArray[9]);
                                } else if (image_index <= 109) {
                                    textView_name1.setText(name.nameArray[10]);
                                } else {
                                    textView_name1.setText(name.nameArray[11]);
                                }

                                button_submit1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(getApplicationContext(), IdentifyBreed.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                });
                            }
                        }
                    }
                });
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
