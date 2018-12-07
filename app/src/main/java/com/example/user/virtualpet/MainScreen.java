package com.example.user.virtualpet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        TextView nameTextView = (TextView) findViewById(R.id.nameTextView);
        String setName = getIntent().getStringExtra("nameView");
        nameTextView.setText(setName);

        Button feedBtn = (Button) findViewById(R.id.feedBtn);
        feedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //display a new image for a certain amount of time
                //Pet.feed();
            }
        });
    }
}
