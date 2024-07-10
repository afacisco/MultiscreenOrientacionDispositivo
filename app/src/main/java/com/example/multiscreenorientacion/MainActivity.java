package com.example.multiscreenorientacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*
Autor: Juan Francisco Sánchez González
Fecha: 29/12/2023
Clase: Actividad principal que carga el layout, la vista será diferente según la orientación del dispositivo
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}