package com.example.cursotres;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class VistaDos extends AppCompatActivity {
    private Button btnDos;
    EditText nombre,telefono,email,descripcion;
    CalendarView calendario;
    public String fecha="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_dos);
        btnDos = (Button)findViewById(R.id.button2);
        nombre = findViewById(R.id.txtNombre);
        telefono = findViewById(R.id.txtTelefono);
         calendario = findViewById(R.id.calendario);

        email = findViewById(R.id.txtEmail);
        descripcion = findViewById(R.id.txtDescripcion);


        calendario.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar calendar = Calendar.getInstance();
                calendar.set(year, month, dayOfMonth);
                String sDate = sdf.format(calendar.getTime());
                fecha =sDate;

            }
        });



        btnDos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Intent intent = new Intent(VistaDos.this,VistaDatos.class);
                intent.putExtra(getResources().getString(R.string.nombre),nombre.getText().toString());
                intent.putExtra(getResources().getString(R.string.telefono),telefono.getText().toString());
                intent.putExtra(getResources().getString(R.string.email),email.getText().toString());
                intent.putExtra(getResources().getString(R.string.descripcion),descripcion.getText().toString());
                if(fecha =="" || fecha ==null){
                    fecha = "00/00/0000";

                    System.out.println("llego");
                }else {

                    fecha = fecha;
                }
               intent.putExtra("Calendario",fecha);

                startActivity(intent);
            }
        });
    }
    }

