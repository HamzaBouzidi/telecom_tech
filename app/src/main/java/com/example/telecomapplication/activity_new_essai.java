package com.example.telecomapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class activity_new_essai extends AppCompatActivity {

    private Button avancementTachesButton;
    private Button ajouterTacheButton;


    private ImageView profilImg ;
    private ImageView messageImg ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_essai);

        avancementTachesButton = findViewById(R.id.avancement_taches_btn);
        ajouterTacheButton = findViewById(R.id.ajouter_tache_btn);
        profilImg = findViewById(R.id.profil_img);
        messageImg = findViewById(R.id.message_img);

        avancementTachesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_new_essai.this, activity_tache.class);
                startActivity(intent);
            }
        });

        ajouterTacheButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_new_essai.this, activity_ajouter_tache.class);
                startActivity(intent);
            }
        });


        profilImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_new_essai.this, profil.class);
                startActivity(intent);
            }
        });

        messageImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_new_essai.this, message.class);
                startActivity(intent);
            }
        });

    }


}