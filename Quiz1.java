package com.example.serenitysoundsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Quiz1 extends AppCompatActivity {
    int selectedCharacter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_foreground);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final RadioButton rad1 = findViewById(R.id.rad1);
        final RadioButton rad12 = findViewById(R.id.rad12);
        final RadioButton rad13 = findViewById(R.id.rad13);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        final Button btnNext = (Button)findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rad1.isChecked()) {
                    selectedCharacter1 = 1;
                }
                else if (rad12.isChecked()) {
                    selectedCharacter1 = 2;
                }
                else if (rad13.isChecked()) {
                    selectedCharacter1 = 3;
                }
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("first", selectedCharacter1);
                editor.commit();
                startActivity(new Intent(Quiz1.this, Quiz2.class));
            }
        });
    }
}