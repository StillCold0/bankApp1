package com.asrinhaktan.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button girisYap;
    public Button pgirisYap;
    public Button mgirisYap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        girisYap = (Button)findViewById(R.id.giris);
        pgirisYap = (Button)findViewById(R.id.pgiris);
        mgirisYap = (Button)findViewById(R.id.mgiris);

        girisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent girisYap = new Intent(MainActivity.this, kullGiris.class);
                startActivity(girisYap);
            }
        });


        pgirisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pgirisYap = new Intent(MainActivity.this,personGiris.class);
                startActivity(pgirisYap);
            }
        });


        mgirisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mgirisYap = new Intent(MainActivity.this,patronGiris.class);
                startActivity(mgirisYap);
            }
        });







    }
}