package com.example.voltify;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Gestorebrani extends AppCompatActivity {
    ListView Listabrani;
    ArrayList<Brano> Listabrani;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Gestorebrani);
        Listabrani=findViewById(R.id.Listabrani);
    }
    public void addBrano(String titolo){
        Brano br =new Brano(titolo);
        Listabrani.add(br);
    }
    public void visualizza(){
        Listabrani.setAdapter((ListAdapter) Listabrani);
    }
    }


