package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Preguntas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
    }


    public static void reiniciarActivity(Activity actividad){
        Intent intent=new Intent();
        intent.setClass(actividad, actividad.getClass());
        //llamamos a la actividad
        actividad.startActivity(intent);
        //finalizamos la actividad actual
        //actividad.finish();
    }

    public void Correcta (View view){

        Intent i = new Intent(this, Pregunta2.class );
        startActivity(i);
    }

    public void Falla (View view ){

        Intent intent = new Intent(this, Perdida.class);
        intent.putExtra("cont", "Ninguna" );
        startActivity(intent);
    }
}
