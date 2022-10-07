package com.example.gamecenterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class TicTacToe extends AppCompatActivity {
    private Button [] buttons new Button[9];
    private Button resetGame;
    private int player1score;
    private int player2score;
    private int roundCount;
    private boolean activePlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
    }
}