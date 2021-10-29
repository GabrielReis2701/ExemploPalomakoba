package com.example.conversordemoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_ValorReais;
    Button bt_Dolar,bt_Euro,bt_Peso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_ValorReais = findViewById(R.id.et_ValorReais);
        bt_Dolar = findViewById(R.id.bt_Dolar);
        bt_Euro = findViewById(R.id.bt_Euro);
        bt_Peso = findViewById(R.id.bt_Peso);

        bt_Dolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ValorReais = Double.parseDouble(et_ValorReais.getText().toString());
                double ValorDolar = ValorReais/5.57;
                Toast.makeText(MainActivity.this, "R$ "+ValorReais+" são $us "+ValorDolar, Toast.LENGTH_SHORT).show();

            }
        });

        bt_Euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ValorReais = Double.parseDouble(et_ValorReais.getText().toString());
                double ValorEuro = ValorReais/6.57;
                Toast.makeText(MainActivity.this, "R$ "+ValorReais+" são $EU "+ValorEuro, Toast.LENGTH_SHORT).show();

            }
        });

        bt_Peso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ValorReais = Double.parseDouble(et_ValorReais.getText().toString());
                double ValorPeso = ValorReais/18;
                Toast.makeText(MainActivity.this, "R$ "+ValorReais+" são $"+ValorPeso, Toast.LENGTH_SHORT).show();

            }
        });
    }
}