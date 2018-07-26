package com.leknos.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);
        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftDice.setImageResource(chooseDice());
                rightDice.setImageResource(chooseDice());
                //Log.d("Dicee", "rollButton has been pressed");
            }
        });
    }

    public int chooseDice(){
        int randomNumber = (int) (Math.random() * 6) + 1; // [0; 6) or [0; 5] (+ 1) == [1; 7) or [1; 6]
        int currentChoice = 0;
        switch (randomNumber) {
            case 1 : currentChoice = R.drawable.dice1; break;
            case 2 : currentChoice = R.drawable.dice2; break;
            case 3 : currentChoice = R.drawable.dice3; break;
            case 4 : currentChoice = R.drawable.dice4; break;
            case 5 : currentChoice = R.drawable.dice5; break;
            case 6 : currentChoice = R.drawable.dice6; break;
        }
        return currentChoice;
    }
}
