package com.example.cursotres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VistaDatos extends AppCompatActivity {
 private Button btnTres;
 public String nuveoNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_datos);
        Bundle paramtros = getIntent().getExtras();
        btnTres = (Button)findViewById(R.id.button3);

        String nombre = paramtros.getString(getResources().getString(R.string.nombre));
        String telefono = paramtros.getString(getResources().getString(R.string.telefono));
        String email = paramtros.getString(getResources().getString(R.string.email));
      //  String  calendario = paramtros.getString("Calendario",getResources().getString(R.string.calendario));
        String  calendario = paramtros.getString("Calendario");
        String descripcion =paramtros.getString(getResources().getString(R.string.descripcion));

       TextView  txtNombre = (TextView)findViewById(R.id.txtNombre);
        TextView  txtTelefono = (TextView)findViewById(R.id.txtTelefono);
        TextView  txtEmail = (TextView)findViewById(R.id.txtEmail);
        TextView txtFecha = (TextView)findViewById(R.id.txtCalendario);
        TextView txtDescripcion = (TextView)findViewById(R.id.txtDescripcion);

        txtNombre.setText(nombre);
        txtTelefono.setText("Tel. "+telefono);
        txtEmail.setText("Email: "+email);
        txtFecha.setText("Fecha Nacimiento: "+calendario);
        txtDescripcion.setText("Descripción: "+descripcion);


        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });


    }
}
