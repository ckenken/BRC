package com.slidingmenu.example;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.*;
import java.util.*;

import com.actionbarsherlock.view.MenuItem;
import com.slidingmenu.example.R;


public class MessageActivity extends BaseActivity{
	
	
	public MessageActivity() {
		super(R.string.title_bar_content);
	}
	
	class User {
        String username;
        String message;
         
        public User(String username, String message) {
            this.username = username;
            this.message = message;
        }
	}
	
	class UserMessageAdapter extends ArrayAdapter<User> {
        LayoutInflater inflator;
         
        public UserMessageAdapter(Context context) {
            super(context, 0);
            inflator = LayoutInflater.from(context);
        }
         
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = inflator.inflate(android.R.layout.simple_list_item_2, parent, false);
            }
             
            TextView text1 = (TextView)convertView.findViewById(android.R.id.text1);
            TextView text2 = (TextView)convertView.findViewById(android.R.id.text2);
             
            User s = this.getItem(position);
             
            text1.setText(s.username);
            text2.setText("" + s.message);
             
            return convertView;
        }
    }
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.message);
		
		 ListView list = (ListView) findViewById(R.id.listView_message);
		 
		 UserMessageAdapter adapter = new UserMessageAdapter(this);
		 adapter.add(new User("user1","message1"));
		 adapter.add(new User("user2","message2"));
		 adapter.add(new User("user3","message3"));
		 list.setAdapter(adapter);
	 }

	
	
	
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent = new Intent();
		switch (item.getItemId()) {

			case R.id.initiate:
				
				intent.setClass(MessageActivity.this, SeekActivity.class);
				startActivity(intent);
				return true;
			case R.id.seek:
				
				intent.setClass(MessageActivity.this, InitiateActivity.class);
				startActivity(intent);
				return true;
				
			case R.id.message:
				
				intent.setClass(MessageActivity.this, MessageActivity.class);
				startActivity(intent);
				return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
