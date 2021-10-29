package com.example.exercicio6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb_Vinho,cb_Agua,cb_Pizza,cb_Lazanha;
    Button bt_Ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb_Agua = findViewById(R.id.cb_Agua);
        cb_Lazanha = findViewById(R.id.cb_Lazanha);
        cb_Pizza = findViewById(R.id.cb_Pizza);
        cb_Vinho = findViewById(R.id.cb_Vinho);
        bt_Ok = findViewById(R.id.bt_Ok);

        bt_Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pedido = "";
                if(cb_Agua.isChecked()){
                    pedido += "1 Agua \n";
                }
                if(cb_Pizza.isChecked()){
                    pedido += "1 Pizza \n";
                }
                if(cb_Lazanha.isChecked()){
                    pedido += "1 Lazanha \n";
                }
                if(cb_Vinho.isChecked()){
                    pedido += "1 Vinho";
                }
                if(pedido.equals("")){
                    Toast.makeText(MainActivity.this, "Pedido Vazio", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity.this,SplashScreen.class);
                    intent.putExtra("pedido",pedido);
                    startActivity(intent);
                }
            }
        });


    }
}