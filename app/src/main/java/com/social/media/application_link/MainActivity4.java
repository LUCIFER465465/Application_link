package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity4 extends AppCompatActivity {

    WebView ImgAp4;

    String Url = "https://web.telegram.org/z/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImgAp4 = findViewById(R.id.ImgAp4);

        WebSettings settings = ImgAp4.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp4.loadUrl(Url);
    }
}