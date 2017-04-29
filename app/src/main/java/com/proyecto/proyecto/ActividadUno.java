package com.proyecto.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Leonardo on 29/04/2017.
 */

public class ActividadUno extends AppCompatActivity{
    private Button btn_uno;
    private EditText et_name;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_uno);

        //Identificamos EditText
        et_name = (EditText)findViewById(R.id.et_name);
        //Identificamos Boton
        btn_uno = (Button) findViewById(R.id.btn_uno);

        btn_uno.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent = new Intent(ActividadUno.this,ActividadDos.class); //Intencion, parte de "a" hacia "b"

                    Bundle  bundle = new Bundle();//se crea un bundle para poder enviar el texto contenifo
                    bundle.putString("nombre",et_name.getText().toString()); //"nombre" es la clave
                    intent.putExtras(bundle);
                    
                    startActivity(intent);//inicie la actividad has esto "intent"
                    //Toast.makeText(ActividadUno.this,"Boton Presionando 1",Toast.LENGTH_SHORT).show();
                }
        });
    }


}
