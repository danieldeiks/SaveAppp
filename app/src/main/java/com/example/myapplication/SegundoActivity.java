package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SegundoActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText res;

    ImageView resultado1;
    Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        res=(EditText)findViewById(R.id.txtBusqueda);



        //findViewById(R.id.imgLupita).setOnClickListener(this);

    }
    public void cerrarSesion(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
        Toast.makeText(getApplicationContext(), "Cerrando sesión", Toast.LENGTH_LONG).show();
    }
    public void buscarProducto(View view){
        String busqueda=res.getText().toString();
        String resultado1 = "Jabón axion";

        if(busqueda.equals(resultado1)){

            Intent resul = new Intent(this, ResultadoActivity.class);
            startActivity(resul);
            Toast.makeText(getApplicationContext(), "Producto encontrado", Toast.LENGTH_SHORT).show();


    }else{
            Toast.makeText(getApplicationContext(), "Producto no encontrado", Toast.LENGTH_SHORT).show();
       }

   }

    @Override
    public void onClick(View v) {

        resultado1.setVisibility(View.VISIBLE);


    }
}
