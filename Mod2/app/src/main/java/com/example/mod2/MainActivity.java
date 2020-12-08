package com.example.mod2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayText(View view) {
        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);

        String string = editText.getText().toString();
        textView.setText(string);
    }
}