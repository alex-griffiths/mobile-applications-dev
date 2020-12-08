package com.example.mod3_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText name_input = view.findViewById(R.id.nameInput);
        EditText age_input = view.findViewById((R.id.ageInput));
        CalendarView cal = view.findViewById(R.id.calendarView);
        TextView resp =  view.findViewById(R.id.response);

        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

                String name = name_input.getText().toString();

                Integer age = Integer.parseInt(age_input.getText().toString());

                resp.setText(String.format("Hello %s, your DOB is: %d/%d/%d.\r\nYour age is %d", name, dayOfMonth, month, year, age));
            }
        });
    }
}