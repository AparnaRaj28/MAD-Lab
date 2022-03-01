package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner s=(Spinner)findViewById(R.id.spinner);
        s.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> a=ArrayAdapter.createFromResource(this,R.array.a1, android.R.layout.simple_spinner_item);
        a.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        s.setAdapter(a);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "Item selected"+adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
