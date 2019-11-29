package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pregunta2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2);
    }

    public void Correcta (View view){

        Intent i = new Intent(this, Pregunta3.class );
        startActivity(i);
    }

    public void Falla (View view ){

        Intent intent = new Intent(this, Perdida.class);
        intent.putExtra("cont","2");
        startActivity(intent);
    }
}
