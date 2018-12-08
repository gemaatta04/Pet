package com.example.user.virtualpet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        /* Displays the name set in activity_setup */
        TextView nameTextView = findViewById(R.id.nameTextView);
        String setName = getIntent().getStringExtra("nameView");
        nameTextView.setText(setName);
        final Pet pet = new Pet(setName);

        /* Displays the pet type. */
        final ImageView typeDisplayIV = findViewById(R.id.typeDisplayIV);

        /* Displays the happy and health points in appropriate TextViews */
        final TextView happyPointsTV = findViewById(R.id.happyPointsTV);
        final TextView healthPointsTV = findViewById(R.id.healthPointsTV);

        Button feedBtn = (Button) findViewById(R.id.feedBtn);
        feedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Changes the points displayed at the top. */
                pet.feed();
                happyPointsTV.setText(pet.getHappy() + "");
                healthPointsTV.setText(pet.getHealth() + "");

                /* *************** TIMER FUNCTION TO CHANGE IMAGE GOES HERE ************ */

                /* Changes the main image to the new level if levelUp returns true. */
                if (pet.levelUp(pet.getType())) {
                    if ((pet.getType()).equals("Level Two")) {
                        typeDisplayIV.setImageDrawable(getDrawable(R.drawable.leveltwo));
                    }
                    if ((pet.getType()).equals("Level Three")) {
                        typeDisplayIV.setImageDrawable(getDrawable(R.drawable.levelthree));
                    }
                }
            }
        });

        Button cleanBtn = findViewById(R.id.cleanBtn);
        cleanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Changes the points displayed at the top. */
                pet.clean();
                happyPointsTV.setText(pet.getHappy() + "");
                healthPointsTV.setText(pet.getHealth() + "");

                /* *************** TIMER FUNCTION TO CHANGE IMAGE GOES HERE ************ */

                /* Changes the main image to the new level if levelUp returns true. */
                if (pet.levelUp(pet.getType())) {
                    if ((pet.getType()).equals("Level Two")) {
                        typeDisplayIV.setImageDrawable(getDrawable(R.drawable.leveltwo));
                    }
                    if ((pet.getType()).equals("Level Three")) {
                        typeDisplayIV.setImageDrawable(getDrawable(R.drawable.levelthree));
                    }
                }
            }
        });

        Button playBtn = findViewById(R.id.playBtn);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Changes the points displayed at the top. */
                pet.play();
                happyPointsTV.setText(pet.getHappy() + "");
                healthPointsTV.setText(pet.getHealth() + "");

                /* *************** TIMER FUNCTION TO CHANGE IMAGE GOES HERE ************ */

                /* Changes the main image to the new level if levelUp returns true. */
                if (pet.levelUp(pet.getType())) {
                    if ((pet.getType()).equals("Level Two")) {
                        typeDisplayIV.setImageDrawable(getDrawable(R.drawable.leveltwo));
                    }
                    if ((pet.getType()).equals("Level Three")) {
                        typeDisplayIV.setImageDrawable(getDrawable(R.drawable.levelthree));
                    }
                }
            }
        });
    }
}
