package com.slidingmenu.example;

import com.actionbarsherlock.view.MenuItem;
import com.slidingmenu.example.R;
import com.slidingmenu.example.R.id;
import com.slidingmenu.example.R.layout;
import com.slidingmenu.example.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.*;  
import android.widget.*;



public class SearchActivity extends BaseActivity {

	private TextView mail_error;
	private Button botton_forget_ok;
	
	public SearchActivity() {
		super(R.string.title_bar_content);
	}
	
    @Override
	public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.search);
            
            
            Spinner Spinner_location = (Spinner)findViewById(R.id.location);

            //設定功能表項目陣列，使用createFromResource()

            ArrayAdapter adapter_location = ArrayAdapter.createFromResource(this, R.array.choose_location,

                  android.R.layout.simple_spinner_item);

            //設定選單

            adapter_location.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            //設定adapter

            Spinner_location.setAdapter(adapter_location);
            
            
            
            Spinner Spinner_type = (Spinner)findViewById(R.id.type);

            //設定功能表項目陣列，使用createFromResource()

            ArrayAdapter adapter_type = ArrayAdapter.createFromResource(this, R.array.choose_type,

                  android.R.layout.simple_spinner_item);

            //設定選單

            adapter_type.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            //設定adapter

            Spinner_type.setAdapter(adapter_type);
       
            
        
    }
    
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent = new Intent();
		switch (item.getItemId()) {

			case R.id.initiate:
				
				intent.setClass(SearchActivity.this, SeekActivity.class);
				startActivity(intent);
				return true;
			case R.id.seek:
				
				intent.setClass(SearchActivity.this, InitiateActivity.class);
				startActivity(intent);
				return true;
		}
		return super.onOptionsItemSelected(item);
	}
    


    
    
    
}
