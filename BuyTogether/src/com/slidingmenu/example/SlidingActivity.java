package com.slidingmenu.example;


import android.content.*;
import android.net.Uri;
import com.slidingmenu.example.InitiateActivity;


public class SlidingActivity{

	public static void goToGitHub(Context context) {
		Uri uriUrl = Uri.parse("http://github.com/jfeinstein10/slidingmenu");
		Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl); 
		context.startActivity(launchBrowser);
	}

	

	
	
}
