package com.itcuties.android.apps.itcwebviewexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonsActivity extends Activity implements OnClickListener {

	private Button urlButton;
	private Button localButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buttons);
		
		urlButton 	= (Button)findViewById(R.id.urlButton);
		localButton	= (Button)findViewById(R.id.localButton);
		
		urlButton.setOnClickListener(this);
		localButton.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		if (urlButton.isPressed()) {
			Intent i = new Intent(this, URLActivity.class);
			this.startActivity(i);
			
		} else if (localButton.isPressed()) {
			Intent i = new Intent(this, LocalActivity.class);
			this.startActivity(i);
		}
	}

}
