package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CarritoFinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito_final);
    }
    public void cerrarSesion(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
        Toast.makeText(getApplicationContext(), "Cerrando sesión", Toast.LENGTH_LONG).show();
    }
}
