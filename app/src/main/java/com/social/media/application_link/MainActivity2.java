package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity2 extends AppCompatActivity {

    WebView ImgAp2;

    String Url = "https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            ImgAp2 = findViewById(R.id.ImgAp2);

            WebSettings settings = ImgAp2.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);

            ImgAp2.loadUrl(Url);
    }
}