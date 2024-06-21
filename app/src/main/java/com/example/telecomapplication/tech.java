package com.example.telecomapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class tech extends AppCompatActivity {

    private Button verifierTacheButton;
    private ImageView profilTechButton;
    private ImageView messagetechButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);

        verifierTacheButton = findViewById(R.id.verfier_tache_btn);

        messagetechButton = findViewById(R.id.message_tech_img);


        profilTechButton = findViewById(R.id.profil_tech_img);


        verifierTacheButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(tech.this, mestachestech.class);
                startActivity(intent);
            }
        });

        messagetechButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(tech.this, send_or_receive.class);
                startActivity(intent);
            }
        });


        profilTechButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(tech.this, profiltech.class);
                startActivity(intent);
            }
        });


    }
}