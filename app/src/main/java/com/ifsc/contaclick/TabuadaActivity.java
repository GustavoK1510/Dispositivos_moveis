package com.ifsc.contaclick;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class TabuadaActivity extends AppCompatActivity {

    EditText tabuada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tabuada_activity);
        tabuada=findViewById(R.id.tabuada);

        Intent i = getIntent();
        Bundle b = i.getExtras();
        Integer n = b.getInt("numero");
        String n1 = n.toString();
        int numero1 = b.getInt("numero");
        String tab = "";
        Integer numerotabuada = 1;
        Integer f = 1;
        String tabfinal = "";

        for (f = 1; f<=10; f++){
            String n2 = f.toString();
            numerotabuada = numero1*f;
            String conta = numerotabuada.toString();
             tab = n + " x " + n2 + " = " + conta ;
             tabfinal += tab;
        }
         tabuada.setText(tabfinal);

    }

}
