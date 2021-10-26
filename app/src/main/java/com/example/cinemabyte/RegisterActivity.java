package com.example.cinemabyte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    public static final String TAG = "RegisterActivity";
    private EditText regUsername;
    private EditText regPassword;
    private EditText regState;
    private EditText regEmail;
    private EditText regZipcode;
    private Button btnReg;
    private Button btnGoLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        regUsername = findViewById(R.id.etUsername);
        regPassword = findViewById(R.id.etPassword);
        regState = findViewById(R.id.regState);
        regEmail = findViewById(R.id.regEmail);
        regZipcode = findViewById(R.id.regZipcode);
        btnReg = findViewById(R.id.btnReg);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick login button");
                String username = regUsername.getText().toString();
                String password = regPassword.getText().toString();
                String email = regEmail.getText().toString();
                String state = regState.getText().toString();
                String zipcode = regZipcode.getText().toString();
                RegisterUser(username,password, email, state,zipcode);
            }
        });

        btnGoLogin=findViewById(R.id.btnGoLogin);
        btnGoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ToDo: add code for move to login screen
            }
        });
    }

    private void RegisterUser(String username, String password, String email, String state, String zipcode) {


    }
}