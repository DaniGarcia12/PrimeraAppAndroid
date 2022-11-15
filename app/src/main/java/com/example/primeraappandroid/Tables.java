package com.example.primeraappandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Tables extends AppCompatActivity {

    EditText texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);
        texto = (EditText) findViewById(R.id.editTextTextPersonName4);
    }

    public void uno (View view){


        texto.setText(texto.getText() + String.valueOf(1)  );
    }

    public void dos (View view){


        texto.setText(texto.getText() + String.valueOf(2)  );
    }
    public void tres(View view){


        texto.setText(texto.getText() + String.valueOf(3)  );
    }
    public void cuatro(View view){


        texto.setText(texto.getText() + String.valueOf(4)  );
    }
    public void cinco(View view){


        texto.setText(texto.getText() + String.valueOf(5)  );
    }
    public void seis(View view){


        texto.setText(texto.getText() + String.valueOf(6)  );
    }
    public void siete(View view){


        texto.setText(texto.getText() + String.valueOf(7)  );
    }
    public void ocho (View view){


        texto.setText(texto.getText() + String.valueOf(8)  );
    }
    public void nueve(View view){


        texto.setText(texto.getText() + String.valueOf(9)  );
    }
    public void cero (View view){


        texto.setText(texto.getText() + String.valueOf(0)  );
    }

    public void salir (View view){

    Intent i = new Intent(getApplicationContext(), MainActivity.class);
    startActivity(i);
    }










}