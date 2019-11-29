package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Perdida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perdida);
    }

    public void Volver (View view){

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }

    public void Finalizar(View view){

        Intent intent= new Intent();
        System.exit(0);
        finish();
    }
}
