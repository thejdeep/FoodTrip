package com.example.foodtrip;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class AboutMe extends Activity{
	
	public void onCreate(Bundle test)
	{
		super.onCreate(test);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		overridePendingTransition(R.anim.rl, R.anim.lr);
		setContentView(R.layout.aboutme);
	}

}
