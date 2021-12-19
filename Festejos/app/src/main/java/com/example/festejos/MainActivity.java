package com.example.festejos;
/**
 * Creado por Jorge E Prada M
 */
/**
 * Importamos librerias
 */
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * creación clase principal
 */
public class MainActivity extends AppCompatActivity {
    /**
     *declaracion de variable drawable
     */
    Drawable drawable1;
    /**
     * declaracion de variable imagen1
     */
    ImageView imagen1;
    /**
     * declaracion de variable boton1
     */
    Button boton1;
    /**
     * creación método para llamar el activity_main
     * @param savedInstan
     */
    @Override
    protected void onCreate(Bundle savedInstan) {
        /**
         * llamamos el método principal
         */
        super.onCreate(savedInstan);
        setContentView(R.layout.activity_main);
        /**
         * validamos y ejecutamos la acción para el botón
         */
        boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Bienvenido a la Tienda Festejos", Toast.LENGTH_LONG).show();
            }
        });
        /**
         * instanciamos clase Resource y traemos la imagen y la asignamos
         */
        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.logo, getTheme());
        imagen1 = (ImageView) findViewById(R.id.imagen4);
        imagen1.setImageDrawable(drawable1);
    }

    /**
     * instanciamos la clase Menu
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
     * validamos las opciones del menu
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int ident = item.getItemId();
        if (ident == R.id.opcion1) {
            Toast.makeText(getApplicationContext(), "Ha seleccionado la opción de productos", Toast.LENGTH_LONG).show();
            Intent segundaPantalla = new Intent(this, MainActivity2.class);
            startActivity(segundaPantalla);
        }
        if (ident == R.id.opcion2) {
            Toast.makeText(getApplicationContext(), "Ha seleccionado la opción de servicios", Toast.LENGTH_LONG).show();
            Intent terceraPantalla = new Intent(this, MainActivity3.class);
            startActivity(terceraPantalla);
        }
        if (ident == R.id.opcion3) {
            Toast.makeText(getApplicationContext(), "Ha seleccionado la opción de sucursales", Toast.LENGTH_LONG).show();
            Intent cuartaPantalla = new Intent(this, MainActivity4.class);
            startActivity(cuartaPantalla);
        }
        return super.onOptionsItemSelected(item);
    }
}