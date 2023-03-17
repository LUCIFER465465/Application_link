package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity20 extends AppCompatActivity {

    WebView ImgAp20;

    String Url = "https://www.snapchat.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        ImgAp20 = findViewById(R.id.ImgAp20);

        WebSettings settings = ImgAp20.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp20.loadUrl(Url);

    }
}