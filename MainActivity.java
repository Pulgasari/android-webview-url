package com.example.myfirstapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);

    // Hide HeaderBar
    this.getSupportActionBar().hide();

    // V1:
    //setContentView(R.layout.activity_main);
    //WebView myWebView = (WebView) findViewById(R.id.webview);

    // V2: Made on the fly (https://developer.android.com/guide/webapps/webview)
    WebView myWebView = new WebView( getApplicationContext() );
    setContentView(myWebView);

    // Load URL
    myWebView.loadUrl("http://domain.tld");

    // Enable JavaScript
    WebSettings myWebViewSettings = myWebView.getSettings();
    myWebViewSettings.setJavaScriptEnabled(true);

  }

}
