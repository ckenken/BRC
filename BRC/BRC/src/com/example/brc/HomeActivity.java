package com.example.brc;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;  
import android.widget.*;




public class HomeActivity extends Activity {

	private ImageView more;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.home);
            
        
            
        
    }
    



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action  bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    
}