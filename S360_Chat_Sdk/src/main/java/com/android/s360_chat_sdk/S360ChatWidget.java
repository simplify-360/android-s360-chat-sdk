package com.android.s360_chat_sdk;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class S360ChatWidget  {
    private WebView webView;

    public void init(Context context, String url) {
        webView = new WebView(context);

        // Set a WebViewClient to handle redirects and other events
        webView.setWebViewClient(new WebViewClient());

        // Enable JavaScript (optional, depending on your needs)
        webView.getSettings().setJavaScriptEnabled(true);

        // Load the specified URL
        webView.loadUrl(url);

    }
}
