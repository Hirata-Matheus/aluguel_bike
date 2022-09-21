package com.example.aluguelbicicleta.activity;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.aluguelbicicleta.R;

public class ListaBicicletasActivity extends ArrayAdapter {
    private String[] bikesModel;
    private String[] categorias;
    private Integer[] fotosBikes;
    private Activity descricao;

    public ListaBicicletasActivity(Activity descricao, String[] bikesModel, String[] categorias, Integer[] fotosBikes) {
        super(descricao, R.layout.item_linha, bikesModel);
        this.descricao = descricao;
        this.bikesModel = bikesModel;
        this.categorias = categorias;
        this.fotosBikes = fotosBikes;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        LayoutInflater inflater = descricao.getLayoutInflater();
        if(convertView==null)
        row = inflater.inflate(R.layout.item_linha, null, true);
        TextView textViewCountry = (TextView) row.findViewById(R.id.txtViewModelo);
        TextView textViewCapital = (TextView) row.findViewById(R.id.txtViewCategoria);
        ImageView imageFlag = (ImageView) row.findViewById(R.id.fotoBikeFlag);

        textViewCountry.setText(bikesModel[position]);
        textViewCapital.setText(categorias[position]);
        imageFlag.setImageResource(fotosBikes[position]);
        return  row;
    }
}