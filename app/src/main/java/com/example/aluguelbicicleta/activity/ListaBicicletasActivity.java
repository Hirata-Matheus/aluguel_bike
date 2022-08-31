package com.example.aluguelbicicleta.activity;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.aluguelbicicleta.R;
import com.example.aluguelbicicleta.model.Bicicleta;

import java.util.List;

public class ListaBicicletasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_bikes);

        //List<Bicicleta> bikes = todosAsBikes();

        ListView listaBikes = (ListView) findViewById(R.id.lista);
        estou aqui japones

    }
}
