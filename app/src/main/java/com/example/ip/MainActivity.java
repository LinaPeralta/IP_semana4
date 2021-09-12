package com.example.ip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {


    private EditText unoText;
    private EditText dosText;
    private EditText tresText;
    private EditText cuatroText;
    private Button pingBtn;
    private Button hostBtn;
    private TextView leerIP;
    private int uno,dos,tres,cuatro;
    private String host1,host2,host3,host4;
    private String IP;



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

        leerIP = findViewById(R.id.leerIP);


        //PANTALLA PING
        pingBtn.setOnClickListener((view)->{

            //caracteres IP
            uno = Integer.parseInt(unoText.getText().toString());
            dos = Integer.parseInt(dosText.getText().toString());
            tres = Integer.parseInt(tresText.getText().toString());
            cuatro= Integer.parseInt(cuatroText.getText().toString());


            IP= uno+"."+dos+"."+tres+"."+cuatro;
            //ping(ip);

            Intent ipIntent = new Intent(this,LecturaIP.class);
            ipIntent.putExtra("IP", IP);
            startActivity(ipIntent);

            //limpiar campo de texto
            unoText.getText().clear();
            dosText.getText().clear();
            tresText.getText().clear();
            cuatroText.getText().clear();

           // overridePendingTransition(R.anim.animacion1,R.anim.animacion2);
        });

      new Thread(()->{

          try{
              InetAddress IPlocal = InetAddress.getLocalHost();
              runOnUiThread(()-> leerIP.setText(IPlocal.getHostAddress()));

          }catch (UnknownHostException e){
              e.printStackTrace();
          }

      }).start();


        //PANTALLA HOST
        hostBtn.setOnClickListener((view)->{


            uno = Integer.parseInt(unoText.getText().toString());
            dos = Integer.parseInt(dosText.getText().toString());
            tres = Integer.parseInt(tresText.getText().toString());
            cuatro= Integer.parseInt(cuatroText.getText().toString());


            Intent hostIntent = new Intent(this,HostActivity.class);

            hostIntent.putExtra("host1", host1);
            hostIntent.putExtra("host2", host2);
            hostIntent.putExtra("host3", host3);
           // hostIntent.putExtra("host4", host4);

            startActivity(hostIntent);

            // overridePendingTransition(R.anim.animacion1,R.anim.animacion2);
        });
    }
}