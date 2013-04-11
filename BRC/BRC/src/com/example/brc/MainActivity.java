package com.example.brc;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;  
import android.widget.Button;
import android.widget.TextView;
import android.content.*;



public class MainActivity extends Activity {

	private TextView login_error;
	private Button button_index_login, botton_index_forget,botton_index_register;
	Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        
        button_index_login = (Button)findViewById(R.id.button_login);
        botton_index_forget = (Button)findViewById(R.id.button_forget);
        botton_index_register = (Button)findViewById(R.id.button_register);
        login_error = (TextView)findViewById(R.id.password_error);    
    	intent.setClass(MainActivity.this,ForgetActivity.class);

        
        button_index_login.setOnClickListener(new Button.OnClickListener(){ 
            @Override
        	public void onClick(View v) {
            	login_error.setVisibility(View.VISIBLE);  
            }         
        });
        
        
        botton_index_forget.setOnClickListener(new Button.OnClickListener(){ 
            @Override
        	public void onClick(View v) {
 
          	  startActivity(intent);
          	  MainActivity.this.finish();
            
            }         
        });
       

        botton_index_register.setOnClickListener(new Button.OnClickListener(){
            @Override
        	public void onClick(View v) { 
        	  setContentView(R.layout.register);
        	}
        });         
        
    }
    



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action  bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    
}