package com.android.s360_chat_sdk

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.RelativeLayout

class S360ChatWidget : RelativeLayout {

    private val webView: WebView

    constructor(context: Context) : super(context) {
        webView = WebView(context)
        initializeWebView()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        webView = WebView(context)
        initializeWebView()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        webView = WebView(context)
        initializeWebView()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initializeWebView() {
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true

        // Add the WebView to the RelativeLayout
        val params = LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.MATCH_PARENT
        )
        addView(webView, params)
    }

    fun init(url: String) {
        webView.loadUrl(url)
    }
}