package com.ifsc.contaclick;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int contador = 0;
    private EditText tvContador;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvContador = findViewById(R.id.tvContador);
        button = findViewById(R.id.button);

        tvContador.setText(String.valueOf(contador));

        Log.d("CicloDeVida", "onCreate");

        button.setOnClickListener(v -> {
            contador++;
            tvContador.setText(String.valueOf(contador));
            Log.d("Contador", "Contador: " + contador);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CicloDeVida", "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CicloDeVida", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CicloDeVida", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CicloDeVida", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CicloDeVida", "onDestroy");
    }




}