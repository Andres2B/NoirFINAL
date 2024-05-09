package com.example.noirsplendor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    Button btn_login;
    EditText usuario, contra;
    TextView pasarRegistro, recuperarContra, maps;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        maps = findViewById(R.id.textView4);

        mAuth = FirebaseAuth.getInstance();
        usuario = findViewById(R.id.user);
        contra = findViewById(R.id.contra);
        btn_login = findViewById(R.id.btnLogin);
        pasarRegistro = findViewById(R.id.regis);
        recuperarContra = findViewById(R.id.textView6);

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Login.this, Maps.class);
                startActivity(miIntent);
            }
        });

        recuperarContra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Login.this, RecuperarContra.class);
                startActivity(miIntent);
            }
        });

        pasarRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Login.this, AuthActivity.class);
                startActivity(miIntent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailUser = usuario.getText().toString().trim();
                String contraUser = contra.getText().toString().trim();

                if (emailUser.isEmpty() && contraUser.isEmpty()) {
                    Toast.makeText(Login.this, "Ingresar los datos", Toast.LENGTH_SHORT).show();
                } else {
                    LoginUser(emailUser, contraUser);
                }
            }
        });
    }

    private void LoginUser(String emailUser, String contraUser){
        mAuth.signInWithEmailAndPassword(emailUser, contraUser).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    finish();
                    startActivity(new Intent(Login.this, Catalogo.class));

                    Toast.makeText(Login.this, "Bienvenido", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Login.this, "Contraseña Incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Login.this, "Error al iniciar sesión", Toast.LENGTH_SHORT).show();
            }
        });
    }
}