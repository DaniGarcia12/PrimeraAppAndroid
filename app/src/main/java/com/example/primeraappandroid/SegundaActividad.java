package com.example.primeraappandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
    }


    public void tercera(View view) {
        Intent i= new Intent(getApplicationContext(), TerceraActividad.class);
        startActivity(i);
    }
}