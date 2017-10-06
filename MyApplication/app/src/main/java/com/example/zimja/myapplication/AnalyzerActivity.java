package com.example.zimja.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class AnalyzerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyzer);

        if(getIntent().hasExtra(MainActivity.intentTag))
        {
            String message = getIntent().getStringExtra(MainActivity.intentTag);
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        }

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.cow);

    }
}
