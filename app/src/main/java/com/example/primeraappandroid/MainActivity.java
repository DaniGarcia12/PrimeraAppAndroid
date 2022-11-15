package com.example.primeraappandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Para que se vea al inicio de la app
        texto=findViewById(R.id.textDani);
        texto.setText("Daniel");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i( "inicio", "Estoy en onStart");


    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("inicio", "Estoy en onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("inicio", "Estoy en onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("inicio", "Estoy en onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("inicio", "Estoy en onDestroy");

    }

    public void darMensaje(View view) {//MENSAJE TOAST
        Toast.makeText(getApplicationContext(),"Mensaje", Toast.LENGTH_SHORT).show();

    }

    public void cmensaje(View view){

        texto.setText("Adios");
    }
    public void chola(View view){
        texto.setText("Hola!!");
    }

    public void abrirSegunda(View view) {

        Intent i = new Intent(getApplicationContext(),SegundaActividad.class);
        startActivity(i);
        

    }

    public void operaciones(View view) {
        Intent i = new Intent(getApplicationContext(),CuartaActividad.class);
        startActivity(i);

    }

    public void frame (View view){

        Intent i= new Intent(getApplicationContext(), Frame1.class);
        startActivity(i);
    }

    public void linear(View view){
        Intent i = new Intent(getApplicationContext(), linear.class);
        startActivity(i);

    }

    public void relative (View view){

        Intent i = new Intent(getApplicationContext(), relative.class);
        startActivity(i);
    }

    public void tables(View view){

        Intent i = new Intent(getApplicationContext(), Tables.class);
        startActivity(i);
    }

    public void calculadora(View view){

        Intent i = new Intent(getApplicationContext(), Calculadora.class);
        startActivity(i);
    }
}