package com.example.festejos_v3.Modelo.BaseDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MotorBaseDatosSQLite extends SQLiteOpenHelper {

    public MotorBaseDatosSQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        /* ====================================================================================================== */
        //TABLA FAVORITOS
        db.execSQL("CREATE TABLE favoritos (id INT, titulo TEXT,descripcion TEXT)");
        //---- Registros
        /*
        db.execSQL("INSERT INTO favoritos VALUES (1, 'Vegetariana','sssssssssssss')");
        db.execSQL("INSERT INTO favoritos VALUES (2, 'Tres quesos','hhhhhhhhhhhhhhhhhh')");
        db.execSQL("INSERT INTO favoritos VALUES (3, 'Pollo Chanpiñones','eeeeeeeeeeeeeeeeee')");

         */

        /* ====================================================================================================== */
        //TABLA PRODUCTOS
        db.execSQL("CREATE TABLE productos (imagen INT, titulo TEXT,descripcion TEXT)");
        //---- Registros
        db.execSQL("INSERT INTO productos VALUES ( 0, 'Reuniones empresariales','Reunines empresariales')");
        db.execSQL("INSERT INTO productos VALUES ( 1, 'Comida','Comida para toda ocasión')");
        db.execSQL("INSERT INTO productos VALUES ( 2, 'Reuniones familiares','reuniones familiares')");

        /* ====================================================================================================== */
        //TABLA SERVICIOS
        db.execSQL("CREATE TABLE servicios (imagen INT,titulo TEXT,descripcion TEXT)");
        //---- Registros
        db.execSQL("INSERT INTO servicios VALUES (0, 'Matrimonios','Eventos para matrimonios')");
        db.execSQL("INSERT INTO servicios VALUES (1, 'Eventos niños','Eventos para niños')");
        db.execSQL("INSERT INTO servicios VALUES (2, 'Eventos sociales','Eventos sociales')");
        /* ====================================================================================================== */
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE favoritos");
        db.execSQL("DROP TABLE productos");
        db.execSQL("DROP TABLE servicios");
        onCreate(db);

    }
}
