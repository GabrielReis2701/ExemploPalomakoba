package com.example.testenome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_InsereN;
    TextView tv_Nome;
    Button bt_Insere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_InsereN = findViewById(R.id.et_InsereN);
        tv_Nome = findViewById(R.id.tv_Nome);
        bt_Insere = findViewById(R.id.bt_Insere);

        bt_Insere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String nome = et_InsereN.getText().toString();

               tv_Nome.setText("Bem Vindo "+nome);

            }
        });

    }
}