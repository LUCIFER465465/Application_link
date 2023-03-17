package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity10 extends AppCompatActivity {


    WebView ImgAp10;

    String Url = "https://the-internet.herokuapp.com/login";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        ImgAp10 = findViewById(R.id.ImgAp10);

        WebSettings settings = ImgAp10.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp10.loadUrl(Url);
    }
}