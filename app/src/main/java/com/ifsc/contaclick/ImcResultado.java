package com.ifsc.contaclick;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ImcResultado extends AppCompatActivity {
    Button b;

    TextView txtIMC;

    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        txtIMC = findViewById(R.id.txtIMC);
        imageView2 = findViewById(R.id.imageView2);
        setContentView(R.layout.activity_imc_resultado);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        double peso = b.getDouble("peso");
        double metros = b.getDouble("metros");


        double imc = peso/(metros*metros);

        txtIMC.setText(Double.toString(imc));
    }
}