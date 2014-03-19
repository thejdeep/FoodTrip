package com.example.foodtrip;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.Window;

public class nearby extends FragmentActivity{
	public void onCreate(Bundle saved)
	{
		super.onCreate(saved);
		overridePendingTransition(R.anim.rl, R.anim.lr);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.nearby);
	
	}
	public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
	}
}
