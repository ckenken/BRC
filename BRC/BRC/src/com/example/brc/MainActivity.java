package com.example.brc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.*;  
import android.widget.TextView;



public class MainActivity extends Activity {

	private TextView login_error;
	private TextView mail_error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
    
    }
    public void login(View view){
    	login_error = (TextView)findViewById(R.id.password_error); 
    	login_error.setVisibility(View.VISIBLE);  
    	  //setContentView(R.layout.home);
    }
    public void password_forget(View view){
    	  setContentView(R.layout.forget);
    }
    
    public void mail_error(View view){
    	mail_error = (TextView)findViewById(R.id.mail_error); 
    	mail_error.setVisibility(View.VISIBLE);  
    	  //setContentView(R.layout.home);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action  bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    
}
