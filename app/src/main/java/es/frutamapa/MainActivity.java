package es.frutamapa;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
public class MainActivity extends Activity {
  @Override public void onCreate(Bundle b) { super.onCreate(b); WebView w = new WebView(this); w.getSettings().setJavaScriptEnabled(true); w.getSettings().setDomStorageEnabled(true); w.setWebViewClient(new WebViewClient()); w.setWebChromeClient(new WebChromeClient()); setContentView(w); w.loadUrl("file:///android_asset/index.html"); }
}
