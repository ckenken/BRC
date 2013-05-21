package com.slidingmenu.example;

import java.io.IOException;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.slidingmenu.example.R;
import com.slidingmenu.example.R.layout;
import com.slidingmenu.example.R.menu;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.view.*;  
import android.widget.Button;
import android.widget.EditText;




public class RegisterActivity extends Activity {
	private Button submit;
	Intent intent_home = new Intent();

	public String respon(String acc, String pwd, String email)
	{
		DefaultHttpClient client = new DefaultHttpClient();
		
		HttpGet httpGet = new HttpGet("http://54.214.2.253/register.php?acc=" + acc + "&pwd=" + pwd + "&mail=" + email);
		
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
        setContentView(R.layout.register);
        submit = (Button)findViewById(R.id.register_ok);
        intent_home.setClass(RegisterActivity.this,InitiateActivity.class);
        
        submit.setOnClickListener(new Button.OnClickListener(){
            @Override
        	public void onClick(View v) { 
              
    			EditText acc = (EditText)findViewById(R.id.register_account);
    			
    			EditText pwd = (EditText)findViewById(R.id.register_password);
            	
    			EditText mail = (EditText)findViewById(R.id.register_mail);
    			
    			String re = respon(acc.getText().toString(), pwd.getText().toString(), mail.getText().toString());
              
    			if(re.equals("no"))
    			{
    				// 帳號被申請過了
    				
    			}
    			else 
    			{
    				
    				startActivity(intent_home);
    			}
    			
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
