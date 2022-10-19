package com.example.aluguelbicicleta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aluguelbicicleta.activity.CadastroBikeActivity;
import com.example.aluguelbicicleta.activity.ListaBicicletasActivity;
import com.example.aluguelbicicleta.model.Usuario;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String modelosBikes[] = {
            "Neo Sport",
            "Bike Top das Galáxias",
            "Bike da Avó",
            "XTS Pro Bike",
            "Caloi 304 XL"
    };

    private String categoriasBikes[] = {
            "Sportiva",
            "Lendária",
            "Básica",
            "Profissional",
            "Intermediária"
    };

    private Integer fotosBikes[] = {
            R.drawable.bike1,
            R.drawable.bike2,
            R.drawable.bike3,
            R.drawable.bike3,
            R.drawable.bike7
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button b1 ;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titulo = new TextView(this);
        titulo.setTypeface(Typeface.DEFAULT_BOLD);
        titulo.setText("Lista de Bicicletas");
        titulo.setTextSize(30);
        titulo.setPadding(0, 0, 0, 30);

        ListView listView = (ListView) findViewById(R.id.lista);
        listView.addHeaderView(titulo);

        ListaBicicletasActivity customCountryList = new ListaBicicletasActivity(this, modelosBikes, categoriasBikes, fotosBikes);
        listView.setAdapter(customCountryList);

        listView.setOnItemClickListener((adapterView, view, position, l) -> Toast.makeText(getApplicationContext(),"Você Selecionou " + modelosBikes[position-1] + " o Modelo", Toast.LENGTH_SHORT).show());

        b1 = findViewById(R.id.page2);
        b1.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, CadastroBikeActivity.class);
                    startActivity(intent);
                }
            }
        );

    }

}