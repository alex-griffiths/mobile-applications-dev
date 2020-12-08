package com.example.mod2_4;

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
        EditText name = findViewById(R.id.editName);
        EditText age = findViewById(R.id.editAge);
        EditText height = findViewById(R.id.editHeight);
        Double height_val = Double.parseDouble(height.getText().toString());
        EditText weight = findViewById(R.id.editWeight);
        Double weight_val = Double.parseDouble(weight.getText().toString());
        TextView response = findViewById(R.id.response);

        Double bmi = weight_val / height_val / height_val * 10000;
        String indication;

        Integer age_val = Integer.parseInt(age.getText().toString());

        if ((age_val < 50 && (bmi > 17 && bmi < 26)) || (age_val >= 50 && (bmi > 21 && bmi < 27))) {
            indication = "You are in good condition";
        } else {
            indication = "You are not in good condition";
        }

        String output = String.format("Hello %s\r\nYour BMI value is: %.2f\r\nIndication: %s", name.getText().toString(), bmi, indication);
        response.setText(output);
    }
}