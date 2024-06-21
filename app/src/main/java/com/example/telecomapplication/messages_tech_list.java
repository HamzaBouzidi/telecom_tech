package com.example.telecomapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class messages_tech_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages_tech_list);

        ListView messageList = findViewById(R.id.message_list);

        // List of random messages
        List<String> messages = new ArrayList<>(Arrays.asList(
                "Hello there!",
                "How are you?",
                "This is a random message.",
                "Have a great day!",
                "Random message 1",
                "Random message 2",
                "Random message 3",
                "This is another message.",
                "Keep going!",
                "You're doing great!"
        ));

        // Set up ArrayAdapter to display messages in ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                messages
        );
        messageList.setAdapter(adapter);
    }
}