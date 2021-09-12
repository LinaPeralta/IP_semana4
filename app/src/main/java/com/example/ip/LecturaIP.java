package com.example.ip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LecturaIP extends AppCompatActivity {

    private TextView pingText;
    private Button regresarBtn1;
    private String IP;
    private String texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectura_ip);

        regresarBtn1 =  findViewById(R.id.regresarBtn1);
        pingText = findViewById(R.id.pingText);


        texto = " ";
        pingText= findViewById(R.id.pingText);
        IP= getIntent().getExtras().getString("IP");


        new Thread(() -> {


            for (int m = 0; m < 5; m++) {

                try {
                    InetAddress searchIp = InetAddress.getByName(IP);

                    if (searchIp.isReachable(1000)) {
                        texto += "RECIBIDO\n";
                        pingText.setText(texto);
                    } else {
                        texto += "PERDIDO\n";
                        pingText.setText(texto);
                    }
                    runOnUiThread(() -> {
                        pingText.setText(texto);
                    });

                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        regresarBtn1.setOnClickListener((view)->{
            Intent mainIntent = new Intent(this,MainActivity.class);
            startActivity(mainIntent);

            // overridePendingTransition(R.anim.animacion1,R.anim.animacion2);
        });

    }
}