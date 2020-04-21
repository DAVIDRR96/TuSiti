package com.example.tusitio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaRecargar2 extends AppCompatActivity {

    Button btnPagar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantallarecargar2);
        Conectar();

    }
    public static Intent abreme(Context ctx) {
        return new Intent(ctx, PantallaRecargar2.class);
    }

    private void Conectar() {
        btnPagar = findViewById(R.id.btnPagar);
    }
}
