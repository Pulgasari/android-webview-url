# android-webview-url

Add this to your **AndroidManifest.xml**

```xml
<manifest>

  <uses-permission android:name="android.permission.INTERNET" />
  <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

  <application ...
    android:usesCleartextTraffic="true"
    >
  </application>

</manifest>
```

Use this as template for **MainActivity.java**

```java
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

    // Initialize WebView
    // Read more: https://developer.android.com/guide/webapps/webview
    WebView myWebView = new WebView( getApplicationContext() );
    setContentView(myWebView);

    // WebView: Load URL
    myWebView.loadUrl("https://domain.tld");

    // WebView: Enable JavaScript
    WebSettings myWebViewSettings = myWebView.getSettings();
    myWebViewSettings.setJavaScriptEnabled(true);

  }

}
```
