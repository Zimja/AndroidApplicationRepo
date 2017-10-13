package com.example.zimja.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ProjectDetails extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_details);

        TextView title = (TextView) findViewById(R.id.title);
        TextView description = (TextView) findViewById(R.id.description);
        ImageView image = (ImageView) findViewById(R.id.imageView);
        ImageButton projectURL = (ImageButton) findViewById(R.id.projectURL);

        final Intent intent = getIntent();

        String titleText = intent.getStringExtra("title");
        title.setText(titleText);

        String descriptionTitle = intent.getStringExtra("description");
        description.setText(descriptionTitle);

        int projectImage = intent.getIntExtra("image", -1);
        image.setImageResource(projectImage);

        projectURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Sends the user to the designated webpage
                String url = intent.getStringExtra("url");
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });




    }
}
