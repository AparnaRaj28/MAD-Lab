package com.example.exc5;  //imported package

import androidx.appcompat.app.AppCompatActivity; // default libraries imported

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity { //program starts

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickbutton=findViewById(R.id.button1);
        clickbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked this button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
