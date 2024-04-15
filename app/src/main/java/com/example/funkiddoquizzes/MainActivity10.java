package com.example.funkiddoquizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity10 extends AppCompatActivity {

    ImageView imgBro;
    ImageView imgLils;
    ImageView imgSis;
    ImageView imgLilb;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        imgBro = findViewById(R.id.imageView14);
        imgLils = findViewById(R.id.imageView17);
        imgSis = findViewById(R.id.imageView18);
        imgLilb = findViewById(R.id.imageView19);

        imgBro.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity10.this, R.raw.bigb);
                mp.start();

                return false;
            }
        });

        imgLils.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity10.this, R.raw.lils);
                mp.start();

                return false;
            }
        });

        imgSis.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity10.this, R.raw.lilb);
                mp.start();

                return false;
            }
        });

        imgLilb.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity10.this, R.raw.sis);
                mp.start();

                return false;
            }
        });
    }

    public void nextNex(View view) {
        Intent i = new Intent(this, MainActivity14.class);
        startActivity(i);
    }
}