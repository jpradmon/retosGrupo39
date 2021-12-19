package com.example.festejos_v4.Controlador;
/**
 * Importamos clase y librerias necesarias
 */

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.example.festejos_v4.R;
import com.example.festejos_v4.Vista.Fragment_Favoritos;
import com.example.festejos_v4.Vista.Fragment_Inicio;
import com.example.festejos_v4.Vista.Fragment_Productos;
import com.example.festejos_v4.Vista.Fragment_Servicios;
import com.example.festejos_v4.Vista.Fragment_Sucursales;

/**
 * Creamos la clase principal y heredados de AppCompatActivity
 */
public class MainActivity extends AppCompatActivity {
    /**
     * Creamos e instanciamos variable de tipo Fragment
     */
    Fragment subPantalla1,
            subPantalla2,
            subPantalla3,
            subPantalla4,
            subPantallaInicio;
    /**
     * Creamos una variable de tipo FragmentTransaction
     */
    FragmentTransaction intercambio;
    /**
     * Creamos variable de tipo Button
     */
    Button boton1,
            boton2,
            boton3;

    /**
     * Creación del método onCreate llamado a la layout principal
     * @param savedIns
     */
    @Override
    protected void onCreate(Bundle savedIns) {
        super.onCreate(savedIns);
        setContentView(R.layout.activity_main);

        subPantalla1 = new Fragment_Productos();
        subPantalla2 = new Fragment_Servicios();
        subPantalla3 = new Fragment_Sucursales();
        subPantalla4 = new Fragment_Favoritos();
        subPantallaInicio = new Fragment_Inicio();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor_fragments, subPantallaInicio).commit();

        boton1 = (Button)findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            /**
             * Creamos el método onClick llamado subPantalla1
             * @param view
             */
            @Override
            public void onClick(View view) {
                intercambio = getSupportFragmentManager().beginTransaction();
                intercambio.replace(R.id.contenedor_fragments, subPantalla1).commit();
            }
        });

        boton2 = (Button)findViewById(R.id.boton2);
        boton2.setOnClickListener(new View.OnClickListener() {
            /**
             * Creamos el método onClick llamado subPantalla2
             * @param view
             */
            @Override
            public void onClick(View view) {
                intercambio = getSupportFragmentManager().beginTransaction();
                intercambio.replace(R.id.contenedor_fragments, subPantalla2).commit();
            }
        });

        boton3 = (Button)findViewById(R.id.boton3);
        boton3.setOnClickListener(new View.OnClickListener() {
            /**
             * Creamos el método onClick llamado subPantalla3
             * @param view
             */
            @Override
            public void onClick(View view) {
                intercambio = getSupportFragmentManager().beginTransaction();
                intercambio.replace(R.id.contenedor_fragments, subPantalla3).commit();
            }
        });

    }

    //****************************************** MENU DE OPCIONES ***************************************************

    /**
     * Método onCreateOptionsMenu llamado al menu de opciones
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    /**
     * Creamos el método onOptionsItemSelected llamamos la opcion de selecion de menu
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int ident = item.getItemId();
        if (ident == R.id.opcion1){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla4).commit();
        }
        if (ident == R.id.opcion2){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla1).commit();
        }
        if (ident == R.id.opcion3){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla2).commit();
        }
        if (ident == R.id.opcion4){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla3).commit();
        }
        return super.onOptionsItemSelected(item);
    }
    //*****************************************************************************************************************

}