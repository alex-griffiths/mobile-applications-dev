package com.example.mod3_3;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        //noinspection SimplifiableIfStatement
        int id = item.getItemId();

        TextView msg = (TextView) findViewById(R.id.res);
        // show message corresponding to each selected item
        switch (item.getItemId()) {
            case R.id.itemHam:
                msg.setText("You have selected Ham");
                return true;
            case R.id.itemPineapple:
                msg.setText("You have selected Pineapple");
                return true;
            case R.id.itemAnchovies:
                msg.setText("You have selected Anchovies");
                return true;
            case R.id.itemOlive:
                msg.setText("You have selected Olives");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}