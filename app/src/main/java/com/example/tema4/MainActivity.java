package com.example.tema4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 1. Cargamos el nuevo layout de RadioButton
        setContentView(R.layout.layout_radiobutton);

        // 2. Referenciamos los componentes
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        Button btnComprobar = findViewById(R.id.btnComprobar);
        TextView tvResultado = findViewById(R.id.tvResultado);

        // 3. Al pulsar el botón, comprobamos qué opción está marcada
        btnComprobar.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId != -1) {
                RadioButton selectedRadioButton = findViewById(selectedId);
                String selectedOption = selectedRadioButton.getText().toString();
                tvResultado.setText("Seleccionado: " + selectedOption);
            } else {
                tvResultado.setText("No se ha seleccionado ninguna opción");
            }
        });
    }
}