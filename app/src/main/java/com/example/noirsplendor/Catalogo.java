package com.example.noirsplendor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Catalogo extends AppCompatActivity {

    private Button traje, zapato, corbata, camisa;
    private ImageView carrito;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        traje = findViewById(R.id.irTrajes);
        zapato = findViewById(R.id.irZapato);
        corbata = findViewById(R.id.irCorbata);
        camisa = findViewById(R.id.irCamisa);
        carrito = findViewById(R.id.imageView10);

        traje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Catalogo.this, Trajes.class);
                startActivity(miIntent);
            }
        });

        zapato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Catalogo.this, Zapatos.class);
                startActivity(miIntent);
            }
        });

        corbata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Catalogo.this, Corbatas.class);
                startActivity(miIntent);
            }
        });

        camisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Catalogo.this, Camisas.class);
                startActivity(miIntent);
            }
        });

        carrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Catalogo.this, Carrito.class);
                startActivity(miIntent);
            }
        });
    }
}