package com.example.funkiddoquizzes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
    }

    public void yearo(View view) {
        Intent i = new Intent(this, MainActivity11.class);
        startActivity(i);
    }

    public void yearf(View view) {
        Intent i = new Intent(this, MainActivity5.class);
        startActivity(i);
    }
}
