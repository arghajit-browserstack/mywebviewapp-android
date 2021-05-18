package com.example.mywebviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mWebview;
    private String url = "http://beta.html5test.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebview = (WebView) findViewById(R.id.activity_main_webview);
        WebSettings webSettings = mWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebview.loadUrl(url);
    }
}