package com.example.dam_uc3_luisgayoso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ThemedSpinnerAdapter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Filterable;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b_enviar;
    private Spinner spinnersexo;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_enviar = findViewById(R.id.Button_registrarte);
        b_enviar.setOnClickListener(this);
        spinnersexo = findViewById(R.id.Spinner_Sexo);

        String [] opcionesSexo = {"Masculino", "Femenino"};

        //adapterSexo
        ArrayAdapter<String> adaptersexo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcionesSexo);
        spinnersexo.setAdapter(adaptersexo);


    }
    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Se envio sus datos", Toast.LENGTH_SHORT).show();
    }
}