package com.proyecto.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Leonardo on 29/04/2017.
 */

public class ActividadDos extends AppCompatActivity {
    private TextView tv_nombre;
    private Button btn_dos;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_dos);

        //recogemos el texto de la vista 1
        tv_nombre = (TextView) findViewById(R.id.tv_nombre);
        Bundle bundle = this.getIntent().getExtras(); //recibimos el bundle del intent
        tv_nombre.setText("Hola "+ bundle.getString("nombre")); //la llave era "nombre" (su clave)

        //Boton para volver a la vista 1
        btn_dos = (Button) findViewById(R.id.btn_dos);
        btn_dos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ActividadDos.this,ActividadUno.class); //Intencion, parte de "a" hacia "b"
                startActivity(intent);//inicie la actividad has esto "intent"
                //Toast.makeText(ActividadDos.this,"Boton Presionando 2",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
