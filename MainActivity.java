package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<gestionebrani> extends AppCompatActivity {
    gestionebrani gb;
    Button btnInserisci;
    EditText txtTitolo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gb= new gestionebrani();
        txtTitolo=findViewById(R.id.titolo);
        btnInserisci=findViewById(R.id.btnInserisci);
        gb= new Gestionebrani();
        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gb.addBrano(String txtTitolo.getText().toString());

            }
        });



    }
}
