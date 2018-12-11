package com.example.user.virtualpet;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;

public class MainScreen extends AppCompatActivity {

    Timer timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        timer = new Timer();
        /*timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (pet.getType().equals("Level One")) {
                    typeDisplayIV.setImageDrawable(getDrawable(R.drawable.clean1));
                } else if (pet.getType().equals("Level Two")) {
                    typeDisplayIV.setImageDrawable(getDrawable(R.drawable.clean2));
                } else if (pet.getType().equals("Level Three")) {
                    typeDisplayIV.setImageDrawable(getDrawable(R.drawable.clean3));
                }
                finish();
            }
        }, 3000);*/
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
                    if (pet.getType().equals("Level One")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.feed1));
                        } else if (pet.getType().equals("Level Two")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.feed2));
                        } else if (pet.getType().equals("Level Three")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.feed3));
                        }
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if (pet.getType().equals("Level One")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.levelone));
                        }
                        if ((pet.getType()).equals("Level Two")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.leveltwo));
                        }
                        if ((pet.getType()).equals("Level Three")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.levelthree));
                        }
                        //finish();
                    }
                }, 3000);

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
                /*Runnable r = new Runnable(){
                    public void run(){
                        if (pet.getType().equals("Level One")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.clean1));
                        } else if (pet.getType().equals("Level Two")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.clean2));
                        } else if (pet.getType().equals("Level Three")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.clean3));
                        }

                    }
                };
                typeDisplayIV.postDelayed(r,3000); // set first time for 3 seconds*/
                if (pet.getType().equals("Level One")) {
                    typeDisplayIV.setImageDrawable(getDrawable(R.drawable.clean1));
                } else if (pet.getType().equals("Level Two")) {
                    typeDisplayIV.setImageDrawable(getDrawable(R.drawable.clean2));
                } else if (pet.getType().equals("Level Three")) {
                    typeDisplayIV.setImageDrawable(getDrawable(R.drawable.clean3));
                }

                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if (pet.getType().equals("Level One")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.levelone));
                        }
                        if ((pet.getType()).equals("Level Two")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.leveltwo));
                        }
                        if ((pet.getType()).equals("Level Three")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.levelthree));
                        }
                        //finish();
                    }
                }, 3000);


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
                    if (pet.getType().equals("Level One")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.play1));
                        } else if (pet.getType().equals("Level Two")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.play2));
                        } else if (pet.getType().equals("Level Three")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.play3));
                        }
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if (pet.getType().equals("Level One")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.levelone));
                        }
                        if ((pet.getType()).equals("Level Two")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.leveltwo));
                        }
                        if ((pet.getType()).equals("Level Three")) {
                            typeDisplayIV.setImageDrawable(getDrawable(R.drawable.levelthree));
                        }
                        //finish();
                    }
                }, 3000);

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
