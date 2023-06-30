package com.example.serenitysoundsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class Gallery extends AppCompatActivity {
    Integer[] images = {R.drawable.harry1, R.drawable.harry2, R.drawable.harry3,
            R.drawable.hermione1, R.drawable.hermione2, R.drawable.hermione3,
            R.drawable.ron1, R.drawable.ron2, R.drawable.ron3};
    ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_foreground);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        GridView grid = (GridView)findViewById(R.id.gridView);
        final ImageView photo = (ImageView)findViewById(R.id.imgPhoto);
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Selected Gallery Image " + (position+1),
                        Toast.LENGTH_SHORT).show();
                photo.setImageResource(images[position]);

            }
        });
        Button btnList = (Button)findViewById(R.id.btnList);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Gallery.this, List.class));
            }
        });

    } // end onCreate
    public class ImageAdapter extends BaseAdapter {
        private Context context;
        public ImageAdapter(Context c){
            context = c;

        }
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            photo = new ImageView(context);
            photo.setImageResource(images[position]);
            photo.setScaleType(ImageView.ScaleType.FIT_XY);
            photo.setLayoutParams(new ViewGroup.LayoutParams(200,200));
            return photo;
        }

    }
} // end MainActivity class