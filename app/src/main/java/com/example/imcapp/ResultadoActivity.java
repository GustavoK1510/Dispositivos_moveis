package com.example.imcapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView textImc, textClassificacao;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textImc = findViewById(R.id.textImc);
        textClassificacao = findViewById(R.id.textClassificacao);
        btnVoltar = findViewById(R.id.btnVoltar);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            double imc = bundle.getDouble("IMC");
            textImc.setText(String.format("Seu IMC: %.2f", imc));
            textClassificacao.setText(classificarImc(imc));
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private String classificarImc(double imc) {
        if (imc < 18.5)
            return "Classificação: Abaixo do peso";
        else if (imc < 24.9)
            return "Classificação: Peso normal";
        else if (imc < 29.9)
            return "Classificação: Sobrepeso";
        else if (imc < 34.9)
            return "Classificação: Obesidade grau 1";
        else if (imc < 39.9)
            return "Classificação: Obesidade grau 2";
        else
            return "Classificação: Obesidade grau 3";
    }
}
