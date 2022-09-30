package com.example.gamecenterapp;

import static com.example.gamecenterapp.R.id.Password;
import static com.example.gamecenterapp.R.id.loginbtn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class SignUpActivity extends AppCompatActivity {

    //Accessing firebase
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://game-center-authentication-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        final EditText fullName = findViewById( R.id.fullName);
        final EditText emailAdd = findViewById( R.id.emailAddress);
        final TextView Password = findViewById( R.id.Password);
        final EditText  confirmPassword = findViewById( R.id.confirmPassword);


        final Button signUp = findViewById(R.id.signUpBtn);
        //final TextView loginBtn = findViewById(loginbtn);


        //get data from the sign up pages
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String fullnameText = fullName.getText().toString();
                final String emailText = emailAdd.getText().toString();
                final String passwordtext = Password.getText().toString();
                final String confpasswword = confirmPassword.getText().toString();


               //user fills fields correctly

                if(fullnameText.isEmpty() || emailText.isEmpty()
                || passwordtext.isEmpty()) {
                    Toast.makeText(SignUpActivity.this,"Please fill all fields", Toast.LENGTH_SHORT).show();
                }

                //check if both pass works if not show message

                else if(!passwordtext.equals(confpasswword)){
                    Toast.makeText(SignUpActivity.this, "Passwords are not matching", Toast.LENGTH_SHORT).show();
                }
                else{


                    //sending to firebase

                    databaseReference.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {

                            if(snapshot.hasChild(emailText)){
                                Toast.makeText(SignUpActivity.this, "Email is already in use.", Toast.LENGTH_SHORT).show();
                            }
                            else{

                                //info sent to RealTime firebase
                                //Email AS UNIQUE IDENTITY

                                databaseReference.child("users").child(emailText).child("fullName").setValue(fullnameText);
                                //databaseReference.child("users").child(emailText).child("email").setValue(emailText);
                                databaseReference.child("users").child(emailText).child("password").setValue(passwordtext);


                                //message
                                Toast.makeText(SignUpActivity.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                                finish();

                            }

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });





                }

            }
        });





    }
}