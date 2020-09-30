package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityRegistrarse extends AppCompatActivity {

    public EditText newUsu;
    public EditText newContra;
    public EditText newContra2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        newUsu=(EditText)findViewById(R.id.txtUsuario2);
        newContra=(EditText)findViewById(R.id.txtContra1);
        newContra2=(EditText)findViewById(R.id.txtContra2);
    }
    public void registrarUsuario(View view){
        String nuevoUsuario;
        String nuevaContraseña;
        String usu1 = newUsu.getText().toString();
        String contra1 = newContra.getText().toString();
        String contra2 = newContra2.getText().toString();

        if(usu1.isEmpty()){
            Toast.makeText(getApplicationContext(), "Ingrese su nuevo usuario", Toast.LENGTH_LONG).show();
        }else{
            if(!contra1.equals(contra2)){
                Toast.makeText(getApplicationContext(), "No coinciden las contraseñas", Toast.LENGTH_LONG).show();
            }else{
                nuevoUsuario = usu1;
                nuevaContraseña = contra1;
                Toast.makeText(getApplicationContext(), "Registro exitoso", Toast.LENGTH_LONG).show();
                Intent principal = new Intent(this, MainActivity.class);
                startActivity(principal);
            }
        }


    }
}