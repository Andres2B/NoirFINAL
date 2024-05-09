package com.example.noirsplendor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Corbatas extends AppCompatActivity {

    ImageView backCat, carrito;
    Button cor1, cor2, cor3, cor4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corbatas);

        int idCor1 = R.drawable.co3;
        int idCor2 = R.drawable.co2;
        int idCor3 = R.drawable.co1;
        int idCor4 = R.drawable.co4;

        backCat = findViewById(R.id.imageView11);
        carrito = findViewById(R.id.imageView10);
        cor1 = findViewById(R.id.button13);
        cor2 = findViewById(R.id.button14);
        cor3 = findViewById(R.id.button15);
        cor4 = findViewById(R.id.button16);

        cor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Corbatas.this, Carrito.class);
                intent.putExtra("idCam1", idCor1);
                startActivity(intent);
            }
        });

        cor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Corbatas.this, Carrito.class);
                intent.putExtra("idCam1", idCor2);
                startActivity(intent);
            }
        });

        cor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Corbatas.this, Carrito.class);
                intent.putExtra("idCam1", idCor3);
                startActivity(intent);
            }
        });



        cor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Corbatas.this, Carrito.class);
                intent.putExtra("idCam1", idCor4);
                startActivity(intent);
            }
        });

        carrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Corbatas.this, Carrito.class);
                startActivity(miIntent);
            }
        });

        backCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Corbatas.this, Catalogo.class);
                startActivity(miIntent);
            }
        });
    }
}