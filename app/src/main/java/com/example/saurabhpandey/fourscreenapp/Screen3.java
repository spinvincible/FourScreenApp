package com.example.saurabhpandey.fourscreenapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Screen3 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_screen3, menu);
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

    public void Button31(View view) {
        Intent intent = new Intent(Screen3.this, MainActivity.class);
        startActivity(intent);
    }

    public void Button32(View view) {
        Intent intent = new Intent(Screen3.this, Screen2.class);
        startActivity(intent);
    }

    public void Button33(View view) {
        Intent intent = new Intent(Screen3.this, Screen3.class);
        startActivity(intent);
        Toast.makeText(this, "You are on the same Screen", Toast.LENGTH_LONG).show();
    }

    public void Button34(View view) {

        Intent intent = new Intent(Screen3.this, Screen4.class);
        startActivity(intent);
    }
}
