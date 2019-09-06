package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {
    private TextView tvHasil;
    private Button btnHitung;
    private EditText etPanjang, etLebar, etTinggi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BTG", MainActivity.class.getSimpleName() + "onCreate");
        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        btnHitung = findViewById(R.id.btnHitung);
        tvHasil = findViewById(R.id.tvHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer panjang = Integer.parseInt(etPanjang.getText().toString());
                Integer lebar = Integer.parseInt(etLebar.getText().toString());
                Integer tinggi = Integer.parseInt(etTinggi.getText().toString());

                tvHasil.setText(String.valueOf(panjang*lebar*tinggi));
            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BTG", MainActivity.class.getSimpleName() + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BTG", MainActivity.class.getSimpleName() + "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BTG", MainActivity.class.getSimpleName() + "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BTG", MainActivity.class.getSimpleName() + "onRestart");
    }
}


