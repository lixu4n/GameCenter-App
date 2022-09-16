package com.example.gamecenterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        final EditText fullName = findViewById( R.id.fullName);
        final EditText phoneNumber = findViewById( R.id.phoneNum);
        final EditText emailAdd = findViewById( R.id.emailAddress);
        final EditText password = findViewById( R.id.password);
        final EditText  confirmPassword = findViewById( R.id.confirmPassword);


    }
}