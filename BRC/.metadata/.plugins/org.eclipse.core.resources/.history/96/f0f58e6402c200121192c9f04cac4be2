package com.slidingmenu.example;

import java.io.IOException;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.slidingmenu.example.R;
import com.slidingmenu.example.R.id;
import com.slidingmenu.example.R.layout;
import com.slidingmenu.example.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;  
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.*;



public class MainActivity extends Activity {

	private TextView login_error;
	private Button button_login, botton_forget,botton_register;
	Intent intent_forget = new Intent();
	Intent intent_register = new Intent();
	Intent intent_home = new Intent();
	

	
	public String respon(String acc, String pwd)
	{
		DefaultHttpClient client = new DefaultHttpClient();
		
		HttpGet httpGet = new HttpGet("http://54.214.2.253/login.php?acc=" + acc + "&pwd=" + pwd);
		
	//	HttpGet httpGet = new HttpGet("http://10.0.2.2/db.php");
		
		HttpResponse response = null;
		
		StringBuilder temp = new StringBuilder();
		
		try {
			response = client.execute(httpGet);
            HttpEntity entity = response.getEntity();
            Scanner scanner2 = new Scanner(entity.getContent());
			
            while(scanner2.hasNext())
            {
            	temp.append(scanner2.nextLine());
            }
            
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return temp.toString();
		
	}
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        
        button_login = (Button)findViewById(R.id.button_login);
        botton_forget = (Button)findViewById(R.id.button_forget);
        botton_register = (Button)findViewById(R.id.button_register);
        login_error = (TextView)findViewById(R.id.password_error);    
        
        intent_register.setClass(MainActivity.this,MessageActivity.class);
        intent_forget.setClass(MainActivity.this,ForgetActivity.class);
        intent_home.setClass(MainActivity.this,InitiateActivity.class);

        
        button_login.setOnClickListener(new Button.OnClickListener(){ 
            @Override
        	public void onClick(View v) {
            	 
    			EditText acc = (EditText)findViewById(R.id.account);
    			
    			EditText pwd = (EditText)findViewById(R.id.password);
            	
    			String re = respon(acc.getText().toString(), pwd.getText().toString());
    			
    			if(re.equals("yes"))
    				startActivity(intent_home);
    			else 
    			{
    			//	login_error.setText("*****" + re + "*****");
    				login_error.setVisibility(View.VISIBLE); 
    			}
            }         
        });
        
        
        botton_forget.setOnClickListener(new Button.OnClickListener(){ 
            @Override
        	public void onClick(View v) {
          	  startActivity(intent_forget);
          	  //MainActivity.this.finish();
            
            }         
        });
       

        botton_register.setOnClickListener(new Button.OnClickListener(){
            @Override
        	public void onClick(View v) { 
              startActivity(intent_register);
              //MainActivity.this.finish();
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
