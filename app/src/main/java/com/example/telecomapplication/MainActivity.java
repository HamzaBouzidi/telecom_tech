package com.example.telecomapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // Initialize signInButton after setContentView
        signInButton = findViewById(R.id.SignIn_btn);

        // Set OnClickListener for signInButton
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity_new_essai when signInButton is clicked
               // Intent intent = new Intent(MainActivity.this, activity_new_essai.class);
                //startActivity(intent);
                Intent intent = new Intent(MainActivity.this, tech.class);
                startActivity(intent);
            }
        });

    }
}
