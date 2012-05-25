package com.isoftpark.helloviews;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class HelloViewsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.mylinearlayout);
        //setContentView(R.layout.mytablelayout);
    
        // +++ Grid Layout +++
        setContentView(R.layout.mygridlayout);
        
        GridView gridView = (GridView)findViewById(R.id.gridview1);
        gridView.setAdapter(new ImageAdapter(this));
        
        gridView.setOnItemClickListener(new OnItemClickListener() {
        	public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {
        		Toast.makeText(HelloViewsActivity.this, "" + pos,	Toast.LENGTH_SHORT).show();
        	}
        });
        // --- Grid Layout ---
    
    }
}