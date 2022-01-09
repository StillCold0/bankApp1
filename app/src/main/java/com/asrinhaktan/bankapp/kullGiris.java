package com.asrinhaktan.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kullGiris extends AppCompatActivity {
    public Button varlikgor;
    public Button adsoyadgor;
    public Button borcgor;
    public Button odemeYap;
    public Button geri3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_sonrasi);

        varlikgor=(Button)findViewById(R.id.varlikgor);
        adsoyadgor=(Button)findViewById(R.id.adsoyadgor);
        borcgor=(Button)findViewById(R.id.borcgor);
        odemeYap=(Button)findViewById(R.id.odemeYap);
        geri3=(Button)findViewById(R.id.geri3);


        geri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geri3 = new Intent(kullGiris.this,MainActivity.class);
                startActivity(geri3);
            }
        });

        odemeYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent odemeYap = new Intent(kullGiris.this,odemesekme.class);
                startActivity(odemeYap);
            }
        });







    }
}