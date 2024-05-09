package com.example.noirsplendor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import org.checkerframework.checker.nullness.qual.NonNull;

public class RecuperarContra extends AppCompatActivity {

    private EditText editTextEmail;
    private Button buttonResetPassword;
    private FirebaseAuth firebaseAuth;
    ImageView backCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_contra);

        firebaseAuth = FirebaseAuth.getInstance();

        editTextEmail = findViewById(R.id.user);
        buttonResetPassword = findViewById(R.id.btnLogin);
        backCat = findViewById(R.id.imageView11);

        backCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(RecuperarContra.this, Login.class);
                startActivity(miIntent);
            }
        });

        buttonResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Por favor, ingresa tu correo electrónico", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Enviar la solicitud de recuperación de contraseña
                firebaseAuth.sendPasswordResetEmail(email)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    // La solicitud de restablecimiento de contraseña se ha enviado correctamente
                                    Toast.makeText(getApplicationContext(), "Se ha enviado un correo electrónico para restablecer la contraseña", Toast.LENGTH_SHORT).show();
                                } else {
                                    // Error al enviar la solicitud de restablecimiento de contraseña
                                    Toast.makeText(getApplicationContext(), "Error al enviar la solicitud de restablecimiento de contraseña", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
}
