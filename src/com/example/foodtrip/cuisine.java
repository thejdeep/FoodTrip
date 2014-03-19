package com.example.foodtrip;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class cuisine extends Activity{
	TextView tv;Button b1,b2,b3,b4,b5,b6;

	public void onCreate(Bundle saved)
	{
		super.onCreate(saved);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		overridePendingTransition(R.anim.rl, R.anim.lr);
		setContentView(R.layout.cuisine);
		tv=(TextView)findViewById(R.id.textView1);
		Typeface typ=Typeface.createFromAsset(getAssets(), "fonts/HELVETICANEUELTCOM-THEXO.TTF");
		tv.setTypeface(typ);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
		b5=(Button)findViewById(R.id.button5);
		b6=(Button)findViewById(R.id.button6);
		Typeface tywp=Typeface.createFromAsset(getAssets(), "fonts/HELVETICANEUELTCOM-THEX.TTF");
		b1.setTypeface(tywp);
		b2.setTypeface(tywp);
		b3.setTypeface(tywp);
		b4.setTypeface(tywp);
		b5.setTypeface(tywp);
		b6.setTypeface(tywp);
		
		
	}
}
