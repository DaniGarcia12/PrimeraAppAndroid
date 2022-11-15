package com.example.primeraappandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class relative extends AppCompatActivity {

    Button boton1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        boton1= (Button) findViewById(R.id.button20);
        btn2= (Button) findViewById(R.id.button33);
    }

    public void btn1 (View view){
        String prueba= (String) boton1.getText();
        Toast.makeText(getApplicationContext(), prueba, Toast.LENGTH_SHORT).show();

    }

    public void norte(View view){
        String prueba= (String) btn2.getText();
        Toast.makeText(getApplicationContext(), prueba, Toast.LENGTH_SHORT).show();

    }
}