package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity<gestionebrani> extends AppCompatActivity {
    Gestionebrani gb;
    Button btnInserisci;
    EditText txtTitolo;
    Spinner spnGenere;
    String[] elencoGeneri={"rap","punk"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gb= new gestionebrani();
        txtTitolo=findViewById(R.id.titolo);
        btnInserisci=findViewById(R.id.btnInserisci);
        spnGenere = (Spinner)findViewById(R.id.spnGenere);

        ArrayAdapter<String> spGen = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, elencoGeneri);

        spnGenere.setAdapter(spGen);

        gb= new Gestionebrani();
        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                

                gb.addBrano(txtTitolo.getText().toString());

            }
        });



    }
}
