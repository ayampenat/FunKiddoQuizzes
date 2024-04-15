package com.example.funkiddoquizzes;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity7 extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        img1 = findViewById(R.id.imageView3);
        img2 = findViewById(R.id.imageView4);
        img3 = findViewById(R.id.imageView5);
        img4 = findViewById(R.id.imageView6);
        img5 = findViewById(R.id.imageView7);

        img1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity7.this, R.raw.one);
                    mp.start();

                    return false;
            }
        });

        img2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity7.this, R.raw.two);
                mp.start();

                return false;
            }
        });

        img3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity7.this, R.raw.three);
                mp.start();

                return false;
            }
        });

        img4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity7.this, R.raw.four);
                mp.start();

                return false;
            }
        });

        img5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                MediaPlayer mp = MediaPlayer.create(MainActivity7.this, R.raw.five);
                mp.start();

                return false;
            }
        });
    }

    public void nextN(View view) {
        Intent i = new Intent(this, MainActivity8.class);
        startActivity(i);
    }
}