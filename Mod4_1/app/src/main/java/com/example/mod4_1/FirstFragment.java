package com.example.mod4_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    private Spinner pizza_list;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_first, container, false);

        pizza_list = (Spinner)view.findViewById(R.id.pizzaList);

        // Create array with pizza choices.
        List<String> pizza_choices = new ArrayList<String>();
        pizza_choices.add("Ham and Pineapple");
        pizza_choices.add("Supreme");
        pizza_choices.add("Seafood");
        pizza_choices.add("Meatlovers");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, pizza_choices);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pizza_list.setAdapter(adapter);
        pizza_list.setSelected(false);

        pizza_list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), String.format("OnSelectedListener:\r\nPizza List: %s", String.valueOf(pizza_list.getSelectedItem())), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return view;
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

}