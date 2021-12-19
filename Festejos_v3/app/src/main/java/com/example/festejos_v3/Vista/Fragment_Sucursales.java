package com.example.festejos_v3.Vista;


import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.festejos_v3.R;


public class Fragment_Sucursales extends Fragment {

    Drawable drawable1;
    ImageView imagen1;

    View vist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vist = inflater.inflate(R.layout.fragment__sucursales, container, false);
        //------------------------------------------------------------------------------------------

        //------------------------------- CARGUE DE IMAGENES DESDE EXPLORADOR ----------------------

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.colombia, vist.getContext().getTheme());

        imagen1 = (ImageView) vist.findViewById(R.id.image1);
        imagen1.setImageDrawable(drawable1);


        return vist;
    }
}