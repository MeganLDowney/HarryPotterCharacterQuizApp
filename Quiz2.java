package com.example.serenitysoundsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Quiz2 extends AppCompatActivity {
    int selectedCharacter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_foreground);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final RadioButton rad21 = findViewById(R.id.rad21);
        final RadioButton rad22 = findViewById(R.id.rad22);
        final RadioButton rad23 = findViewById(R.id.rad23);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        final Button btnNext1 = (Button)findViewById(R.id.btnNext1);
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rad21.isChecked()) {
                    selectedCharacter2 = 1;
                }
                else if (rad22.isChecked()) {
                    selectedCharacter2 = 2;
                }
                else if (rad23.isChecked()) {
                    selectedCharacter2 = 3;
                }
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("second", selectedCharacter2);
                editor.commit();
                startActivity(new Intent(Quiz2.this, Quiz3.class));
            }
        });
    }
}