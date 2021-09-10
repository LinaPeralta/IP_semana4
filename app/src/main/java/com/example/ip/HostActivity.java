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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);

        regresarBtn2=  findViewById(R.id.regresarBtn2);
        hostText = findViewById(R.id.hostText);

        regresarBtn2.setOnClickListener((view)->{
            Intent mainIntent = new Intent(this,MainActivity.class);
            startActivity(mainIntent);

            // overridePendingTransition(R.anim.animacion1,R.anim.animacion2);
        });
    }
}