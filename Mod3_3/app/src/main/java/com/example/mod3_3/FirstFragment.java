package com.example.mod3_3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {
    TextView resp;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragmen

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        resp = (TextView)view.findViewById(R.id.res);
//        ham = (CheckBox)view.findViewById(R.id.checkBox_Ham);
//        p_apple = (CheckBox)view.findViewById(R.id.checkBox_Pineapple);
//        anchovies = (CheckBox)view.findViewById(R.id.checkBox_Anchovies);
//        olives = (CheckBox)view.findViewById(R.id.checkBox_Olives);


    }
}