package com.example.foodtrip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainMenu extends Activity {
	
		 
		    // Array of integers points to images stored in /res/drawable-ldpi/
	ImageButton ib1,ib2,ib3,ib4;
		  
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		overridePendingTransition(R.anim.rl, R.anim.lr);
		setContentView(R.layout.test);
		ib1=(ImageButton)findViewById(R.id.imageButton1);
		ib2=(ImageButton)findViewById(R.id.imageButton2);
		ib3=(ImageButton)findViewById(R.id.imageButton3);
		ib4=(ImageButton)findViewById(R.id.imageButton4);
		
		ib4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in=new Intent(MainMenu.this,AboutMe.class);
				startActivity(in);
				
			}
		});
		ib1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(MainMenu.this,cuisine.class);	
			startActivity(i);
			}
		});
		ib2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i =new Intent(MainMenu.this,nearby.class);	
			startActivity(i);
			}
		});
	}
}
