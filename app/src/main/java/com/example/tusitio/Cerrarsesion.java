package com.example.tusitio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cerrarsesion extends AppCompatActivity {
   Button salir, volverAlInicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salir);
        Conectar();
        volverAlInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abriractivity();
            }
        });

    }

    private void Conectar() {
        salir = findViewById(R.id.Salir);
        volverAlInicio = findViewById(R.id.Volverinicio);
    }
    //vuelve a la pantalla del activity_main
    public void abriractivity()
    {
        Intent intent = MainActivity.abreme(Cerrarsesion.this);
        startActivity(intent);
    }
    public static Intent abreme(Context ctx)
    {
        return new Intent(ctx, Cerrarsesion.class);
    }

}