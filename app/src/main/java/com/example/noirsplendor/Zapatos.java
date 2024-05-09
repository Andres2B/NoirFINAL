package com.example.noirsplendor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Zapatos extends AppCompatActivity {

    ImageView backCat, carrito;
    Button z1, z2, z3, z4;

    int idz1 = R.drawable.z1;
    int idz2 = R.drawable.z2;
    int idz3 = R.drawable.z3;
    int idz4 = R.drawable.z4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zapatos);

        backCat = findViewById(R.id.imageView11);
        carrito = findViewById(R.id.imageView10);
        z1 = findViewById(R.id.button13);
        z2 = findViewById(R.id.button14);
        z3 = findViewById(R.id.button15);
        z4 = findViewById(R.id.button16);

        z1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Zapatos.this, Carrito.class);
                intent.putExtra("idCam1", idz1);
                startActivity(intent);
            }
        });

        z2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Zapatos.this, Carrito.class);
                intent.putExtra("idCam1", idz2);
                startActivity(intent);
            }
        });

        z3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Zapatos.this, Carrito.class);
                intent.putExtra("idCam1", idz3);
                startActivity(intent);
            }
        });



        z4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Zapatos.this, Carrito.class);
                intent.putExtra("idCam1", idz4);
                startActivity(intent);
            }
        });



        carrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Zapatos.this, Carrito.class);
                startActivity(miIntent);
            }
        });

        backCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Zapatos.this, Catalogo.class);
                startActivity(miIntent);
            }
        });
    }
}