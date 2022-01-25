package com.example.ecohub2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

public class AirPollution extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String URL = "https://api.openweathermap.org/data/2.5/air_pollution?lat=51.5072&lon=0.1276&appid=0140f9110ece5d6477b5ac95aba2020d";
    String URL2 = "";

    String[] cities = {"London", "Paris", "Moscow", "Lisbon", "Berlin", "Madrid", "Rome"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_pollution);


        Spinner spin = (Spinner) findViewById(R.id.cityChoice);
        spin.setOnItemSelectedListener(this);


        TextView co = findViewById(R.id.txtCo);
        TextView no = findViewById(R.id.txtNo);
        TextView no2 = findViewById(R.id.txtNo2);
        TextView o3 = findViewById(R.id.txtO3);
        TextView so2 = findViewById(R.id.txtSo2);
        TextView pm2_5 = findViewById(R.id.txtPm2_5);
        TextView pm10 = findViewById(R.id.txtPm10);
        TextView nh3 = findViewById(R.id.txtNh3);
        TextView airScore = findViewById(R.id.airScoreTxt);
        TextView airIndexChart = findViewById(R.id.airIndexChart);


/*        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest objectRequest = new JsonObjectRequest(
                Request.Method.GET,
                URL,
                null,
                response -> {
                    Log.e("Response", response.toString());
                    String json = response.toString();
                    Gson gson = new Gson();
                    AirPollutionResponse airPollution = gson.fromJson(json, AirPollutionResponse.class);

                    co.setText(String.valueOf(airPollution.getList().get(0).getComponents().getCo()));
                    no.setText(String.valueOf(airPollution.getList().get(0).getComponents().getNo()));
                    no2.setText(String.valueOf(airPollution.getList().get(0).getComponents().getNo2()));
                    o3.setText(String.valueOf(airPollution.getList().get(0).getComponents().getO3()));
                    so2.setText(String.valueOf(airPollution.getList().get(0).getComponents().getSo2()));
                    pm2_5.setText(String.valueOf(airPollution.getList().get(0).getComponents().getPm2_5()));
                    pm10.setText(String.valueOf(airPollution.getList().get(0).getComponents().getPm10()));
                    nh3.setText(String.valueOf(airPollution.getList().get(0).getComponents().getNh3()));

                    airScore.setText(String.valueOf(airPollution.getList().get(0).getMain().getAqi()));

                    switch (String.valueOf(airPollution.getList().get(0).getMain().getAqi())) {
                        case "1":
                            airIndexChart.setText("Good");
                            airIndexChart.setTextColor(Color.GREEN);
                            break;

                        case "2":
                            airIndexChart.setText("Fair");
                            airIndexChart.setTextColor(Color.GREEN);
                            break;

                        case "3":
                            airIndexChart.setText("Moderate");
                            airIndexChart.setTextColor(Color.YELLOW);
                            break;

                        case "4":
                            airIndexChart.setText("Poor");
                            airIndexChart.setTextColor(Color.RED);
                            break;

                        case "5":
                            airIndexChart.setText("Very poor");
                            airIndexChart.setTextColor(Color.RED);
                            break;
                    }

                },
                error -> Log.e("Reponse", error.toString())
        );
        requestQueue.add(objectRequest);*/
        boolean apiCalls = true;
        while (apiCalls) {
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            JsonObjectRequest objectRequest = new JsonObjectRequest(
                    Request.Method.GET,
                    URL,
                    null,
                    response -> {
                        Log.e("Response", response.toString());
                        String json = response.toString();
                        Gson gson = new Gson();
                        AirPollutionResponse airPollution = gson.fromJson(json, AirPollutionResponse.class);

                        co.setText(String.valueOf(airPollution.getList().get(0).getComponents().getCo()));
                        no.setText(String.valueOf(airPollution.getList().get(0).getComponents().getNo()));
                        no2.setText(String.valueOf(airPollution.getList().get(0).getComponents().getNo2()));
                        o3.setText(String.valueOf(airPollution.getList().get(0).getComponents().getO3()));
                        so2.setText(String.valueOf(airPollution.getList().get(0).getComponents().getSo2()));
                        pm2_5.setText(String.valueOf(airPollution.getList().get(0).getComponents().getPm2_5()));
                        pm10.setText(String.valueOf(airPollution.getList().get(0).getComponents().getPm10()));
                        nh3.setText(String.valueOf(airPollution.getList().get(0).getComponents().getNh3()));

                        airScore.setText(String.valueOf(airPollution.getList().get(0).getMain().getAqi()));

                        switch (String.valueOf(airPollution.getList().get(0).getMain().getAqi())) {
                            case "1":
                                airIndexChart.setText("Good");
                                airIndexChart.setTextColor(Color.GREEN);
                                break;

                            case "2":
                                airIndexChart.setText("Fair");
                                airIndexChart.setTextColor(Color.GREEN);
                                break;

                            case "3":
                                airIndexChart.setText("Moderate");
                                airIndexChart.setTextColor(Color.YELLOW);
                                break;

                            case "4":
                                airIndexChart.setText("Poor");
                                airIndexChart.setTextColor(Color.RED);
                                break;

                            case "5":
                                airIndexChart.setText("Very poor");
                                airIndexChart.setTextColor(Color.RED);
                                break;
                        }




                    },
                    error -> Log.e("Reponse", error.toString())


            );
            requestQueue.add(objectRequest);

            if(!URL.equals(URL2)){
                URL = URL2;
                System.out.println(URL);

            }

            break;
        }






        Button coBtn = (Button) findViewById(R.id.coBtn);
        coBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(AirPollution.this,"Concentration of Carbon Monoxide", Toast.LENGTH_LONG).show();
            }
        });

        Button noBtn = (Button) findViewById(R.id.noBtn);
        noBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(AirPollution.this,"Concentration of Nitrogen Monoxide", Toast.LENGTH_LONG).show();
            }
        });

        Button no2Btn = (Button) findViewById(R.id.no2Btn);
        no2Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(AirPollution.this,"Concentration of Nitrogen Dioxide", Toast.LENGTH_LONG).show();
            }
        });

        Button o3Btn = (Button) findViewById(R.id.o3Btn);
        o3Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(AirPollution.this,"Concentration of Ozone", Toast.LENGTH_LONG).show();
            }
        });


        Button so2Btn = (Button) findViewById(R.id.so2Btn);
        so2Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(AirPollution.this,"Concentration of Sulphur Dioxide", Toast.LENGTH_LONG).show();
            }
        });

        Button pm2_2Btn = (Button) findViewById(R.id.pm2_5Btn);
        pm2_2Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(AirPollution.this,"Concentration of Fine Particle Matter", Toast.LENGTH_LONG).show();
            }
        });

        Button pm10Btn = (Button) findViewById(R.id.pm10Btn);
        pm10Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(AirPollution.this,"Concentration of Course Particle Matter", Toast.LENGTH_LONG).show();
            }
        });

        Button nh3Btn = (Button) findViewById(R.id.nh3Btn);
        nh3Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(AirPollution.this,"Concentration of Ammonia", Toast.LENGTH_LONG).show();
            }
        });




        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item, cities);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(getApplicationContext(), cities[position], Toast.LENGTH_LONG).show();
        //String[] cities = {"London", "Paris", "Moscow", "Lisbon", "Berlin", "Madrid", "Rome"};

        switch(cities[position]) {

            case "London":
                URL2 = "https://api.openweathermap.org/data/2.5/air_pollution?lat=51.5072&lon=0.1276&appid=0140f9110ece5d6477b5ac95aba2020d";
                break;
            case "Paris":
                URL = "https://api.openweathermap.org/data/2.5/air_pollution?lat=48.8566&lon=2.3522&appid=0140f9110ece5d6477b5ac95aba2020d";
                break;
            case "Moscow":
                URL2 = "https://api.openweathermap.org/data/2.5/air_pollution?lat=55.7558&lon=37.6173&appid=0140f9110ece5d6477b5ac95aba2020d";
                break;
            case "Lisbon":
                URL2 = "https://api.openweathermap.org/data/2.5/air_pollution?lat=38.7223&lon=9.1393&appid=0140f9110ece5d6477b5ac95aba2020d";
                break;
            case "Berlin":
                URL2 = "https://api.openweathermap.org/data/2.5/air_pollution?lat=52.5200&lon=13.4050&appid=0140f9110ece5d6477b5ac95aba2020d";
                break;
            case "Madrid":
                URL2 = "https://api.openweathermap.org/data/2.5/air_pollution?lat=40.4168&lon=3.70380&appid=0140f9110ece5d6477b5ac95aba2020d";
                break;
            case "Rome":
                URL2 = "https://api.openweathermap.org/data/2.5/air_pollution?lat=41.9028&lon=12.4964&appid=0140f9110ece5d6477b5ac95aba2020d";
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

