package com.example.androphonegap;
import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;


public class MainActivity extends DroidGap {
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    super.init(); // Calling this is necessary to make this work
	    appView.addJavascriptInterface(this, "MainActivity");

	    /* "this" points the to the object of the current activity. "MainActivity" is used to refer "this" object in JavaScript as in Step 3. */

	    super.loadUrl("file:///android_asset/www/index.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	public void customFunctionCalled() {
	    Log.e("Custom Function Called", "Custom Function Called");
	}
	
}
