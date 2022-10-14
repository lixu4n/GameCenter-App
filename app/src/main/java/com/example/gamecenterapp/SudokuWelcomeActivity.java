package com.example.gamecenterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SudokuWelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sudoku_welcome_page);

        final Button returnHomeButt =  findViewById(R.id.go_back_home);
        final Button rulesPage = findViewById(R.id.rules);
        final Button start = findViewById(R.id.StartGame1);


        returnHomeButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SudokuWelcomeActivity.this, MainActivity.class));


            }
        });

        rulesPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(SudokuWelcomeActivity.this, SudokuRulesActivity.class));
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(SudokuWelcomeActivity.this, SudokuGameActivity.class));
            }
        });


    }


}