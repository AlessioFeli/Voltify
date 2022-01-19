package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btnInserisci;
    Button btnVisualizza;
    EditText txtTitolo;
    Spinner spnGenere;
    String[] elencoGeneri={"rap","punk"};
    Gestorebrani gb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInserisci=findViewById(R.id.btnInserisci);
        txtTitolo=findViewById(R.id.titolo);
        spnGenere = (Spinner)findViewById(R.id.spnGenere);

        ArrayAdapter<String> spGen = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, elencoGeneri);
        spnGenere.setAdapter(spGen);
        gb= new Gestorebrani();
        btnInserisci.setOnClickListener(new View.OnClickListener() {
            new View.OnClickListener(){
                public void onClick(View view) {


                    gb.addBrano(txtTitolo.getText().toString());
                 }
            }
        });

        btnVisualizza.setOnClickListener(
                new Button.OnClickListener(){
                    public void onclick(View v)
                    gb.visualizza()
                    Intent i = new Intent(MainActivity.this, Gestorebrani.class);

                    startActivity(i)


                }
        );



    }
}
