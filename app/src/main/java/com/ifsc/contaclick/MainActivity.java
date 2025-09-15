package com.ifsc.contaclick;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;

    EditText edPeso, edMetros;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        edPeso = findViewById(R.id.edPeso);
        edMetros = findViewById(R.id.edMetros);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(v->{
            Intent i = new Intent(this, ImcResultado.class);
            Bundle b = new Bundle();
            double peso = Double.parseDouble(edPeso.getText().toString());
            double metros = Double.parseDouble(edMetros.getText().toString());
            b.putDouble("peso",peso);
            b.putDouble("metros",metros);
            i.putExtras(b);
            startActivity(i);
        });
    }



}