package com.example.funkiddoquizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity9 extends AppCompatActivity {

    ImageView imgGp;
    ImageView imgGm;
    ImageView imgPa;
    ImageView imgMa;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        imgGp = findViewById(R.id.imageView);
        imgGm = findViewById(R.id.imageView2);
        imgPa = findViewById(R.id.imageView15);
        imgMa = findViewById(R.id.imageView16);

        imgGp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity9.this, R.raw.grandpa);
                mp.start();

                return false;
            }
        });

        imgGm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity9.this, R.raw.grandma);
                mp.start();

                return false;
            }
        });

        imgPa.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity9.this, R.raw.dad);
                mp.start();

                return false;
            }
        });

        imgMa.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity9.this, R.raw.mom);
                mp.start();

                return false;
            }
        });
    }

    public void nextNex(View view) {
        Intent i = new Intent(this, MainActivity10.class);
        startActivity(i);
    }
}