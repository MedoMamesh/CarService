package com.badawy.carservice.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.badawy.carservice.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DeliveryCar_CheckFragment extends Fragment {


    public DeliveryCar_CheckFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_delivery_car_check, container, false);
    }

}