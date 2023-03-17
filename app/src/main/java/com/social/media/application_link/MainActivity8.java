package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity8 extends AppCompatActivity {

    WebView ImgAp8;

    String Url = "https://in.pinterest.com/login/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        ImgAp8 = findViewById(R.id.ImgAp8);

        WebSettings settings = ImgAp8.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp8.loadUrl(Url);
    }
}