package com.example.exercicio6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        String pedido = "";
        Intent in;
        in = getIntent();

        pedido = in.getExtras().getString("pedido");

        String finalPedido = pedido;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,ResumoPedido.class);
                intent.putExtra("pedido", finalPedido);
                startActivity(intent);
            }
        },4000);
    }
}