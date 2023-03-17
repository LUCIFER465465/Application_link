package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity7 extends AppCompatActivity {

    WebView ImgAp7;

    String Url = "https://www.google.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        ImgAp7= findViewById(R.id.ImgAp7);

        WebSettings settings = ImgAp7.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp7.loadUrl(Url);
    }
}