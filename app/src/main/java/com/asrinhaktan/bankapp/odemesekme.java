package com.asrinhaktan.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class odemesekme extends AppCompatActivity {
    public Button odemeYap;
    public Button geridon4;
    public Button borcgor;
    public Button varlikgor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odemesekme);


        odemeYap=(Button)findViewById(R.id.odemeYap);
        geridon4=(Button)findViewById(R.id.geri4);
        borcgor=(Button)findViewById(R.id.borcgor);
        varlikgor=(Button)findViewById(R.id.varlikgor);


        odemeYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Ödeme Yapıldı bakiyeden düşüldü", Toast.LENGTH_LONG);
                toast.show();

            }
        });

        geridon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geridon4 = new Intent(odemesekme.this,kullGiris.class);
                startActivity(geridon4);
            }
        });





    }
}