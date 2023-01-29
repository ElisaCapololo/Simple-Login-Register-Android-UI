package com.example.login_and_registration_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MaterialButton buttonLogin = findViewById(R.id.buttonCreateAccount);
        TextView textView = findViewById(R.id.questionSignin);

        TextInputEditText textViewEmail = findViewById(R.id.textInoutEditEmail);
        TextInputEditText textViewPassword = findViewById(R.id.textInoutEditPassword);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = textViewEmail.getText().toString().trim();
                String password = textViewPassword.getText().toString();

                if (email.isEmpty()){
                    textViewEmail.setError("Enter email address");
                    return;
                }
                if (password.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Enter password", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                finish();

            }
        });
    }
}