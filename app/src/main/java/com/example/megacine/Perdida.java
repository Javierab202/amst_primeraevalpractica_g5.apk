package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Perdida extends AppCompatActivity {

    Button btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perdida);

        btnSalir= (Button) findViewById(R.id.button25);

    }

    public void Volver (View view){

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }

    public void Finalizar(View view){
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        //Intent intent= new Intent();
        //System.exit(0);
        //finish();
    }
}
