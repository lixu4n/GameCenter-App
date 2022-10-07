package com.example.gamecenterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText email = findViewById(R.id.emailAddress);
        final EditText password = findViewById(R.id.password);
        final Button loginBtn = findViewById(R.id.loginbtn);
        final TextView signupNowBtn = findViewById(R.id.signupnowbtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String emailtext = email.getText().toString();
                final String passwordTxt = password.getText().toString();

                if(emailtext.isEmpty() || passwordTxt.isEmpty()){
                    Toast.makeText(LoginActivity.this,"Please enter the right credentials", Toast.LENGTH_SHORT).show();
                }
                else{

                }

            }
        });

        signupNowBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });



    }
}