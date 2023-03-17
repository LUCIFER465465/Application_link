package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity11 extends AppCompatActivity {


    WebView ImgAp11;

    String Url = "https://www.linkedin.com/login";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        ImgAp11 = findViewById(R.id.ImgAp11);

        WebSettings settings = ImgAp11.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp11.loadUrl(Url);
    }
}