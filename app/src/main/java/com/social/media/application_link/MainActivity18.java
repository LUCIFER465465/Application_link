package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity18 extends AppCompatActivity {


    WebView ImgAp18;

    String Url = "https://www.google.com/maps";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        ImgAp18 = findViewById(R.id.ImgAp18);

        WebSettings settings = ImgAp18.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp18.loadUrl(Url);
    }
}