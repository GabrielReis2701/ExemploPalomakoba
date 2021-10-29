package com.example.tipolayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_ValorDolar;
    Button bt_Converte;
    TextView tv_ValorEmReais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_ValorDolar = findViewById(R.id.et_ValorDolar);
        bt_Converte = findViewById(R.id.bt_Converte);
        tv_ValorEmReais = findViewById(R.id.tv_ValorEmReais);

        bt_Converte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double ValorD =  Double.parseDouble(et_ValorDolar.getText().toString());
               double ValorR = ValorD/5.57;
               tv_ValorEmReais.setText("$US "+ValorR);
            }
        });
    }
}