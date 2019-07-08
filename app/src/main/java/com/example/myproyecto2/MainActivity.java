package com.example.myproyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;//libreria para utilizar clase toast-
 //         /\se pone automaticamente cuando se agrega la clase si no lo poneemos manual

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //Ejemplo sin proposito:

        int matematicas = 5;
        int física= 5;
       int español=5;
        int promedio = 0;

        promedio = (matematicas +física +español) / 3;

        if (promedio>= 6) {

            Toast.makeText(this, "Aprovado", Toast.LENGTH_SHORT).show();
            //metodo para mostarar textos, imagenes, videos ect dependiendo de como lo
            //configuremos

        } else if (promedio <= 5) {
                                                          //       \/metodo para dar cuatno tiempo sea visible
            Toast.makeText(this, "Rebrobado", Toast.LENGTH_SHORT).show();
                                          // /\Texto que aparecera en la pantalla /\Eeste metodo nos
            //hace visible que nuestor mensaje se muestre en la pantalla del dispositivo
        }


    }

}