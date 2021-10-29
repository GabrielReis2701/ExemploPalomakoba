package com.example.exercicio6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResumoPedido extends AppCompatActivity {
    TextView tv_ResumoP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pedido);

        tv_ResumoP = findViewById(R.id.tv_ResumoP);

        String pedido;
        Intent i;
        i = getIntent();
        pedido = i.getExtras().getString("pedido");
        tv_ResumoP.setText("O Seu pedido é: \n"+pedido);
    }
}