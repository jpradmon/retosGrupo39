package com.example.festejos_v2;
/**
 * Importamos clases y librerias necesarias para el proyecto
 */
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Creación clase principal y heredamos de AppCompatActivity
 */
public class MainActivity extends AppCompatActivity {
    /**
     * Declaramos e instanciamos clases y declaramos variables
     */
    Drawable drawable1;
    /**
     * Declaramos variable tipo ImageView
     */
    ImageView imagen1;
    /**
     * Instanciamos variable tipo Fragment
     */
    Fragment subPantalla1,
             subPantalla2,
             subPantalla3,
             subPantalla4,
             subPantallaInicio;
    FragmentTransaction intercambio;
    /**
     * Instanciamos variable tipo Button
     */
    Button boton1,
           boton2,
           boton3;

    /**
     * Creación método para hacer llamado a activity_main
     * @param savedIns
     */
    @Override
    protected void onCreate(Bundle savedIns) {
        super.onCreate(savedIns);
        setContentView(R.layout.activity_main);
        /**
         * Asignación de imagen
         */
        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.logo, getTheme());
        imagen1 = (ImageView) findViewById(R.id.imagen5);
        imagen1.setImageDrawable(drawable1);

        /**
         * Instansación de Fragments
         */
        subPantalla1 = new Fragment_Productos();
        subPantalla2 = new Fragment_Servicios();
        subPantalla3 = new Fragment_Sucursales();
        subPantalla4 = new Fragment_Favoritos();
        subPantallaInicio = new Fragment_Inicio();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor_fragments, subPantallaInicio).commit();

        boton1 = (Button)findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            /**
             * Método onClick para llamara a subPantalla1(Fragment Productos)
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
             *Método onClick para llamara a subPantalla2(Fragment Servicios)
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
             * Método onClick para llamara a subPantalla3(Fragment Sucursales)
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
     * Método del menu opciones
     * @param menu
     * @return boolean true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    /**
     * Método para la seleccion de opciones del menu
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int ident = item.getItemId();
        if (ident == R.id.opcion1){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla1).commit();
        }
        if (ident == R.id.opcion2){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla2).commit();
        }
        if (ident == R.id.opcion3){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla3).commit();
        }
        if (ident == R.id.opcion4){
            intercambio = getSupportFragmentManager().beginTransaction();
            intercambio.replace(R.id.contenedor_fragments, subPantalla4).commit();
        }
        return super.onOptionsItemSelected(item);
    }
    //*****************************************************************************************************************

}