package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    // Define a HashMap to store lowercase username-password pairs
    private HashMap<String, String> credentials = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usernameEditText = findViewById(R.id.username);
        EditText passwordEditText = findViewById(R.id.password);

        MaterialButton loginbtn = findViewById(R.id.loginbtn);

        // Initialize the HashMap with lowercase username-password pairs
        credentials.put("admin", "admin");
        credentials.put("sanjay", "1at21is060");
        credentials.put("varshini", "1at21is076");
        credentials.put("prashita", "1at21is078");
        credentials.put("dhanush", "1at21is034");

        usernameEditText.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_NEXT) {
                passwordEditText.requestFocus();
                return true;
            }
            return false;
        });

        passwordEditText.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE || actionId == KeyEvent.KEYCODE_ENTER) {
                performLogin();
                return true;
            }
            return false;
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performLogin();
            }
        });
    }

    private void performLogin() {
        EditText usernameEditText = findViewById(R.id.username);
        EditText passwordEditText = findViewById(R.id.password);

        String enteredUsername = usernameEditText.getText().toString().toLowerCase();
        String enteredPassword = passwordEditText.getText().toString();

        // Check if the entered username is in the HashMap and the corresponding password matches
        if (credentials.containsKey(enteredUsername) && enteredPassword.equals(credentials.get(enteredUsername))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
        }
    }
}
