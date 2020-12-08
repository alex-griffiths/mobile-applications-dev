package com.example.mad_3_1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CheckBox ham, p_apple, anchovies, olives;
    TextView resp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button b = findViewById(R.id.confirmButton);

        resp = (TextView)this.findViewById(R.id.res);
        ham = (CheckBox)this.findViewById(R.id.checkBox_Ham);
        p_apple = (CheckBox)this.findViewById(R.id.checkBox_Pineapple);
        anchovies = (CheckBox)this.findViewById(R.id.checkBox_Anchovies);
        olives = (CheckBox)this.findViewById(R.id.checkBox_Olives);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void show_selection(View view) {
        String response;
        List<String> checked_items = new ArrayList<String>();

        if (ham.isChecked()) {
            checked_items.add("Ham");
        }

        if (p_apple.isChecked()) {
            checked_items.add("Pineapple");
        }

        if (anchovies.isChecked()) {
            checked_items.add("Anchovies");
        }

        if (olives.isChecked()) {
            checked_items.add("Olives");
        }

        response = String.format("Your toppings are %s", String.join(" and ", checked_items));
        resp.setText(response);
    }
}