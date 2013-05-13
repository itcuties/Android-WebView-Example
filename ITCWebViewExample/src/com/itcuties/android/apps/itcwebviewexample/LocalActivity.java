package com.itcuties.android.apps.itcwebviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class LocalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);
		
		StringBuffer data = new StringBuffer();
		data.append("<div>");
		data.append("This is a local text that was set in the application.");
		data.append("<br/>");
		data.append("<a href='http://www.itcuties.com'>Visit itcuties.com</a>");
		data.append("</div>");
		
		WebView webView = (WebView)findViewById(R.id.webView);
		webView.loadData(data.toString(), "text/html", "UTF-8");
	}
	
}
