package com.example.cinemabyte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    public static final String TAG = "LoginActivity";
    private EditText etUsername;
    private EditText etPassword;
//    private EditText etState;
//    private EditText etEmail;
//    private EditText etZipcode;
    private Button btnLogin;
    private Button btnRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
//        etState = findViewById(R.id.etState);
//        etEmail = findViewById(R.id.etEmail);
//        etZipcode = findViewById(R.id.etZipcode);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick login button");
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
//                String email = etEmail.getText().toString();
//                String state = etState.getText().toString();
                loginUser(username,password);
            }
        });

    }
    private void loginUser(String username, String password){
        //ToDo: navigation to main activity if the user has signed in properly

    }
}