package com.anila.telu.proyek2_jmp_a_anila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Halaman Login");

        TextInputLayout etUsername = findViewById(R.id.et_username);
        TextInputLayout etPassword = findViewById(R.id.et_password);
        Button bLogin = findViewById(R.id.b_login);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Ambil Input Username Dan Password
                String username = etUsername.getEditText().getText().toString();
                String password = etPassword.getEditText().getText().toString();

                if (username.equals("anila") && password.equals("123")){
                    finish();
                    Intent intent = new Intent(MainActivity.this, DaftarNegaraActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Username/Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}