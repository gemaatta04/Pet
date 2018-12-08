package com.example.user.virtualpet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Setup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        /* Begins the game by going to main activity. */
        Button goBtn = (Button) findViewById(R.id.goBtn);
        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Uses input from this screen to set name in the main activity. */
                EditText setNameEditText = findViewById(R.id.setNameEditText);
                    // This doesn't check for invalid inputs. Could maybe add that later.
                final String setName = setNameEditText.getText().toString();

                Intent startGame = new Intent(getApplicationContext(), MainScreen.class);
                startGame.putExtra("nameView", setName);
                startActivity(startGame);
            }
        });
    }
}
