package com.example.primeraappandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    EditText n1;
    EditText n2;
    TextView resultadoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        n1 = (EditText) findViewById(R.id.editTextTextPersonName2);
        n2= (EditText) findViewById(R.id.editTextTextPersonName3);
        resultadoFinal= (TextView) findViewById(R.id.textView4);
    }

    public void sumar (View view){

        int resultado = Integer.parseInt(String.valueOf(n1.getText())) + Integer.parseInt(String.valueOf(n2.getText()));
        resultadoFinal.setText(String.valueOf(resultado));
    }

    public void restar (View view){
        int resultado = Integer.parseInt(String.valueOf(n1.getText())) - Integer.parseInt(String.valueOf(n2.getText()));
        resultadoFinal.setText(String.valueOf(resultado));

    }

    public void multiplicar(View view){
        int resultado = Integer.parseInt(String.valueOf(n1.getText())) * Integer.parseInt(String.valueOf(n2.getText()));
        resultadoFinal.setText(String.valueOf(resultado));
    }

    public void dividir(View view){
        int resultado = Integer.parseInt(String.valueOf(n1.getText())) / Integer.parseInt(String.valueOf(n2.getText()));
        resultadoFinal.setText(String.valueOf(resultado));
    }
}