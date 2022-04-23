package com.example.tugas1akb_10119254;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrasi extends AppCompatActivity {

    Button btnKembali, btnRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        btnRegis = (Button)findViewById(R.id.btn_regist);
        btnKembali = (Button)findViewById(R.id.btn_kembali);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registrasi.this, Login.class);
                startActivity(intent);
            }

        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registrasi.this, Login.class);
                startActivity(intent);
            }

        });
    }

}