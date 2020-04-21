package com.example.tusitio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button iniciar, registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Conectar();
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abririnicioses();
            }
        });
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirregistrarse();
            }
        });
    }

    private void Conectar() {
        iniciar = findViewById(R.id.btnIniciarsesion);
        registrar = findViewById(R.id.btnRegistrar);
    }

    //abre la pantalla de iniciose
    public void abririnicioses() {
        Intent intent = iniciosesion1.abreme(MainActivity.this);
        startActivity(intent);
    }

    //abre la pantalla de reg
    public void abrirregistrarse() {
        Intent intent = Registrarse.abreme(MainActivity.this);
        startActivity(intent);
    }

    public static Intent abreme(Context ctx) {
        return new Intent(ctx, MainActivity.class);
    }

}
