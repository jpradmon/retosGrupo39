package com.example.festejos_v5.Vista;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import com.example.festejos_v5.Modelo.Adaptador;
import com.example.festejos_v5.Modelo.BaseDatos.MotorBaseDatosSQLite;
import com.example.festejos_v5.Modelo.Entidad;
import com.example.festejos_v5.R;


public class Fragment_Productos extends Fragment {


    int [] imagen = {R.drawable.pr1, R.drawable.pr2, R.drawable.pr3, R.drawable.se1, R.drawable.se2, R.drawable.se3,
            R.drawable.su1, R.drawable.su2, R.drawable.su3};

    String TAG = "Fragment_Productos";

    View v;

    ListView listaProductos;
    Adaptador adaptador;

    TextView prueba;

    // CONEXION A LA BASE DE DATOS: instancia APEX de SQL en Oracle Cloud


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__productos, container, false);
        //-----------------------------------------------------------------------------
        listaProductos = (ListView) v.findViewById(R.id.lista_productos);
        adaptador = new Adaptador(getTablaProductos(), getContext());

        listaProductos.setAdapter(adaptador);

        prueba = (TextView) v.findViewById(R.id.prueba);
        //-----------------------------------------------------------------------------
        return v;
    }

    private ArrayList<Entidad> getTablaProductos(){
        ArrayList<Entidad> listaProductos = new ArrayList<>();

        /* ================================================================================================== */
        //String url = "https://g1379f5424c7d37-dbgofood.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/tiendas/tiendas";
        //String url = "https://ge66797f0b4653f-modulo4reto4.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/productos/productos";
        //String url = "https://g1ac92d9645ef7b-db202112141529.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/chaquetas/productos";
        String url = "https://g7ef6e2129d7911-festejo.adb.us-sanjose-1.oraclecloudapps.com/ords/admin/productos/productos";


        RequestQueue requestQueue = Volley.newRequestQueue(getContext());

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                //***********************************************************
                try {
                    JSONArray jsonArray = response.getJSONArray("items");
                    for(int i = 0; i < jsonArray.length(); i++){
                        JSONObject jsonObject = jsonArray.getJSONObject(i);


                        String titulo = jsonObject.getString("titulo");
                        String descripcion = jsonObject.getString("descripcion");

                        listaProductos.add(new Entidad(imagen[i], titulo, descripcion));
                        prueba.append(" " + '\n');

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                //***********************************************************
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        requestQueue.add(jsonObjectRequest);
        /* ================================================================================================== */

        return listaProductos;
    }

}