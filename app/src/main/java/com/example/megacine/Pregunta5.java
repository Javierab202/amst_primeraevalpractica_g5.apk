package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pregunta5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta5);
    }


    public void Correcta (View view){

        Intent i = new Intent(this, Ganar.class );
        startActivity(i);
    }

    public void Falla (View view ){

        Intent intent = new Intent(this, Perdida.class);
        intent.putExtra("Cont", "5");
        startActivity(intent);
    }
}
