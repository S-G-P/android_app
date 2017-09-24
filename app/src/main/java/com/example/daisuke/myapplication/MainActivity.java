package com.example.daisuke.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        WebView  myWebView = (WebView)findViewById(R.id.webView1);
        // 標準ブラウザをキャンセル
        myWebView.setWebViewClient(new WebViewClient());
        // アプリ起動時に読み込むURL
        // myWebView.loadUrl("https://github.com/S-G-P/android_app");
        // ローカルでアプリ立ち上げる場合はこっち
        myWebView.loadUrl("http://10.0.2.2:8080/");
    }
}
