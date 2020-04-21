package com.example.tusitio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class iniciosesion1 extends AppCompatActivity {

    Button Ingresar;
    EditText correo, contra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iniciose);
        Conectar();
        Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirmenu();
            }
        });
    }

    private void Conectar() {
        Ingresar = findViewById(R.id.btnIngresa);
        correo = findViewById(R.id.txtCorreo);
        contra = findViewById(R.id.txtContraseña);
    }

    public static Intent abreme(Context ctx)
    {
        return new Intent(ctx, iniciosesion1.class);
    }

    //abre la pantalla de pantallaprincipal
    public void abrirmenu()
    {
        Intent intent = pantallaprin.abreme(iniciosesion1.this);
        startActivity(intent);
    }
}

