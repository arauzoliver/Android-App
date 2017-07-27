package com.example.soporte.prueba_bd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Provider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.provider);

         Button btn1 = (Button) findViewById(R.id.button1);
         Button btn2 = (Button) findViewById(R.id.button2);
         Button btn3 = (Button) findViewById(R.id.button3);
         Button btn4 = (Button) findViewById(R.id.button4);

        btn4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Provider.this, Electricity.class);
                startActivity(k);
            }
        });

        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Provider.this, Bancos.class);
                startActivity(a);
            }
        });

        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Provider.this, Mobiles.class);
                startActivity(a);
            }
        });

        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Provider.this, CableTv.class);
                startActivity(a);
            }
        });

    }
}
