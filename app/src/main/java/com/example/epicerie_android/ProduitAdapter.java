package com.example.epicerie_android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;
public class ProduitAdapter extends ArrayAdapter {

    private List<Produit> produits;
    public ProduitAdapter(Context context, int layoutId, List<Produit> produits){
        super(context,layoutId,produits);
        this.produits=produits;

    }
    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent){
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);

        Produit produit= produits.get(position);

        TextView nomProduit=convertView.findViewById(R.id.nomProduit);
        TextView descriptionProduit=convertView.findViewById(R.id.descriptionProduit);

        nomProduit.setText(produit.getNom());
        descriptionProduit.setText(produit.getDescription());

       return convertView;
    }
}
