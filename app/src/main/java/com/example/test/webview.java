package com.example.test;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview extends AppCompatActivity {

    WebView webview;
    String url;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webview = findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        intent = getIntent();
        url = intent.getExtras().getString("url");

        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl(url);
    }
}