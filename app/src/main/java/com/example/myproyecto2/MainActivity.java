package com.example.myproyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  vamos a hacer un BrekPoint con un sensillo ejemplo sacando el promedio de calificiones
         //y aprenderemos a debuggear
        int matematicas = 5; //break point
        int física= 5;
       int español=5;
        int promedio = 0;

        promedio = (matematicas +física +español) / 3;

        if (promedio>= 6) {

            Toast.makeText(this, "Aprovado", Toast.LENGTH_SHORT).show();


        } else if (promedio <= 5) {

            Toast.makeText(this, "Rebrobado", Toast.LENGTH_SHORT).show();
            //En pocas palabras deguggear en ejemplificar el codigo paso  a paso de la mano
            //verificandolas con los metodos o variables que se van ponniendo alado 


        }


    }

}