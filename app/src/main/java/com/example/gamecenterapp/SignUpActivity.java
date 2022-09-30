package com.example.gamecenterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        final EditText firstName = findViewById( R.id.firstName);
        final EditText lastName = findViewById( R.id.lastName);
        final EditText emailAdd = findViewById( R.id.emailAddress);
        final EditText password = findViewById( R.id.password);
        final EditText  confirmPassword = findViewById( R.id.confirmPassword);


    }
}