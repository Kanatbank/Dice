package com.example.android.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    public ImageView ImageViewDice1;
    public ImageView ImageViewDice2;
    public Random rng = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageViewDice1 = findViewById(R.id.first_dice);
        ImageViewDice2 = findViewById(R.id.second_dice);

    }
    public void onClick(View v) {
        rollDiceOne();
        rollDiceTwo();
    }

    public void rollDiceOne() {
        int randomNumber1 = rng.nextInt(6) + 1;

        switch (randomNumber1) {
            case 1:
                ImageViewDice1.setImageResource(R.drawable.one);
                break;
            case 2:
                ImageViewDice1.setImageResource(R.drawable.two);
                break;
            case 3:
                ImageViewDice1.setImageResource(R.drawable.three);
                break;
            case 4:
                ImageViewDice1.setImageResource(R.drawable.four);
                break;
            case 5:
                ImageViewDice1.setImageResource(R.drawable.five);
                break;
            case 6:
                ImageViewDice1.setImageResource(R.drawable.six);
                break;
        }
    }

    public void rollDiceTwo() {
        int randomNumber2 = rng.nextInt(6) + 1;

        switch (randomNumber2) {
            case 1:
                ImageViewDice2.setImageResource(R.drawable.one);
                break;
            case 2:
                ImageViewDice2.setImageResource(R.drawable.two);
                break;
            case 3:
                ImageViewDice2.setImageResource(R.drawable.three);
                break;
            case 4:
                ImageViewDice2.setImageResource(R.drawable.four);
                break;
            case 5:
                ImageViewDice2.setImageResource(R.drawable.five);
                break;
            case 6:
                ImageViewDice2.setImageResource(R.drawable.six);
                break;
        }
    }
}