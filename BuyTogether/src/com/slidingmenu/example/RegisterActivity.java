package com.slidingmenu.example;

import com.slidingmenu.example.R;
import com.slidingmenu.example.R.layout;
import com.slidingmenu.example.R.menu;

import android.os.Bundle;

import android.app.Activity;
import android.view.*;  




public class RegisterActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action  bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    



    
    
    
}