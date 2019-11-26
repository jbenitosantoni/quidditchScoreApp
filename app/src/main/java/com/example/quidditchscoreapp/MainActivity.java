package com.example.quidditchscoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int puntosA = 0;
    private int puntosB = 0;
    private boolean diezA = false;
    private boolean cincoA = false;
    private boolean diezB = false;
    private boolean cincoB = false;
    TextView puntuacionA;
    Button BdiezA;
    Button BcincoA;
    Button snitchA;
    TextView puntuacionB;
    Button BdiezB;
    Button BcincoB;
    Button snitchB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        puntuacionA = findViewById(R.id.PuntosA);
        snitchA = (Button) findViewById(R.id.snitchA);
        puntuacionB = findViewById(R.id.PuntosB);
        snitchB = (Button) findViewById(R.id.snitchB);
        BdiezA = (Button) findViewById(R.id.DiezMasA);;
        BcincoA = (Button) findViewById(R.id.CincoMasA);;
        BdiezB = (Button) findViewById(R.id.DiezMasB);;
        BcincoB = (Button) findViewById(R.id.CincoMasB);;

        View.OnClickListener suma = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (v.getId() == R.id.DiezMasA) {
                    diezA = true;
                    incrementar();
                } else if (v.getId() == R.id.CincoMasA) {
                    cincoA = true;
                    incrementar();
                } else if (v.getId() == R.id.DiezMasB) {
                    diezB = true;
                    incrementar();
                } else if (v.getId() == R.id.CincoMasB) {
                    cincoB = true;
                    incrementar();
                }
            }
        };
        BdiezA.setOnClickListener(suma);
        BcincoA.setOnClickListener(suma);
        BdiezB.setOnClickListener(suma);
        BcincoB.setOnClickListener(suma);

        snitchA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        snitchB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void incrementar() {
        if (diezA == true) {
            puntosA = puntosA + 10;
            diezA = false;
        } else if(cincoA == true) {
            puntosA = puntosA + 5;
            cincoA = false;
        } else if (diezB == true) {
            puntosB = puntosB + 10;
            diezB = false;
        } else if (cincoB == true){
            puntosB = puntosB + 5;
            cincoB = false;
        }
    }

    public void resetear() {

    }

    public void snitch() {

    }
}
