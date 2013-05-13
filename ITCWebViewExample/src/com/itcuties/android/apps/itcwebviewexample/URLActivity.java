package com.itcuties.android.apps.itcwebviewexample;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class URLActivity extends Activity {

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);
		
		WebView webView = (WebView)findViewById(R.id.webView);

		webView.setInitialScale(1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.getSettings().setLoadWithOverviewMode(true);
		webView.getSettings().setUseWideViewPort(true);
		webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
		webView.setScrollbarFadingEnabled(false);
		
		webView.loadUrl("http://www.itcuties.com");
		
	}
	
}
