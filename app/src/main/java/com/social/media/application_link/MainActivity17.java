package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity17 extends AppCompatActivity {

    WebView ImgAp17;

    String Url = "https://gaana.com/playlist/sksujauddin2ganacomsongs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        ImgAp17 = findViewById(R.id.ImgAp17);

        WebSettings settings = ImgAp17.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);

        ImgAp17.loadUrl(Url);
    }
}