package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity5 extends AppCompatActivity {

    WebView ImgAp5;

    String Url = "https://www.messenger.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ImgAp5 = findViewById(R.id.ImgAp5);

        WebSettings settings = ImgAp5.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp5.loadUrl(Url);
    }
}