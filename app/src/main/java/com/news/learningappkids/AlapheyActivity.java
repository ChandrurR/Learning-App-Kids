package com.news.learningappkids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class AlapheyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alaphey);


        String name = getIntent().getStringExtra("name").toLowerCase();
        ImageView iv = findViewById(R.id.imageView);
        int iid = getResources().getIdentifier(name,"drawable",getPackageName());
        iv.setImageResource(iid);

        int mid = getResources().getIdentifier(name,"raw",getPackageName());
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),mid);
        mp.start();



    }
}