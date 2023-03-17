package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity16 extends AppCompatActivity {


    WebView ImgAp16;

    String Url = "https://open.spotify.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        ImgAp16 = findViewById(R.id.ImgAp16);

        WebSettings settings = ImgAp16.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp16.loadUrl(Url);
    }
}