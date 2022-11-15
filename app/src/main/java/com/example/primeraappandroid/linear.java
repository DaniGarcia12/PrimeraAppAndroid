package com.example.primeraappandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class linear extends AppCompatActivity {
    RadioButton primero;
    RadioButton segundo;
    RadioButton tercero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        primero = (RadioButton) findViewById(R.id.radioButton2);
        segundo = (RadioButton) findViewById(R.id.radioButton3);
        tercero = (RadioButton) findViewById(R.id.radioButton4);

    }
    public void pulsa1(View view){


        if(primero.isChecked()){
                segundo.setEnabled(false);
                tercero.setEnabled(false);

            }
    }

    public void pulsa2(View view){
        if(segundo.isChecked()){
            primero.setEnabled(false);
            tercero.setEnabled(false);

        }
    }

    public void pulsa3(View view){
        if(tercero.isChecked()){
            segundo.setEnabled(false);
            primero.setEnabled(false);

        }
    }


    public void mensaje1(View view){

        Toast.makeText(getApplicationContext(),"Mensaje1", Toast.LENGTH_SHORT).show();

    }

    public void mensaje2(View view){

        Toast.makeText(getApplicationContext(),"Mensaje2", Toast.LENGTH_SHORT).show();

    }

    public void mensaje3(View view){

        Toast.makeText(getApplicationContext(),"Mensaje3", Toast.LENGTH_SHORT).show();

    }
}
