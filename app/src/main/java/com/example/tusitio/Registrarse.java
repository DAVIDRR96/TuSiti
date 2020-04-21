package com.example.tusitio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registrarse extends AppCompatActivity {

    EditText nombre_Completo,contraseña,correo,cedula;
    Button registrarse, volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg);
        Conectar();
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Registrado", Toast.LENGTH_LONG).show();
                limpiar();
            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirmain();
            }
        });
    }
    public void limpiar(){
        nombre_Completo.setText("");
        contraseña.setText("");
        correo.setText("");
        cedula.setText("");
    }
    private void Conectar() {
        nombre_Completo = findViewById(R.id.txtNombre);
        contraseña = findViewById(R.id.txtContra);
        correo = findViewById(R.id.txtCorreoelec);
        cedula = findViewById(R.id.cedula);
        registrarse = findViewById(R.id.registrarse);
        volver = findViewById(R.id.volver);
    }
    public static Intent abreme(Context ctx)
    {
        return new Intent(ctx, Registrarse.class);
    }

    // abre la pantalla del activity_main
    public void abrirmain()
    {
        Intent intent = MainActivity.abreme(Registrarse.this);
        startActivity(intent);
    }
}

