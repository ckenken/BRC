package com.slidingmenu.example;

import com.actionbarsherlock.view.MenuItem;
import com.slidingmenu.example.R;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.*;  




public class SeekDetailActivity extends BaseActivity {


	public SeekDetailActivity() {
		super(R.string.title_bar_content);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seek_detail);
        


        
  
    }
    

	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent = new Intent();
		switch (item.getItemId()) {

			case R.id.initiate:
				
				intent.setClass(SeekDetailActivity.this, SeekActivity.class);
				startActivity(intent);
				return true;
			case R.id.seek:
				
				intent.setClass(SeekDetailActivity.this, InitiateActivity.class);
				startActivity(intent);
				return true;
			
			case R.id.message:
				
				intent.setClass(SeekDetailActivity.this, MessageActivity.class);
				startActivity(intent);
				return true;
				
				
		}
		return super.onOptionsItemSelected(item);
	}
  
}
