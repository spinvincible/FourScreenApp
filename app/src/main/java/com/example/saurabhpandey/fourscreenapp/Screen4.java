package com.example.saurabhpandey.fourscreenapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Screen4 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_screen4, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Button41(View view) {
        Intent iinent= new Intent(Screen4.this,MainActivity.class);
        startActivity(iinent);
    }

    public void Button42(View view) {Intent iinent= new Intent(Screen4.this,Screen2.class);
        startActivity(iinent);
    }

    public void Button43(View view) {Intent iinent= new Intent(Screen4.this,Screen3.class);
        startActivity(iinent);
    }

    public void Button44(View view) {Intent iinent= new Intent(Screen4.this,Screen4.class);
        startActivity(iinent);
    }
}
