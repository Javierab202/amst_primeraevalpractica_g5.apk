package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public  void Trivia (View view){
        Intent intent = new Intent(this, Reglas.class);
        startActivity(intent);
    }

    public void Pregunta (View view ){
        Random rand = new Random();
        int n = rand.nextInt(4)+1;
        String act = "Pregunta"+"n";
        Intent intent = new Intent(this, Preguntas.class);
        startActivity(intent);
    }


}
