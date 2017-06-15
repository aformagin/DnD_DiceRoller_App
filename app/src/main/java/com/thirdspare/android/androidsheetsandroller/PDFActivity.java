package com.thirdspare.android.androidsheetsandroller;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class PDFActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_webtest);
        super.onCreate(savedInstanceState);
        WebView mWebView;
       mWebView = (WebView)findViewById(R.id.wbvTest);
        // Enable Javascript
       WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);



       // mWebView = (WebView)findViewById(R.id.wbvTest);
        mWebView.setWebViewClient(new WebViewClient());
       // mWebView.loadUrl("http://www.thirdspare.com");
        mWebView.loadUrl("https://drive.google.com/open?id=0B6DUBubZyJV9bDlKOGs1N3ZXRTA");

    }
}
