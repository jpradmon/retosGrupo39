package com.example.festejos_v2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Fragment_Servicios extends Fragment {

    Drawable drawable1, drawable2, drawable3;
    ImageView imagen1, imagen2, imagen3;

    View vistS;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vistS = inflater.inflate(R.layout.fragment__servicios, container, false);
        //------------------------------------------------------------------------------------------

        //------------------------------- CARGUE DE IMAGENES DESDE EXPLORADOR ----------------------

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.se1, vistS.getContext().getTheme());

        imagen1 = (ImageView) vistS.findViewById(R.id.imagen1);
        imagen1.setImageDrawable(drawable1);

        //--------------------------------------------------------

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.se2, vistS.getContext().getTheme());

        imagen2= (ImageView) vistS.findViewById(R.id.imagen2);
        imagen2.setImageDrawable(drawable2);

        //--------------------------------------------------------

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.se3, vistS.getContext().getTheme());

        imagen3= (ImageView) vistS.findViewById(R.id.imagen3);
        imagen3.setImageDrawable(drawable3);


        //------------------------------------------------------------------------------------------
        return vistS;
    }
}