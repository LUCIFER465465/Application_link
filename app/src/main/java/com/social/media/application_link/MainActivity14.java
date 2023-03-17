package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity14 extends AppCompatActivity {


    WebView ImgAp14;

    String Url = "https://www.netflix.com/in/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        ImgAp14 = findViewById(R.id.ImgAp14);

        WebSettings settings = ImgAp14.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp14.loadUrl(Url);
    }
}