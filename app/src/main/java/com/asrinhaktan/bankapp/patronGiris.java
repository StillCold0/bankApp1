package com.asrinhaktan.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class patronGiris extends AppCompatActivity {
    public Button geri2;
    public Button maasgor;
    public Button emailgor;
    public Button telgor;
    public Button pgor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patron_giris);


        geri2 = (Button)findViewById(R.id.geri2);
        maasgor=(Button)findViewById(R.id.maasgor);
        emailgor=(Button)findViewById(R.id.emailgor);
        telgor=(Button)findViewById(R.id.telgor);
        pgor=(Button)findViewById(R.id.pgor);

        pgor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pgor = new Intent(patronGiris.this,personGiris.class);
                startActivity(pgor);
            }
        });

        geri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geri2 = new Intent(patronGiris.this,MainActivity.class);
                startActivity(geri2);
            }
        });


    }
}