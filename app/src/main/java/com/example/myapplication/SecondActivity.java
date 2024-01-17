package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Button for Sunday
        Button sunButton = findViewById(R.id.sun);
        sunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

        // Button for Monday
        Button monButton = findViewById(R.id.mon);
        monButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class); // Replace FourthActivity with the actual class for Monday
                startActivity(intent);
            }
        });

        // Button for Tuesday
        Button tueButton = findViewById(R.id.tue);
        tueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class); // Replace FifthActivity with the actual class for Tuesday
                startActivity(intent);
            }
        });

        // Button for Wednesday
        Button wedButton = findViewById(R.id.wed);
        wedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class); // Replace SixthActivity with the actual class for Wednesday
                startActivity(intent);
            }
        });

        // Button for Thursday
        Button thrButton = findViewById(R.id.thr);
        thrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class); // Replace SeventhActivity with the actual class for Thursday
                startActivity(intent);
            }
        });

        // Button for Friday
        Button friButton = findViewById(R.id.fri);
        friButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class); // Replace EighthActivity with the actual class for Friday
                startActivity(intent);
            }
        });

        // Button for Saturday
        Button satButton = findViewById(R.id.sat);
        satButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class); // Replace NinthActivity with the actual class for Saturday
                startActivity(intent);
            }
        });

        // TextView for user1
        TextView userTextView = findViewById(R.id.user1);
        userTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

