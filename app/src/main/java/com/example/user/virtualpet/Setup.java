package com.example.user.virtualpet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Setup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        /* Creates a new Pet instance using input in setNameEditText. */
        EditText setNameEditText = (EditText) findViewById(R.id.setNameEditText);
        final String setName = setNameEditText.getText().toString();
            // This doesn't check for invalid inputs. Could maybe add that later.
        Pet pet = new Pet(setName);

        /* Begins the game by going to main activity. */
        Button goBtn = (Button) findViewById(R.id.goBtn);
        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startGame = new Intent(getApplicationContext(), MainScreen.class);
                startGame.putExtra("nameView", setName);
                startActivity(startGame);
            }
        });
    }
}
