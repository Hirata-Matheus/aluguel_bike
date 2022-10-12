package com.example.aluguelbicicleta;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aluguelbicicleta.activity.ListaBicicletasActivity;

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

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Spinner spinner = findViewById(R.id.estado);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.arrayEstado, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);*/

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
    }
    /*@Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }*/
}