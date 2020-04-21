package com.example.tusitio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PantallaRecargar extends AppCompatActivity {
   TextView tvMisaldo, tvUltimoMovimiento;
   Button recargar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantallarecargar);
        Conectar();
        recargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPantallaRecargar2();
            }
        });
    }
    public static Intent abreme(Context ctx)
    {
        return new Intent(ctx, PantallaRecargar.class);
    }
    private void Conectar() {
        tvMisaldo = findViewById(R.id.tvMiSaldo);
        tvUltimoMovimiento = findViewById(R.id.tvUltimoMovimiento);
        recargar = findViewById(R.id.btnRecar);
    }

    //abre la pantalla de PantallaRecargar2
    public void abrirPantallaRecargar2() {
        Intent intent = PantallaRecargar2.abreme(PantallaRecargar.this);
        startActivity(intent);
    }
}