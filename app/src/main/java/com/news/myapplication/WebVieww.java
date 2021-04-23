package com.news.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;
import android.webkit.WebView;

public class WebVieww extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        web = findViewById(R.id.web);
        web.loadUrl("file:///android_asset/sample.html");
//        String myHtml= "@assets/sample.html";
//        String theHtml = Base64.encodeToString(myHtml.getBytes(), Base64.NO_PADDING);
//        web.loadData(theHtml, "text/html", "base64");

//        web.loadUrl("https://www.google.com");

//        String unencodedHtml =
//                "<html><body>'%28' is the code for '('</body></html>";
//        String encodedHtml = Base64.encodeToString(unencodedHtml.getBytes(), Base64.NO_PADDING);
//        web.loadData(encodedHtml, "text/html", "base64");
    }
}