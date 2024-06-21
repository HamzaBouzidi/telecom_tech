package com.example.telecomapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class send_or_receive extends AppCompatActivity {

    private Button sendButton;
    private Button receiveButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_or_receive);

        sendButton = findViewById(R.id.send_btn);

        receiveButton = findViewById(R.id.receive_btn);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(send_or_receive.this, saisie_message_tech.class);
                startActivity(intent);
            }
        });

        receiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(send_or_receive.this, messages_tech_list.class);
                startActivity(intent);
            }
        });
    }
}