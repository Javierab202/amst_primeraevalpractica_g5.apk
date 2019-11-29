package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Reglas extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglas);
    }

    public void Regresar (View view ){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
