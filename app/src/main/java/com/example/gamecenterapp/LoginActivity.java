package com.example.gamecenterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth mauth;
    private Button signupNowBtn, loginBtn;
    private






    final EditText email = findViewById(R.id.emailAddress);
    final EditText password = findViewById(R.id.password);
    //final Button loginBtn = findViewById(R.id.loginbtn);
    //final TextView signupNowBtn = findViewById(R.id.signupnowbtn);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        mauth = FirebaseAuth.getInstance();
        final EditText email = findViewById(R.id.emailAddress);
        final EditText password = findViewById(R.id.password);

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