package com.example.intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Fetching values into a bundle
        Bundle extras=getIntent().getExtras();
        //Extracting the string with id 'value' from the bundle
        TextView t;
        String v=extras.getString("value");
        t=(TextView)findViewById(R.id.textview);
        t.setText(t.getText()+" "+v);

    }
}
