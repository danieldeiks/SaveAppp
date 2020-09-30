package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ZucaritasResultadoActivity extends AppCompatActivity {

    Button cambiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zucaritas_resultado);

        cambiar=(Button)findViewById(R.id.btnAgregarCarrito3);
    }
    public void onClick(View v) {
        cambiar.setText("Producto en carrito");

    }
    public void carrito(View view){
        Intent resul = new Intent(this, CarritoFinal.class);
        startActivity(resul);
    }
    public void cerrarSesion(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
        Toast.makeText(getApplicationContext(), "Cerrando sesión", Toast.LENGTH_LONG).show();
    }
}
