package com.example.noirsplendor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Trajes extends AppCompatActivity {

    ImageView backCat, carrito;
    Button t1, t2, t3, t4;

    int idtr1 = R.drawable.tr1;
    int idtr2 = R.drawable.tr2;
    int idtr3 = R.drawable.tr3;
    int idtr4 = R.drawable.tr4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trajes);

        backCat = findViewById(R.id.imageView11);
        carrito = findViewById(R.id.imageView10);
        t1 = findViewById(R.id.button13);
        t2 = findViewById(R.id.button14);
        t3 = findViewById(R.id.button15);
        t4 = findViewById(R.id.button16);


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Trajes.this, Carrito.class);
                intent.putExtra("idCam1", idtr1);

                startActivity(intent);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Trajes.this, Carrito.class);
                intent.putExtra("idCam1", idtr2);

                startActivity(intent);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Trajes.this, Carrito.class);
                intent.putExtra("idCam1", idtr3);

                startActivity(intent);
            }
        });



        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Trajes.this, Carrito.class);
                intent.putExtra("idCam1", idtr4);

                startActivity(intent);
            }
        });



        carrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Trajes.this, Carrito.class);
                startActivity(miIntent);
            }
        });

        backCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Trajes.this, Catalogo.class);
                startActivity(miIntent);
            }
        });
    }
}