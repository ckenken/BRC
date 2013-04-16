package com.example.bmi;

import java.text.DecimalFormat;

import db.jdbcmysql;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bmi extends Activity {
	
	public jdbcmysql test = new jdbcmysql(); 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button b1 = (Button)findViewById(R.id.submit);
		b1.setOnClickListener(calcBMI);
	
	}

	private OnClickListener calcBMI = new OnClickListener()
	{
		public void onClick(View v) 
		{
			DecimalFormat nf = new DecimalFormat("0.00");			
			EditText fh = (EditText)findViewById(R.id.height);
			EditText fw = (EditText)findViewById(R.id.weight);
			
			double height = Double.parseDouble(fh.getText().toString())/100.0;
			double weight = Double.parseDouble(fw.getText().toString());
			
			double BMI = weight/(height * height);
			
			TextView result = (TextView)findViewById(R.id.result);
			//result.setText("Your BMI = " + nf.format(BMI));
			
			String s = test.SelectTable2();
			result.setText(s);
			
		}
	};
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	

}
