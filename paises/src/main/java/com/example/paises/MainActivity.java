package com.example.paises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] ciudadesEspana = {"-- Selecciona una ciudad --", "Guadalupe","Lastres","Madrid"};
        final String[] ciudadesAlemania = {"-- Selecciona una ciudad --", "Berlin","Füssen","köhl","Bamberg"};
        final String[] ciudadesBelgica = {"-- Selecciona una ciudad --", "Brujas","Gante","Ambere"};

        final Spinner paises = findViewById(R.id.SpinnerPaises);
        final Spinner ciudades = findViewById(R.id.SpinnerCiudades);
        final TextView texto = findViewById(R.id.textView);
        paises.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (paises.getSelectedItem().toString()){
                    case "España":
                        ciudades.setAdapter(new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,ciudadesEspana));
                        break;
                    case "Alemania":
                        ciudades.setAdapter(new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,ciudadesAlemania));
                        break;
                    case "Bélgica":
                        ciudades.setAdapter(new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,ciudadesBelgica));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ciudades.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        texto.setText(ciudades.getItemAtPosition(position).toString());
                        break;
                    case 2:
                        texto.setText(ciudades.getItemAtPosition(position).toString());
                        break;
                    case 3:
                        texto.setText(ciudades.getItemAtPosition(position).toString());
                        break;
                    case 4:
                        texto.setText(ciudades.getItemAtPosition(position).toString());
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
