package com.example.festejos;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.festejos.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    Drawable drawable1, drawable2, drawable3;
    ImageView imagen1, imagen2, imagen3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imagen1 = (ImageView) findViewById(R.id.imagen1);
        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Esta función se implementará en la siguiente versión", Toast.LENGTH_LONG ).show();
            }
        });

        imagen2 = (ImageView) findViewById(R.id.imagen2);
        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Esta función se implementará en la siguiente versión", Toast.LENGTH_LONG ).show();
            }
        });

        imagen3 = (ImageView) findViewById(R.id.imagen3);
        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Esta función se implementará en la siguiente versión", Toast.LENGTH_LONG ).show();
            }
        });

//****************************************************************
        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.pr1, getTheme());

        imagen1 = (ImageView) findViewById(R.id.imagen1);
        imagen1.setImageDrawable(drawable1);

//****************************************************************
        Resources res2= getResources();
        drawable2 = res2.getDrawable(R.drawable.pr2, getTheme());

        imagen2 = (ImageView) findViewById(R.id.imagen2);
        imagen2.setImageDrawable(drawable2);
//****************************************************************
        Resources res3= getResources();
        drawable3 = res3.getDrawable(R.drawable.pr3, getTheme());

        imagen3 = (ImageView) findViewById(R.id.imagen3);
        imagen3.setImageDrawable(drawable3);


    }

}