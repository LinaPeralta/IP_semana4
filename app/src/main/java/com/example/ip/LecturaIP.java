package com.example.ip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LecturaIP extends AppCompatActivity {

    private TextView pingText;
    private Button regresarBtn1;
    private int uno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectura_ip);

        regresarBtn1 =  findViewById(R.id.regresarBtn1);
        pingText = findViewById(R.id.pingText);


     //  uno = getIntent().getExtras().getInt("uno");

        regresarBtn1.setOnClickListener((view)->{
            Intent mainIntent = new Intent(this,MainActivity.class);
            startActivity(mainIntent);

            // overridePendingTransition(R.anim.animacion1,R.anim.animacion2);
        });
    }
}