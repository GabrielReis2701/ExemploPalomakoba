package com.example.primeiroprograma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.primeiroprograma.service.Dolar;
import com.example.primeiroprograma.service.HTTPService;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    EditText et_ValorDolar;
    Button bt_Converte,bt_Atualizar;
    TextView tv_ValorEmReais,tv_CDolar;
    double DolarHoje;
    String dh;
    Date hoje = new Date();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_ValorDolar = findViewById(R.id.et_ValorDolar);
        bt_Converte = findViewById(R.id.bt_Converte);
        tv_ValorEmReais = findViewById(R.id.tv_ValorEmReais);
        bt_Atualizar = findViewById(R.id.bt_Atualizar);
        tv_CDolar = findViewById(R.id.tv_CDolar);

        bt_Atualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HTTPService service = new HTTPService();
                try {
                  Dolar d = service.execute().get();
                  tv_CDolar.setText(d.toString());
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        bt_Converte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ValorDolar = Double.parseDouble(et_ValorDolar.getText().toString());
                DecimalFormat arredondar = new DecimalFormat("#.##");
                double ValorEmReais = ValorDolar*5.57;
                tv_ValorEmReais.setText("R$ "+ ValorEmReais);
                System.out.print(hoje);

            }
        });

    }
}