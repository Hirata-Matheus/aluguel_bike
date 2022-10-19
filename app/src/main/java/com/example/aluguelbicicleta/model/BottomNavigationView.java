package com.example.aluguelbicicleta.model;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aluguelbicicleta.MainActivity;
import com.example.aluguelbicicleta.R;

public class BottomNavigationView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b2;

        b2 = findViewById(R.id.page_2);
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(BottomNavigationView.this, Usuario.class);
                        startActivity(i);
                    }
                }
        );

    }
}
