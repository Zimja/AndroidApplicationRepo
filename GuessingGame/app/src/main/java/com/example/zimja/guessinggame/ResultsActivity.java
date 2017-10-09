package com.example.zimja.guessinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultsActivity extends AppCompatActivity
{

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        locateViews();

        if(getIntent().hasExtra(GuessingActivity.intentTag))
        {
            String message = getIntent().getStringExtra(GuessingActivity.intentTag);
            textView.setText(message);
        }

        bindFunctionality();
    }

    void locateViews()
    {
        textView = (TextView) findViewById(R.id.guessNumber);
        button = (Button) findViewById(R.id.resultsButton);
    }

    void bindFunctionality()
    {
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LandingActivity.class);
                startActivity(intent);
            }
        });
    }
}
