package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonMiles = (Button) findViewById(R.id.botonMiles);
        botonMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText milesText = (EditText) findViewById(R.id.milesText);
                EditText kmText = (EditText) findViewById(R.id.kmText);
                double vMiles = Double.valueOf(milesText.getText().toString());
                double vKm = vMiles / 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                kmText.setText(formatVal.format(vKm));

            }
        });

        Button botonKm = (Button) findViewById(R.id.botonKm);
        botonKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText milesText = (EditText) findViewById(R.id.milesText);
                EditText kmText = (EditText) findViewById(R.id.kmText);
                double vKm = Double.valueOf(kmText.getText().toString());
                double vMiles = vKm * 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                milesText.setText(formatVal.format(vMiles));

            }
        });

    }
}