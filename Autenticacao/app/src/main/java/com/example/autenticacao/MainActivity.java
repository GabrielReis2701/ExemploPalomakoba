package com.example.autenticacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_Login,et_Senha;
    Button bt_Entrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Login = findViewById(R.id.et_Login);
        et_Senha = findViewById(R.id.et_Senha);
        bt_Entrar = findViewById(R.id.bt_Entrar);

        bt_Entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = et_Login.getText().toString();
                String senha = et_Senha.getText().toString();
                if(login.equals("usuario")&& senha.equals("1234")){
                    Toast.makeText(MainActivity.this, "Acesso Permitido", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Acesso Negado", Toast.LENGTH_SHORT).show();
                }
                et_Login.setText("");
                et_Senha.setText("");
            }
        });
    }
}