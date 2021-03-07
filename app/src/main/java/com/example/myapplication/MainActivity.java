package com.example.myapplication;


import android.os.Bundle;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText pais, peso; //Datos de los EditText
    private Button   bt1;
    private Spinner spinner1;
    private TextView resultado; // Datos del TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pais       = (EditText)findViewById(R.id.et1); // lectura del pais
        peso       = (EditText)findViewById(R.id.et2); //lectura del peso
        spinner1   = (Spinner)findViewById(R.id.sp1); // spinner para el continente
        String[]Opciones = {"Asia", "América del Norte","América Central",
                "América del Sur", "Europa"}; //Arreglo
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, Opciones);// adapter
        spinner1.setAdapter(adapter);// se agrega adaptador al spinner
        String selec = spinner1.getSelectedItem().toString();// capturo el valor
        resultado  = (TextView) findViewById(R.id.tv4); // impresión del resultado




    }
}