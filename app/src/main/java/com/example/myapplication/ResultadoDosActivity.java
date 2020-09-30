package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ResultadoDosActivity extends AppCompatActivity {

    Button cambiar;
    EditText res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_dos);

        cambiar=(Button)findViewById(R.id.btnAgregarCarrito2);
        res=(EditText)findViewById(R.id.txtBusqueda2);
    }
    public void onClick(View v) {
        cambiar.setText("Producto en carrito");

    }
    public void buscarProducto(View view){
        String busqueda=res.getText().toString();
        String resultado1 = "Cereal zucaritas";

        if(busqueda.equals(resultado1)){

            Intent resul = new Intent(this, ZucaritasResultadoActivity.class);
            startActivity(resul);
            Toast.makeText(getApplicationContext(), "Producto encontrado", Toast.LENGTH_SHORT).show();


        }else{
            Toast.makeText(getApplicationContext(), "Producto no encontrado", Toast.LENGTH_SHORT).show();
        }

    }
}
