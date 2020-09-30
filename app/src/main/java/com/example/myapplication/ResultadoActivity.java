package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class ResultadoActivity extends AppCompatActivity implements View.OnClickListener{

    Button cambiar;
    EditText res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        cambiar=(Button)findViewById(R.id.btnAgregarCarrito);
        res=(EditText)findViewById(R.id.txtBusqueda3);

    }
    public void cerrarSesion(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
        Toast.makeText(getApplicationContext(), "Cerrando sesión", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onClick(View v) {
        cambiar.setText("Producto en carrito");

    }
    public void carritoUno(View view){

        Intent carrito = new Intent(this, Carritouno.class);
        startActivity(carrito);

    }

    public void buscarProductoDos(View view){
        String busqueda=res.getText().toString();
        String resultado1 = "Desodorante old spices";

        if(busqueda.equals(resultado1)){

            Intent resul = new Intent(this, ResultadoDosActivity.class);
            startActivity(resul);
            Toast.makeText(getApplicationContext(), "Producto encontrado", Toast.LENGTH_SHORT).show();


        }else{
            Toast.makeText(getApplicationContext(), "Producto no encontrado", Toast.LENGTH_SHORT).show();
        }
    }
}
