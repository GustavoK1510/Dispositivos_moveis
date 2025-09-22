package com.ifsc.contaclick;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        numero=findViewById(R.id.numero);
        Button b=findViewById(R.id.button);

        b.setOnClickListener(v -> {
            Integer n = Integer.parseInt(numero.getText().toString());
            String numero = n.toString();
            Intent i = new Intent(this, TabuadaActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("numero", numero);
            i.putExtras(bundle);
            startActivity(i);
        });

    }


}