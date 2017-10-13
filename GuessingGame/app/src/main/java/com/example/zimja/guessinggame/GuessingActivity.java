package com.example.zimja.guessinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static java.sql.Types.INTEGER;

public class GuessingActivity extends AppCompatActivity
{

    public static String intentTag = "inputData";

    Button button;
    EditText guessEdit;
    //TextView test;
    int randomNumber;
    int numberOfGuesses = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guessing);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;

        locateViews();

        bindFunctionality();
    }

    void locateViews()
    {
        guessEdit = (EditText) findViewById(R.id.guessEdit);
        button = (Button) findViewById(R.id.checkButton);
        //test = (TextView) findViewById(R.id.test);

    }

    void bindFunctionality()
    {
            button.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    int userInput = Integer.parseInt(guessEdit.getText().toString());
                    if(userInput == randomNumber)
                    {
                        numberOfGuesses++;
                        Toast.makeText(GuessingActivity.this, "You got it!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), ResultsActivity.class);
                        String guessText = String.valueOf(numberOfGuesses);
                        intent.putExtra(intentTag, guessText);
                        startActivity(intent);
                    }
                    else
                    {
                        if(userInput > randomNumber)
                        {
                            Toast.makeText(GuessingActivity.this, "Guess is too high!", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(GuessingActivity.this, "Guess is too low!", Toast.LENGTH_SHORT).show();
                        }
                        numberOfGuesses++;
                    }

                    //test.setText("Random: " + randomNumber + ", User: " + userInput + ", Guesses: " + numberOfGuesses);
                }
            });
    }
}
