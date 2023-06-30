package com.example.serenitysoundsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Quiz3 extends AppCompatActivity {
    int selectedCharacter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_foreground);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final RadioButton rad31 = findViewById(R.id.rad31);
        final RadioButton rad32 = findViewById(R.id.rad32);
        final RadioButton rad33 = findViewById(R.id.rad33);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        final Button btnNext2 = (Button)findViewById(R.id.btnNext2);
        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rad31.isChecked()) {
                    selectedCharacter3 = 1;
                }
                else if (rad32.isChecked()) {
                    selectedCharacter3 = 2;
                }
                else if (rad33.isChecked()) {
                    selectedCharacter3 = 3;
                }
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("third", selectedCharacter3);
                editor.commit();
                startActivity(new Intent(Quiz3.this, Result.class));
            }
        });
    }
}