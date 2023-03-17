package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity12 extends AppCompatActivity {


    WebView ImgAp12;

    String Url = "https://sharechat.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        ImgAp12 = findViewById(R.id.ImgAp12);

        WebSettings settings = ImgAp12.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp12.loadUrl(Url);
    }
}