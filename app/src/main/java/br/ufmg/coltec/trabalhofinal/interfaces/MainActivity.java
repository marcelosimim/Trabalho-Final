package br.ufmg.coltec.trabalhofinal.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import br.ufmg.coltec.trabalhofinal.R;
import br.ufmg.coltec.trabalhofinal.data.InsertDataActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button btnRegister;
    private Button banco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtons();
    }

    private void setButtons(){
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);

        btnLogin.setOnClickListener(view ->{
            Intent loginActivity = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(loginActivity);
        });

        btnRegister.setOnClickListener(view -> {
            Intent registerActivity = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(registerActivity);
        });

        banco = findViewById(R.id.admin);
        banco = findViewById(R.id.admin);
        banco.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, InsertDataActivity.class);
            startActivity(intent);
        });
    }


}