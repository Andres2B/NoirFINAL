package com.example.noirsplendor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Carrito extends AppCompatActivity {

    ImageView backCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        backCat = findViewById(R.id.imageView11);

        Intent intent = getIntent();
        if(intent != null) {
            int imagenId = intent.getIntExtra("idCam1", 0);
            int imagenId2 = intent.getIntExtra("idCam2", 1);
            int imagenId3 = intent.getIntExtra("idCam3", 2);
            int imagenId4 = intent.getIntExtra("idCam4", 3);
            int imagenId5 = intent.getIntExtra("idCor1", 4);
            int imagenId6 = intent.getIntExtra("idCor2", 5);
            int imagenId7 = intent.getIntExtra("idCor3", 6);
            int imagenId8 = intent.getIntExtra("idCor4", 7);
            int imagenId9 = intent.getIntExtra("idtr1", 8);
            int imagenId10 = intent.getIntExtra("idtr2", 9);
            int imagenId11 = intent.getIntExtra("idtr3", 10);
            int imagenId12 = intent.getIntExtra("idtr4", 11);
            int imagenId13 = intent.getIntExtra("idz1", 12);
            int imagenId14 = intent.getIntExtra("idz2", 13);
            int imagenId15 = intent.getIntExtra("idz3", 14);
            int imagenId16 = intent.getIntExtra("idz4", 15);



            if(imagenId == 0) {
                ImageView imageView = findViewById(R.id.imageView27);


                imageView.setImageResource(imagenId);

            }
            if(imagenId2 == 1) {
                ImageView imageView = findViewById(R.id.imageView27);


                imageView.setImageResource(imagenId);
            }
            if(imagenId3 == 2) {
                ImageView imageView = findViewById(R.id.imageView27);



                imageView.setImageResource(imagenId);
            }
            if(imagenId4 == 3) {
                ImageView imageView = findViewById(R.id.imageView27);



                imageView.setImageResource(imagenId);
            }
            if(imagenId5 == 4) {
                ImageView imageView = findViewById(R.id.imageView27);



                imageView.setImageResource(imagenId);
            }
            if(imagenId6 == 5) {
                ImageView imageView = findViewById(R.id.imageView27);



                imageView.setImageResource(imagenId);
            }
            if(imagenId7 == 6) {
                ImageView imageView = findViewById(R.id.imageView27);



                imageView.setImageResource(imagenId);
            }
            if(imagenId8 == 7) {
                ImageView imageView = findViewById(R.id.imageView27);



                imageView.setImageResource(imagenId);
            }
            if(imagenId9 == 8) {
                ImageView imageView = findViewById(R.id.imageView27);


                imageView.setImageResource(imagenId);
            }
            if(imagenId10 == 9) {
                ImageView imageView = findViewById(R.id.imageView27);



                imageView.setImageResource(imagenId);


            }
            if(imagenId11 == 10) {
                ImageView imageView = findViewById(R.id.imageView27);



                imageView.setImageResource(imagenId);



            }
            if(imagenId12 == 11) {
                ImageView imageView = findViewById(R.id.imageView27);



                imageView.setImageResource(imagenId);


            }
            if(imagenId13 == 12) {
                ImageView imageView = findViewById(R.id.imageView27);


                imageView.setImageResource(imagenId);



            }
            if(imagenId14 == 13) {
                ImageView imageView = findViewById(R.id.imageView27);

                imageView.setImageResource(imagenId);
            }
            if(imagenId15 == 14) {
                ImageView imageView = findViewById(R.id.imageView27);


                imageView.setImageResource(imagenId);
            }
            if(imagenId16 == 15) {
                ImageView imageView = findViewById(R.id.imageView27);


                imageView.setImageResource(imagenId);
            }
        }

        backCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Carrito.this, Catalogo.class);
                startActivity(miIntent);
            }
        });
    }
}