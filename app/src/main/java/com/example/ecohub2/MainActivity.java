package com.example.ecohub2;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        //new RetrieveFeedTask().execute(urlToRssFeed);
        Button button1 = (Button) findViewById(R.id.button);
        TextView tv1 = (TextView) findViewById(R.id.hello);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                tv1.setText("You made a good choice.");
                startActivity(new Intent(MainActivity.this, EcoHub.class ));
                //go to the ecohub activity


            }
        });

    }
}