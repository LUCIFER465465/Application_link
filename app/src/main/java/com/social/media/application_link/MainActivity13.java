package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity13 extends AppCompatActivity {


    WebView ImgAp13;

    String Url = "https://share.myjosh.in/profile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        ImgAp13 = findViewById(R.id.ImgAp13);

        WebSettings settings = ImgAp13.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp13.loadUrl(Url);
    }
}