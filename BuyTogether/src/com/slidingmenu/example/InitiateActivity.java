package com.slidingmenu.example;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.*;

import com.actionbarsherlock.view.MenuItem;
import com.slidingmenu.example.R;


public class InitiateActivity extends BaseActivity {
	
	private TableLayout table_initiate;
	
	
	public InitiateActivity() {
		super(R.string.title_bar_content);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// set the Above View
		setContentView(R.layout.home);
		setSlidingActionBarEnabled(true);
		
		//load
		
		table_initiate = (TableLayout) findViewById(R.id.table_initiate);
		table_initiate.setColumnShrinkable(2, true);
		table_initiate.setColumnShrinkable(4, true);
		table_initiate.setColumnShrinkable(6, true);
		table_initiate.setColumnShrinkable(8, true);
		
		for(int i =0;i<30;i++){
			TableRow table_row = new TableRow(this);		
			Button enter = new Button(this);
			TextView initiator = new TextView(this);
			TextView buy = new TextView(this);
			TextView location = new TextView(this);
			TextView dateline = new TextView(this);
			TextView temp1 = new TextView(this);
			TextView temp2 = new TextView(this);
			TextView temp3 = new TextView(this);
			TextView temp4 = new TextView(this);		
			
			enter.setText("進入");
			table_row.addView(enter);
			enter.setOnClickListener(new Button.OnClickListener(){
	            @Override
	        	public void onClick(View v) { 
	            	Intent intent = new Intent();
	            	intent.setClass(InitiateActivity.this, InitiateDetailActivity.class);
	            	startActivity(intent);
	              //MainActivity.this.finish();
	        	}
	        });   
			
			temp1.setText(" ");
			temp1.setTextSize(1);
			table_row.addView(temp1);
			
			initiator.setText("主購者代號");		
			table_row.addView(initiator);
			
			temp2.setText(" ");
			table_row.addView(temp2);
			
			
			buy.setText("商品名稱");		
			table_row.addView(buy);
			
			temp3.setText(" ");
			table_row.addView(temp3);
			
			location.setText("取貨地點");		
			table_row.addView(location);
			
			temp4.setText(" ");
			table_row.addView(temp4);
			
			dateline.setText("截止日期");		
			table_row.addView(dateline);
			
					
			table_initiate.addView(table_row);
			
		}		
	}
	
	
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent = new Intent();
		switch (item.getItemId()) {

			case R.id.initiate:
				
				intent.setClass(InitiateActivity.this, SeekActivity.class);
				startActivity(intent);
				return true;
			case R.id.seek:
				
				intent.setClass(InitiateActivity.this, InitiateActivity.class);
				startActivity(intent);
				return true;
			case R.id.message:
				
				intent.setClass(InitiateActivity.this, MessageActivity.class);
				startActivity(intent);
				return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
