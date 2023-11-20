package com.android.s360_chat_sdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = getIntent().getStringExtra("url");

        WebView webView = findViewById(R.id.webView);
        assert url != null;
        webView.loadUrl(url);
    }
}