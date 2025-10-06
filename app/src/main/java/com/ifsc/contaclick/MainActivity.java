package com.ifsc.contaclick;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ListView lvLista;

    String[] nomes = new String[] {"João", "Maria", "Clara", "Arthur", "Baunilha"};
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        lvLista = findViewById(R.id.lvLista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes);

        lvLista.setAdapter(adapter);
        lvLista.setOnItemClickListener((parent, view, position, id) ->{
            Toast.makeText(this, Integer.toString(position)+nomes[position], Toast.LENGTH_SHORT).show();

        });

    }


}