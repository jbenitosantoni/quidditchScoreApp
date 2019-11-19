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
    private boolean diez = false;
    private boolean cinco = false;
    private boolean esA = false;
    private boolean esB = false;
    TextView puntuacionA;
    Button diezA;
    Button cincoA;
    Button snitchA;
    TextView puntuacionB;
    Button diezB;
    Button cincoB;
    Button snitchB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        puntuacionA = findViewById(R.id.puntuacionA);
        diezA = (Button)findViewById(R.id.diezA);
        cincoA = (Button)findViewById(R.id.cincoA);
        snitchA = (Button)findViewById(R.id.snitchA);

        puntuacionB = findViewById(R.id.puntuacionB);
        diezB = (Button)findViewById(R.id.diezB);
        cincoB = (Button)findViewById(R.id.cincoB);
        snitchB = (Button)findViewById(R.id.snitchB);

        diezA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                esA = true;
                diez = true;
            }
        });
        cincoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        snitchA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        diezB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        cincoB.setOnClickListener(new View.OnClickListener() {
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

        }
    public void resetear() {

    }
    public void snitch() {

    }
}
