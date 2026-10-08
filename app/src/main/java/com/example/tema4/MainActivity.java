package com.example.tema4;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        // Conectamos la variable de Java con el ID del texto en XML
        TextView miTexto = (TextView) findViewById(R.id.texto);

        // Modificamos sus atributos por código
        miTexto.setText("Nuevo texto a mostrar");
        miTexto.setTextColor(Color.RED);
        miTexto.setTextSize(24);
        miTexto.setTypeface(Typeface.SANS_SERIF);
    }
}