package com.example.primeraappandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class CuartaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarta_actividad);
    }




    public void reset(View view){
        EditText texto = (EditText) findViewById(R.id.editTextTextPersonName);
        String cadena = texto.getText().toString();

        TextView numero = (TextView) findViewById(R.id.textView2);

        numero.setText(cadena);

    }
    public void suma(View view){

        TextView numero = (TextView) findViewById(R.id.textView2);
        int num= Integer.parseInt(numero.getText().toString())+1;

        numero.setText(String.valueOf(num));

    }

    public void resta(View view){

        TextView numero = (TextView) findViewById(R.id.textView2);
        int num= Integer.parseInt(numero.getText().toString())-1;

        numero.setText(String.valueOf(num));

    }

    public void nega(View view) {

        CheckBox check = (CheckBox) findViewById(R.id.checkBox);
        TextView numero = (TextView) findViewById(R.id.textView2);

        if(check.isChecked()){
            numero.setText(String.valueOf(-12));
        }


    }
}