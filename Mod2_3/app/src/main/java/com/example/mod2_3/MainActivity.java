package com.example.mod2_3;

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

    public void calculate(View view) {
        EditText editText = findViewById(R.id.editText);
        Double radius = Double.parseDouble(editText.getText().toString());

        Double area = Math.PI * radius * radius;
        TextView textView = findViewById((R.id.textView));

        textView.setText(Double.toString(area));
    }
}