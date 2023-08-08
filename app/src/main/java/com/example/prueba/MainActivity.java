package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_ingreso);
        EditText text = findViewById(R.id.edit_nombre);
                button.setOnClickListener(v -> {
                    if (!text.equals("")) {
                        String name = text.getText().toString();
                        Toast.makeText(this,"Bienvenido $name " ,Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(this, "Nombre Vacio" , Toast.LENGTH_SHORT).show();


                    }


                });




        };
    }