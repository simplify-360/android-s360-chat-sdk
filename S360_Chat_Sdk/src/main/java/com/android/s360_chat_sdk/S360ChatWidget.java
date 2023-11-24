package com.android.s360_chat_sdk;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;

public class S360ChatWidget extends RelativeLayout {

   private WebView webView;

   public S360ChatWidget(Context context) {
      super(context);
      init(context);
   }

   public S360ChatWidget(Context context, AttributeSet attrs) {
      super(context, attrs);
      init(context);
   }

   public S360ChatWidget(Context context, AttributeSet attrs, int defStyleAttr) {
      super(context, attrs, defStyleAttr);
      init(context);
   }

   private void init(Context context) {
      // Initialize the WebView
      webView = new WebView(context);
      // Enable JavaScript in the WebView
      WebSettings webSettings = webView.getSettings();
      webSettings.setJavaScriptEnabled(true);
      RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
              LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
      webView.setLayoutParams(params);

      // Add WebView to the layout
      addView(webView);
   }

   public void loadUrl(String url) {
      webView.loadUrl(url);
   }

}
