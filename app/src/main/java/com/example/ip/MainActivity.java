package com.example.ip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText unoText;
    private EditText dosText;
    private EditText tresText;
    private EditText cuatroText;
    private Button pingBtn;
    private Button hostBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        unoText = findViewById(R.id.unoText);
        dosText = findViewById(R.id.dosText);
        tresText = findViewById(R.id.tresText);
        cuatroText = findViewById(R.id.cuatroText);

        pingBtn = findViewById(R.id.pingBtn);
        hostBtn = findViewById(R.id.hostBtn);


        pingBtn.setOnClickListener((view)->{

            //caracteres IP
            String uno = unoText.getText().toString();
            String dos = dosText.getText().toString();
            String tres = tresText.getText().toString();
            String cuatro= cuatroText.getText().toString();

            Intent ipIntent = new Intent(this,LecturaIP.class);
            startActivity(ipIntent);

            //limpiar campo de texto
            unoText.getText().clear();
            dosText.getText().clear();
            tresText.getText().clear();
            cuatroText.getText().clear();
        

           // overridePendingTransition(R.anim.animacion1,R.anim.animacion2);
        });

        hostBtn.setOnClickListener((view)->{
            Intent hostIntent = new Intent(this,HostActivity.class);
            startActivity(hostIntent);

            // overridePendingTransition(R.anim.animacion1,R.anim.animacion2);
        });
    }
}