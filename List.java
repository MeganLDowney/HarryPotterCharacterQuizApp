package com.example.serenitysoundsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_list);
        String[] menuItems = {"Harry Potter", "Hermione Granger", "Ronald Weasley"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_list, R.id.list, menuItems));
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://harrypotter.fandom.com/wiki/Harry_Potter")));

                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://harrypotter.fandom.com/wiki/Hermione_Granger")));

                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://harrypotter.fandom.com/wiki/Ronald_Weasley")));

                break;

        }
    }
} // end MainActivity