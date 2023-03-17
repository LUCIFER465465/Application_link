package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity19 extends AppCompatActivity {


    WebView ImgAp19;

    String Url = "https://studio.youtube.com/channel/UCgsvdwJ_JL1ycKygSXNUodQ?hl=id&o=U";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        ImgAp19 = findViewById(R.id.ImgAp19);

        WebSettings settings = ImgAp19.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp19.loadUrl(Url);
    }
}