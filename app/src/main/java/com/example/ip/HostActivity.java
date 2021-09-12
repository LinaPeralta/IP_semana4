package com.example.ip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HostActivity extends AppCompatActivity {


    private TextView hostText;
    private Button regresarBtn2;
    private String hosts;
    private String host1,host2,host3,host4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);

        regresarBtn2=  findViewById(R.id.regresarBtn2);
        hostText = findViewById(R.id.hostText);

        Intent hostUno =getIntent();
        Intent hostDos =getIntent();
        Intent hostTres =getIntent();

        host1= hostUno.getStringExtra("host1");
        host2= hostDos.getStringExtra("host2");
        host3= hostTres.getStringExtra("host3");






        regresarBtn2.setOnClickListener((view)->{
            Intent mainIntent = new Intent(this,MainActivity.class);
            startActivity(mainIntent);

            // overridePendingTransition(R.anim.animacion1,R.anim.animacion2);
        });
    }
}