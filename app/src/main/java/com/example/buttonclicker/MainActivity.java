package com.example.buttonclicker;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private int timesClicked;
    private Button buttonClickerButton;
    private TextView textViewScore;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timesClicked = 0;

        //wiring widjets links xml to java
        buttonClickerButton = findViewById(R.id.button_main_clicker);
        textViewScore = findViewById(R.id.textView_main_score);
        constraintLayout = findViewById(R.id.constraint_layout_main);

    }


    public void onClickerClicked(View view) {
        timesClicked++;
        
        Toast.makeText(this, "LIAM IS A UNIQUE INDIVIDUAL!!!!!!", Toast.LENGTH_LONG).show();



        textViewScore.setText("Score: " + timesClicked);
        changeBackroundColor();

    }

    private void changeBackroundColor() {

        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);
        constraintLayout.setBackgroundColor(Color.rgb(r, g, b));
        textViewScore.setTextColor(Color.rgb(255 - r, 255 - g, 255- b));
    }
}
