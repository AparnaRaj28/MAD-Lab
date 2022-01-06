package com.example.exc6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickbutton=findViewById(R.id.button1);
        final TextView mytext=findViewById(R.id.text);
        clickbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mytext.setText("Hello all...");
            }
        });
    }
}
