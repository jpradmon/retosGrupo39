package com.example.festejos_v2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_Inicio extends Fragment {

    View vist;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vist = inflater.inflate(R.layout.fragment__inicio, container, false);
        return vist;
        //------------------------------------------------------------------------------------------


        //------------------------------------------------------------------------------------------
    }
}