package com.example.mod4_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    private Spinner pizza_list;
    private ListView list;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        // Create array of pizza choices
        List<String> pizza_choices = new ArrayList<String>();
        pizza_choices.add("Ham and Pineapple");
        pizza_choices.add("Supreme");
        pizza_choices.add("Seafood");
        pizza_choices.add("Meatlovers");

        // Get the list element
        list = (ListView)view.findViewById(R.id.listView);

        // Apply an addapter to the list with the pizza choices array as content
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), R.layout.pizza_list, R.id.label, pizza_choices);
        list.setAdapter(adapter);

        // Listen for click on the list view.
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String)list.getAdapter().getItem(position);
                Toast.makeText(getActivity(), String.format("%s selected", item), Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}