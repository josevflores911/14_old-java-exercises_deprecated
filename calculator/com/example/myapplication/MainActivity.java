package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declaring Widgets
    EditText editText;
    TextView textView, textView2, textView4, valueInPounds;
    Button button, Siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiating Widgets
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);

        valueInPounds = findViewById(R.id.valueOfPounds);

        editText =   findViewById(R.id.editTextNumber);

        button = findViewById(R.id.button);
        Siguiente = findViewById(R.id.button2);

        Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Siguiente = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(Siguiente);
            }
        });


        //Adding a click event for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Calling Convert Method

                convertFromKtoP();

            }
        });

    }

    private void convertFromKtoP() {
        //this method will convert the value entered in the edittext

        String valueEnteredKilo = editText.getText().toString();

        //converting stgring to number
        double Kilo = Double.parseDouble(valueEnteredKilo);

        //converting kilo to pound
        double pounds = Kilo * 100;

        //Displaying the value resulted in textView
        textView4.setText("" + pounds);
        //placeholder



    }
}