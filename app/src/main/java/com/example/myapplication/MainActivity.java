package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button miBoton;
    private EditText us;
    private EditText con;
    private TextView prueb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        us=(EditText)findViewById(R.id.txtUsuario);
        con=(EditText)findViewById(R.id.txtContraseña);



        String usuarios []={"daniel","hector", "alvaro"};
        String contraseñas []={"adsf", "copito", "elpescador"};



    }

    public void inicioSesion(View view){
        String usuario1 = "Hector";
        String contraseña1 = "Copito";
        String nuevoUsuario = "Nava";
        String nuevaContraseña ="123456" ;
        String usuar=us.getText().toString();
        String contra=con.getText().toString();

        if(usuar.equals(usuario1) && contra.equals(contraseña1)){
            Intent siguiente = new Intent(this, SegundoActivity.class);
            startActivity(siguiente);
            Toast.makeText(getApplicationContext(), "Inicio de sesion exitosa", Toast.LENGTH_LONG).show();

        }else{
            if(usuar.equals(nuevoUsuario) && contra.equals(nuevaContraseña)){
                Intent siguiente = new Intent(this, SegundoActivity.class);
                startActivity(siguiente);
                Toast.makeText(getApplicationContext(), "Inicio de sesion exitosa", Toast.LENGTH_LONG).show();


            }else{
                Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrecta", Toast.LENGTH_LONG).show();
            }

        }



    }
    public void registrarse(View view){

        Intent actRegistrarse = new Intent(this, ActivityRegistrarse.class);
        startActivity(actRegistrarse);

    }


}
/*miBoton = (Button)findViewById(R.id.btnPrueba);
        miBoton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "prueba", Toast.LENGTH_LONG).show();
        }
        });
        for(int i=0;i>=5;i++){

        if(usuarios[i]==contraseñas[i]){
        Toast.makeText(getApplicationContext(),"HOLA", Toast.LENGTH_SHORT).show();

        }

        }*/