package com.thirdspare.android.androidsheetsandroller;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class AboutActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_about_web);
        super.onCreate(savedInstanceState);
        WebView mWebView;
        mWebView = (WebView)findViewById(R.id.wbvAbout);
        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);



        // mWebView = (WebView)findViewById(R.id.wbvTest);
        mWebView.setWebViewClient(new WebViewClient());
        // mWebView.loadUrl("http://www.thirdspare.com");
        mWebView.loadUrl("http://thirdspare.com/index.php/about/");//Opens the about page at ThirdSpare

    }
}
