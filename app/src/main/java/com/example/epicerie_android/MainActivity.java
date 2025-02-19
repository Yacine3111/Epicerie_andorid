package com.example.epicerie_android;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Produit> produits=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.listProduit);
        ProduitAdapter produitAdapter=new ProduitAdapter(this,R.layout.item,produits);


        produits.add(new Produit("produit1","description1"));

        listView.setAdapter(produitAdapter);


    }
}