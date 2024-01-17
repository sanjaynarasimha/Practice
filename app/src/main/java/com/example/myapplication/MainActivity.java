package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    // Define a HashMap to store username-password pairs
    private HashMap<String, String> credentials = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        MaterialButton loginbtn = findViewById(R.id.loginbtn);

        // Initialize the HashMap with username-password pairs
        credentials.put("admin", "admin");
        credentials.put("sanjay", "1at21is060");
        credentials.put("varshini", "1at21is076");
        credentials.put("prashita", "1at21is078");
        credentials.put("dhanush", "1at21is034");

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredUsername = username.getText().toString().toLowerCase();
                String enteredPassword = password.getText().toString().toLowerCase();

                // Check if the entered username is in the HashMap and the corresponding password matches
                if (credentials.containsKey(enteredUsername) && enteredPassword.equals(credentials.get(enteredUsername))) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
