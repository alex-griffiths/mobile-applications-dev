package com.example.mod3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView response;
    RadioButton tomato, bbq, sweet_chilli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        response = (TextView)this.findViewById(R.id.textView2);
        tomato = (RadioButton)this.findViewById(R.id.tomato);
        bbq = (RadioButton)this.findViewById(R.id.bbq);
        sweet_chilli = (RadioButton)this.findViewById(R.id.chilli);

        tomato.setOnClickListener(radio_listener);
        bbq.setOnClickListener(radio_listener);
        sweet_chilli.setOnClickListener(radio_listener);

    }

    private OnClickListener radio_listener = new OnClickListener() {
        public void onClick(View v) {
            RadioButton rb = (RadioButton) v;
            response.setText(String.format("Your sauce is %s", rb.getText()));
        }
    };
}