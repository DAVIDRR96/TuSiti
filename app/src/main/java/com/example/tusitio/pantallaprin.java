package com.example.tusitio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pantallaprin extends AppCompatActivity {

    Button btnInicio, btnGenerarQR, btnRecargar, btnSalir;
    TextView txtUltimoingreso,texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantallaprincipal);
        Conectar();
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VisibilidadUltimoIngreso();
            }
        });
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirsalir();
            }
        });
        btnRecargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirrecargar();
            }
        });
    }

    private void Conectar() {
        btnInicio = findViewById(R.id.btninicio);
        btnGenerarQR = findViewById(R.id.btnGenerarQR);
        btnRecargar = findViewById(R.id.btnrecargar);
        btnSalir = findViewById(R.id.btnsalir);
        txtUltimoingreso = findViewById(R.id.txtultimoingreso);
        texto = findViewById(R.id.texto);
    }
    public static Intent abreme(Context ctx)
    {
        return new Intent(ctx, pantallaprin.class);
    }
    // metodo para hacer visible el Editext de ultimoingreso y texto
    public void VisibilidadUltimoIngreso() {
        txtUltimoingreso.setVisibility(View.VISIBLE);
        texto.setVisibility(View.VISIBLE);
    }

    //abre la pantalla de salir
    public void abrirsalir() {
        Intent intent = Cerrarsesion.abreme(pantallaprin.this);
        startActivity(intent);
    }
    //abre la pantalla de pantallarecargar
    public void abrirrecargar() {
        Intent intent = PantallaRecargar.abreme(pantallaprin.this);
        startActivity(intent);
    }
}
