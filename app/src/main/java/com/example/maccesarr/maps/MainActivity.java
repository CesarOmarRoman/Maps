package com.example.maccesarr.maps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

/*Previo
1.- https://console.developers.google.com
2.-Crear un Proyecto.
3.- Agregar Clases en Google Maps (Creará, activity_maps, Maps.class y androidManifest nos podrá permisos).
4.-En Values -> google_maps_api copiar el primer link y ponerlo en el explorador y habilitar un proyecto.
5.-En el mismo archivo poner el Key que se te genero.
6.-Y ya te permitirá usar la apliación de Maps,
   */

    private Button cambiarIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void seleccionarPlace1(View view){
        Intent intent = new Intent(this, MapsPlace1.class);
        startActivity(intent);
    }

    public void seleccionarPlace2(View view){
        Intent intent = new Intent(this, MapsPlace2.class);
        startActivity(intent);
    }

    public void seleccionarPlace3(View view){
        Intent intent = new Intent(this, MapsPlace3.class);
        startActivity(intent);
    }

    public void seleccionarPlace4(View view){
        Intent intent = new Intent(this, MapsPlace4.class);
        startActivity(intent);
    }
}
