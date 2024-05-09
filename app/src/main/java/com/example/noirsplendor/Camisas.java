package com.example.noirsplendor;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.Serializable;


public class Camisas extends AppCompatActivity {

    ImageView backCat, carrito;
    Button cam1, cam2, cam3, cam4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camisas);

        int idCam1 = R.drawable.ca1;
        int idCam2 = R.drawable.ca2;
        int idCam3 = R.drawable.ca3;
        int idCam4 = R.drawable.ca4;

        backCat = findViewById(R.id.imageView11);
        carrito = findViewById(R.id.imageView10);
        cam1 = findViewById(R.id.button13);
        cam2 = findViewById(R.id.button14);
        cam3 = findViewById(R.id.button15);
        cam4 = findViewById(R.id.button16);

        cam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Camisas.this, Carrito.class);
                intent.putExtra("idCam1", idCam1);
                startActivity(intent);
            }
        });

        cam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Camisas.this, Carrito.class);
                intent.putExtra("idCam1", idCam2);
                startActivity(intent);
            }
        });

        cam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Camisas.this, Carrito.class);
                intent.putExtra("idCam1", idCam4);
                startActivity(intent);
            }
        });

        cam4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Camisas.this, Carrito.class);
                intent.putExtra("idCam1", idCam3);
                startActivity(intent);
            }
        });



        carrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Camisas.this, Carrito.class);
                startActivity(miIntent);
            }
        });

        backCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Camisas.this, Catalogo.class);
                startActivity(miIntent);
            }
        });
    }
}