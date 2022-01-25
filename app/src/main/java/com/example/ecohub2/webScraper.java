
package com.example.ecohub2;

import android.os.AsyncTask;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;


public class webScraper extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_scraper);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.btnView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new doIT().execute();
            }
        });
    }
    public class doIT extends AsyncTask<Void,Void,Void> {
        String words;
        @Override
        protected Void doInBackground(Void... params) {
            try {
                Document document = Jsoup.connect("https://waqi.info/#/c/45.237/-10.748/4.9z").get();
                words = document.text();
            } catch (IOException e) {
                e.printStackTrace();
            } return null;
        }
        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            textView.setText(words);
        }
    }
}