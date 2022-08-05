package com.anila.telu.proyek2_jmp_a_anila;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DaftarNegaraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_negara);

        getSupportActionBar().setTitle("Halaman List Negara");

        //Daftar Negara Yang Tampil Awal
        ArrayList<String> alNegara = new ArrayList<>();
        alNegara.add("Indonesia");
        alNegara.add("Malaysia");
        alNegara.add("Kamboja");
        alNegara.add("Timor leste");
        alNegara.add("Singapore");

        EditText etNegara = findViewById(R.id.et_negara);
        Button button = findViewById(R.id.button);
        ListView lvNegara = findViewById(R.id.lv_negara);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alNegara);
        lvNegara.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaNegara = etNegara.getText().toString();
                if(!namaNegara.equals("")){
                    //Cara 1
                    //adapter.add(namaNegara);

                    //Cara 2
                    alNegara.add(namaNegara);
                    adapter.notifyDataSetChanged();
                    etNegara.setText("");
                }else{
                    Toast.makeText(DaftarNegaraActivity.this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}