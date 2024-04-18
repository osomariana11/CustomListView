package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listaPersonas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] nombres ={
                "Julian",
                "Sara",
                "Carolina",
                "Sandra",
        };

        String[] telefonos ={
                "345555",
                "346466",
                "547587",
                "983473",
        };


      int [] fotoPerfil ={
            R.drawable.persona,
            R.drawable.persona1,

      };

      ListAdapter personas = new ListAdapter(MainActivity.this, nombres, telefonos,fotoPerfil);
      listaPersonas =(ListView) findViewById(R.id.listaUsuarios);
      listaPersonas.setAdapter(personas);

      listaPersonas.setOnItemClickListener(new AdapterView.OnItemClickListener(){
          @Override

          public void onItemClick(AdapterView<?> lista, View vista, int posicion, long id){
              Intent enviarInfo = new Intent(MainActivity.this,UserActivity.class)
                      .putExtra("nombre", nombres[posicion])
                      .putExtra("Telefono", telefonos[posicion])
                      .putExtra("Imagen", fotoPerfil[posicion]);

              startActivity(enviarInfo);
          }

      });



    }
}