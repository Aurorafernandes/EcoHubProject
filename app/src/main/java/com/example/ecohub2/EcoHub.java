package com.example.ecohub2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EcoHub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_hub);

        Button button1 = (Button) findViewById(R.id.btnSlevels);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(EcoHub.this, Sealevels.class ));
                //go to the ecohub activity

            }
        });

        Button button2 = (Button) findViewById(R.id.btnInfo);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(EcoHub.this, com.example.ecohub2.information.class ));
                //go to the ecohub activity

            }
        });

        Button button3 = (Button) findViewById(R.id.btnBarcode);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(EcoHub.this, com.example.ecohub2.barcodeScan.class ));
                //go to the ecohub activity

            }
        });


        Button button4 = (Button) findViewById(R.id.btnPollution);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(EcoHub.this, com.example.ecohub2.AirPollution.class ));
                //go to the ecohub activity

            }
        });
    }
}