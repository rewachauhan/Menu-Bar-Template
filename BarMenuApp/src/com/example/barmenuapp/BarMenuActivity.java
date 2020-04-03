package com.example.barmenuapp;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BarMenuActivity extends Activity {

    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_menu);
        ActionBar ab=getActionBar();
        ab.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bar_menu, menu);
        
        return true;
    }


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		{
			return MenuChoice(item);
		}
	}	
		private boolean MenuChoice(MenuItem item)
		{
			switch (item.getItemId()){
				case R.id.item1:
					Toast.makeText(this, "You clicked on item1", Toast.LENGTH_LONG).show();
					return true;
				case R.id.item2:
					Toast.makeText(this, "You clicked on item2", Toast.LENGTH_LONG).show();
					return true;
				case R.id.item3:
					Toast.makeText(this, "You clicked on item3", Toast.LENGTH_LONG).show();
					return true;
		}
			return false;
		}
	
    
}
