package com.example.zimja.helloworld;

/**
 * Author Brian Saylor
 * Date 10/04/2017
 */

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //There is code missing here
    TextView textViewFirstName;
    TextView textViewPhoneNumber;
    TextView textViewMessage;

    EditText editTextFirstName;
    EditText editTextPhoneNumber;
    EditText editTextMessage;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View view = findViewById(R.id.button);

        //sets components to variables
        submitButton = (Button) findViewById(R.id.button);
        textViewFirstName = (TextView) findViewById(R.id.textView);
        textViewPhoneNumber = (TextView) findViewById(R.id.textView2);
        textViewMessage = (TextView) findViewById(R.id.textView3);
        editTextFirstName = (EditText) findViewById(R.id.editText);
        editTextPhoneNumber = (EditText) findViewById(R.id.editText2);
        editTextMessage = (EditText) findViewById(R.id.editText3);

        //Changes components text
        textViewFirstName.setText("First Name");
        textViewPhoneNumber.setText("Phone Number");
        textViewMessage.setText("Message");
        editTextFirstName.setHint("Bob");
        editTextPhoneNumber.setHint("1234567890");
        editTextMessage.setHint("Hello World!");

        //changes components text size
        textViewFirstName.setTextSize(18);
        textViewPhoneNumber.setTextSize(18);
        textViewMessage.setTextSize(18);
        editTextFirstName.setTextSize(14);
        editTextPhoneNumber.setTextSize(14);
        editTextMessage.setTextSize(14);

        //Changes components colors
        textViewFirstName.setTextColor(Color.parseColor("#000000"));
        textViewPhoneNumber.setTextColor(Color.parseColor("#000000"));
        textViewMessage.setTextColor(Color.parseColor("#000000"));
        editTextFirstName.setTextColor(Color.parseColor("#989898"));
        editTextPhoneNumber.setTextColor(Color.parseColor("#989898"));
        editTextMessage.setTextColor(Color.parseColor("#989898"));

        //Changes buttons specs
        submitButton.setTextColor(Color.parseColor("#F2F2F2"));
        submitButton.setBackgroundColor(Color.parseColor("#4F4F4F"));

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextFirstName.getText().toString().length() == 0)
                {
                    Toast.makeText(getApplicationContext(), "Please enter a name!",
                            Toast.LENGTH_SHORT).show();
                }
                else if((editTextFirstName.toString().length() != 0) && (editTextFirstName.toString().length() != 0))
                {
                    Toast.makeText(getApplicationContext(), "Hello " + editTextFirstName.getText()+
                            ", " +editTextMessage.getText() +"", Toast.LENGTH_SHORT).show();
                }
            }
        });

        final Button button = (Button) findViewById(R.id.button);
        button.setText("Submit");


        //toast
        //Toast.makeText(getApplicationContext(), "Hello from toast", Toast.LENGTH_SHORT).show();
        //log
        //Log.i("MyTag", "Log Log");
        //snackbar
    }

    public void button_onClick(View view)
    {

    }

}
