package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity15 extends AppCompatActivity {


    WebView ImgAp15;

    String Url = "https://www.resso.com/in/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        ImgAp15 = findViewById(R.id.ImgAp15);

        WebSettings settings = ImgAp15.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp15.loadUrl(Url);
    }
}