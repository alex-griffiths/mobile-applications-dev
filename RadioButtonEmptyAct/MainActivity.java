package com.example.hanhvo.radiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    TextView resp;
    RadioButton fivestar, fourstar, threestar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resp = (TextView)this.findViewById(R.id.dispMsg);
        fivestar = (RadioButton)this.findViewById(R.id.radio_fivestar);
        fourstar = (RadioButton)this.findViewById(R.id.radio_fourstar);
        threestar = (RadioButton)this.findViewById(R.id.radio_threestar);
        fivestar.setOnClickListener(myRadioListener);
        fourstar.setOnClickListener(myRadioListener);
        threestar.setOnClickListener(myRadioListener);
    }
    private OnClickListener myRadioListener = new OnClickListener() {
        public void onClick(View v) {
            RadioButton rb = (RadioButton) v;
            resp.setText("The hotel type selected is: " + rb.getText());
        }
    };
}
