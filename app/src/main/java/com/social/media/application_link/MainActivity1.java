package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity1 extends AppCompatActivity {

    WebView ImgAp1;

    String Url = "https://www.instagram.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        ImgAp1 = findViewById(R.id.ImgAp1);

        WebSettings settings = ImgAp1.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp1.loadUrl(Url);

    }
}