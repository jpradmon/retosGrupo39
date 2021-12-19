package com.example.festejos_v3.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.festejos_v3.Controlador.MainActivity;
import com.example.festejos_v3.R;

public class SplashScreen extends AppCompatActivity implements Runnable {


    Thread hilo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        ImageView fiesta = (ImageView) findViewById(R.id.fiesta);
        fiesta.setBackgroundResource(R.drawable.fiesta);

        AnimationDrawable ejecutarAnimacion = (AnimationDrawable) fiesta.getBackground();
        ejecutarAnimacion.start();


        hilo1 = new Thread(this);
        hilo1.start();


    }


    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            Intent pasarPantalla = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(pasarPantalla);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
}