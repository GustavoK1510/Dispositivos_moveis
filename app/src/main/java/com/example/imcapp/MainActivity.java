package com.example.imcapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso, editAltura;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pesoStr = editPeso.getText().toString();
                String alturaStr = editAltura.getText().toString();

                if (!pesoStr.isEmpty() && !alturaStr.isEmpty()) {

                    double peso = Double.parseDouble(pesoStr);
                    double altura = Double.parseDouble(alturaStr);

                    double imc = peso / (altura * altura);

                    Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);

                    Bundle bundle = new Bundle();
                    bundle.putDouble("IMC", imc);

                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
    }
}
