package com.example.quidditchscoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int puntosA = 0;
    private int puntosB = 0;
    private boolean diezA = false;
    private boolean cincoA = false;
    private boolean diezB = false;
    private boolean cincoB = false;
    private boolean snitchB = false;
    private boolean snitchA = false;

    TextView puntuacionA;
    Button BdiezA;
    Button BcincoA;
    Button BsnitchA;
    TextView puntuacionB;
    Button BdiezB;
    Button BcincoB;
    Button BsnitchB;
    Button Breset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        puntuacionA = findViewById(R.id.PuntosA);
        BsnitchA = (Button) findViewById(R.id.snitchA);
        puntuacionB = findViewById(R.id.PuntosB);
        BsnitchB = (Button) findViewById(R.id.snitchB);
        BdiezA = (Button) findViewById(R.id.DiezMasA);;
        BcincoA = (Button) findViewById(R.id.CincoMasA);;
        BdiezB = (Button) findViewById(R.id.DiezMasB);;
        BcincoB = (Button) findViewById(R.id.CincoMasB);;
        Breset = (Button) findViewById(R.id.Resetear);;

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


        View.OnClickListener snitch = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.snitchA) {
                    snitchA = true;
                    snitch();
                } else if (v.getId() == R.id.snitchB) {}
                snitchB = true;
                snitch();
        }};
        BsnitchA.setOnClickListener(snitch);
        BsnitchB.setOnClickListener(snitch);


        View.OnClickListener reset = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            resetear();
            }};
        Breset.setOnClickListener(reset);
    }
    public void incrementar() {
        if (diezA == true) {
            puntosA = puntosA + 10;
            diezA = false;
            puntuacionA.setText(puntosA + "");
        } else if(cincoA == true) {
            puntosA = puntosA + 5;
            cincoA = false;
            puntuacionA.setText(puntosA + "");
        } else if (diezB == true) {
            puntosB = puntosB + 10;
            diezB = false;
            puntuacionB.setText(puntosB + "");
        } else if (cincoB == true){
            puntosB = puntosB + 5;
            cincoB = false;
            puntuacionB.setText(puntosB + "");
        }
    }

    public void resetear() {
        puntosA = 0;
        puntosB = 0;
        puntuacionA.setText(puntosA + "");
        puntuacionB.setText(puntosB + "");
    }

    public void snitch() {
    if(snitchA == true) {
        Toast ganaA = Toast.makeText(getApplicationContext(),"Ha ganado A", Toast.LENGTH_SHORT);
        ganaA.show();
        snitchA = false;
    }else {
        Toast ganaB = Toast.makeText(getApplicationContext(),"Ha ganado B", Toast.LENGTH_SHORT);
        ganaB.show();
        snitchB = false;
    }
    }
}
