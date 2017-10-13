package com.example.zimja.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = (Button) findViewById(R.id.BtnOne);
        Button buttonTwo = (Button) findViewById(R.id.btnTwo);
        Button buttonThree = (Button) findViewById(R.id.btnThree);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sends the user to the designated webpage
               /* String url = "http://www.google.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

               //Sends the url text to apps
                String url = "I like pie.";
                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, url);
                i.setType("text/plain");
                startActivity(i);*/
                String title = "Project one title";
                String description = "Project one";
                String url = "http://www.google.com";

                Intent intent = new Intent(MainActivity.this, ProjectDetails.class);
                intent.putExtra("title", title);
                intent.putExtra("description", description);
                intent.putExtra("image", R.drawable.cow);
                intent.putExtra("url", url);
                startActivity(intent);

            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = "Project Two title";
                String description = "Project Two";
                String url = "http://www.imgur.com";

                Intent intent = new Intent(MainActivity.this, ProjectDetails.class);
                intent.putExtra("title", title);
                intent.putExtra("description", description);
                intent.putExtra("image", R.drawable.cow2);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = "Project Three title";
                String description = "Project Three";
                String url = "http://www.yahoo.com";

                Intent intent = new Intent(MainActivity.this, ProjectDetails.class);
                intent.putExtra("title", title);
                intent.putExtra("description", description);
                intent.putExtra("image", R.drawable.cow3);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });
    }
}
