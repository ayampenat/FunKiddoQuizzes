package com.example.funkiddoquizzes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View view) {
        Intent i = new Intent(this, MainActivity15.class);
        startActivity(i);
    }

    public void us(View view) {
        Intent i = new Intent(this, MainActivity12.class);
        startActivity(i);
    }
}
