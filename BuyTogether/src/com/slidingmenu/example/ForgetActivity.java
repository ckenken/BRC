package com.slidingmenu.example;

import com.slidingmenu.example.R;
import com.slidingmenu.example.R.id;
import com.slidingmenu.example.R.layout;
import com.slidingmenu.example.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;  
import android.widget.Button;
import android.widget.TextView;



public class ForgetActivity extends Activity {

	private TextView mail_error;
	private Button botton_forget_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.forget);
            
            mail_error = (TextView)findViewById(R.id.mail_error); 

            botton_forget_ok = (Button)findViewById(R.id.forget_ok);
            
            botton_forget_ok.setOnClickListener(new Button.OnClickListener(){
                @Override
            	public void onClick(View v) {           	
                  mail_error.setVisibility(View.VISIBLE);                       
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
