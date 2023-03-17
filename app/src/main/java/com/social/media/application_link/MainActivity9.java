package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity9 extends AppCompatActivity {


    WebView ImgAp9;

    String Url = "https://www.google.com/intl/en_in/chrome/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        ImgAp9 = findViewById(R.id.ImgAp9);

        WebSettings settings = ImgAp9.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp9.loadUrl(Url);
    }
}