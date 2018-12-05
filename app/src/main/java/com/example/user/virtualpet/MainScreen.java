package com.example.user.virtualpet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        Button feed = (Button) findViewById(R.id.feed);
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //display a new image for a certain amount of time
            }
        });
        /*
        Button addName = (Button) findViewById(R.id.addName);
        addName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set input as the name
                EditText setName = (EditText) findViewById(R.id.setName);
                Pet pet = new Pet(setName.getText().toString());
            }
        });
         */
    }
}
