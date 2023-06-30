package com.example.serenitysoundsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    MediaPlayer hpSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_foreground);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        hpSong = new MediaPlayer();
        hpSong = MediaPlayer.create(this, R.raw.hp_song);
        hpSong.start();
        TextView textResult = (TextView)findViewById(R.id.txtResult);
        ImageView imgResult = (ImageView)findViewById(R.id.imgResult);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        int selectedCharacter1 = sharedPref.getInt("first", 0);
        int selectedCharacter2 = sharedPref.getInt("second", 0);
        int selectedCharacter3 = sharedPref.getInt("third", 0);
        if (selectedCharacter1 == 1 && selectedCharacter2 == 1 && selectedCharacter3 == 1) {
            textResult.setText("Hermione Granger");
            imgResult.setImageResource(R.drawable.hp_hermione);
        }
        else if (selectedCharacter1 == 1 && selectedCharacter2 == 1 && selectedCharacter3 == 2) {
            textResult.setText("Hermione Granger");
            imgResult.setImageResource(R.drawable.hp_hermione);
        }
        else if (selectedCharacter1 == 1 && selectedCharacter2 == 2 && selectedCharacter3 == 1) {
            textResult.setText("Hermione Granger");
            imgResult.setImageResource(R.drawable.hp_hermione);
        }
        else if (selectedCharacter1 == 2 && selectedCharacter2 == 1 && selectedCharacter3 == 1) {
            textResult.setText("Hermione Granger");
            imgResult.setImageResource(R.drawable.hp_hermione);
        }
        else if (selectedCharacter1 == 1 && selectedCharacter2 == 1 && selectedCharacter3 == 3) {
            textResult.setText("Hermione Granger");
            imgResult.setImageResource(R.drawable.hp_hermione);
        }
        else if (selectedCharacter1 == 1 && selectedCharacter2 == 3 && selectedCharacter3 == 1) {
            textResult.setText("Hermione Granger");
            imgResult.setImageResource(R.drawable.hp_hermione);
        }
        else if (selectedCharacter1 == 3 && selectedCharacter2 == 1 && selectedCharacter3 == 1) {
            textResult.setText("Hermione Granger");
            imgResult.setImageResource(R.drawable.hp_hermione);
        }
        else if (selectedCharacter1 == 1 && selectedCharacter2 == 3 && selectedCharacter3 == 2) {
            textResult.setText("Hermione Granger");
            imgResult.setImageResource(R.drawable.hp_hermione);
        }
        else if (selectedCharacter1 == 2 && selectedCharacter2 == 3 && selectedCharacter3 == 1) {
            textResult.setText("Hermione Granger");
            imgResult.setImageResource(R.drawable.hp_hermione);
        } // END OF HERMIONE RESULTS - BEGINNING OF HARRY RESULTS
        else if (selectedCharacter1 == 1 && selectedCharacter2 == 2 && selectedCharacter3 == 3) {
            textResult.setText("Harry Potter");
            imgResult.setImageResource(R.drawable.harrypotter);
        }
        else if (selectedCharacter1 == 2 && selectedCharacter2 == 1 && selectedCharacter3 == 3) {
            textResult.setText("Harry Potter");
            imgResult.setImageResource(R.drawable.harrypotter);
        }
        else if (selectedCharacter1 == 3 && selectedCharacter2 == 1 && selectedCharacter3 == 2) {
            textResult.setText("Harry Potter");
            imgResult.setImageResource(R.drawable.harrypotter);
        }
        else if (selectedCharacter1 == 3 && selectedCharacter2 == 2 && selectedCharacter3 == 1) {
            textResult.setText("Harry Potter");
            imgResult.setImageResource(R.drawable.harrypotter);
        }
        else if (selectedCharacter1 == 3 && selectedCharacter2 == 3 && selectedCharacter3 == 3) {
            textResult.setText("Harry Potter");
            imgResult.setImageResource(R.drawable.harrypotter);
        }
        else if (selectedCharacter1 == 3 && selectedCharacter2 == 3 && selectedCharacter3 == 1) {
            textResult.setText("Harry Potter");
            imgResult.setImageResource(R.drawable.harrypotter);
        }
        else if (selectedCharacter1 == 3 && selectedCharacter2 == 1 && selectedCharacter3 == 3) {
            textResult.setText("Harry Potter");
            imgResult.setImageResource(R.drawable.harrypotter);
        }
        else if (selectedCharacter1 == 1 && selectedCharacter2 == 3 && selectedCharacter3 == 3) {
            textResult.setText("Harry Potter");
            imgResult.setImageResource(R.drawable.harrypotter);
        }
        else if (selectedCharacter1 == 3 && selectedCharacter2 == 3 && selectedCharacter3 == 2) {
            textResult.setText("Harry Potter");
            imgResult.setImageResource(R.drawable.harrypotter);
        }
        else if (selectedCharacter1 == 3 && selectedCharacter2 == 2 && selectedCharacter3 == 3) {
            textResult.setText("Harry Potter");
            imgResult.setImageResource(R.drawable.harrypotter);
        }
        else if (selectedCharacter1 == 2 && selectedCharacter2 == 3 && selectedCharacter3 == 3) {
            textResult.setText("Harry Potter");
            imgResult.setImageResource(R.drawable.harrypotter);
        } // END OF HARRY RESULTS - BEGINNING OF RON RESULTS
        else if (selectedCharacter1 == 2 && selectedCharacter2 == 2 && selectedCharacter3 == 2) {
            textResult.setText("Ron Weasley");
            imgResult.setImageResource(R.drawable.hp_ron);
        }
        else if (selectedCharacter1 == 2 && selectedCharacter2 == 2 && selectedCharacter3 == 1) {
            textResult.setText("Ron Weasley");
            imgResult.setImageResource(R.drawable.hp_ron);
        }
        else if (selectedCharacter1 == 2 && selectedCharacter2 == 1 && selectedCharacter3 == 2) {
            textResult.setText("Ron Weasley");
            imgResult.setImageResource(R.drawable.hp_ron);
        }
        else if (selectedCharacter1 == 1 && selectedCharacter2 == 2 && selectedCharacter3 == 2) {
            textResult.setText("Ron Weasley");
            imgResult.setImageResource(R.drawable.hp_ron);
        }
        else if (selectedCharacter1 == 2 && selectedCharacter2 == 2 && selectedCharacter3 == 3) {
            textResult.setText("Ron Weasley");
            imgResult.setImageResource(R.drawable.hp_ron);
        }
        else if (selectedCharacter1 == 2 && selectedCharacter2 == 3 && selectedCharacter3 == 2) {
            textResult.setText("Ron Weasley");
            imgResult.setImageResource(R.drawable.hp_ron);
        }
        else if (selectedCharacter1 == 3 && selectedCharacter2 == 2 && selectedCharacter3 == 2) {
            textResult.setText("Ron Weasley");
            imgResult.setImageResource(R.drawable.hp_ron);
        } // END OF RON RESULTS
        Button btnGallery = (Button)findViewById(R.id.btnGallery);
        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Result.this, Gallery.class));
            }
        });
    }
}