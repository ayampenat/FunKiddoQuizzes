package com.example.funkiddoquizzes;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity8 extends AppCompatActivity {

    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;
    ImageView img0;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        img6 = findViewById(R.id.imageView8);
        img7 = findViewById(R.id.imageView11);
        img8 = findViewById(R.id.imageView9);
        img9 = findViewById(R.id.imageView12);
        img0 = findViewById(R.id.imageView10);

        img6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity8.this, R.raw.six);
                mp.start();

                return false;
            }
        });

        img7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity8.this, R.raw.seven);
                mp.start();

                return false;
            }
        });

        img8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity8.this, R.raw.eight);
                mp.start();

                return false;
            }
        });

        img9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity8.this, R.raw.nine);
                mp.start();

                return false;
            }
        });

        img0.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity8.this, R.raw.ten);
                mp.start();

                return false;
            }
        });
    }

    public void nextNe(View view) {
        Intent i = new Intent(this, MainActivity4.class);
        startActivity(i);
    }
}