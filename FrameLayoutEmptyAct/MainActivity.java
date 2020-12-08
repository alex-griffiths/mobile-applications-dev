package com.example.hanhvo.framelayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView first_image = (ImageView)this.findViewById(R.id.first_image);
        final ImageView second_image = (ImageView)this.findViewById(R.id.second_image);

        first_image.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                second_image.setVisibility(View.VISIBLE);
                v.setVisibility(View.GONE);
            }
        });

        second_image.setOnClickListener (new OnClickListener() {
            public void onClick(View v) {
                first_image.setVisibility(View.VISIBLE);
                v.setVisibility(View.GONE);
            }
        });
    }
}
