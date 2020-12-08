package com.example.hanhvo.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    CheckBox c1, c2, c3;
    TextView resp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)this.findViewById(R.id.bill_button);
        resp = (TextView)this.findViewById(R.id.amount);
        c1 = (CheckBox)this.findViewById(R.id.checkBox_Laptop);
        c2 = (CheckBox)this.findViewById(R.id.checkBox_Mouse);
        c3 = (CheckBox)this.findViewById(R.id.checkBox_Keyboard);

        b.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        int totalAmt = 0;
        if (c1.isChecked()) {
            totalAmt = totalAmt + 500;
        }
        if (c2.isChecked()) {
            totalAmt = totalAmt + 25;
        }
        if (c3.isChecked()) {
            totalAmt = totalAmt + 30;
        }
        resp.setText("Total Amount is: $" + totalAmt);
    }
}

