package com.asrinhaktan.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class personGiris extends AppCompatActivity {
    public Button geri1;
    public Button maasgor;
    public Button emailgor;
    public Button telgor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_giris);

        geri1 = (Button)findViewById(R.id.geri1);
        maasgor=(Button)findViewById(R.id.maasgor);
        emailgor=(Button)findViewById(R.id.emailgor);
        telgor=(Button)findViewById(R.id.telgor);


        geri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geri1=new Intent(personGiris.this,MainActivity.class);
                startActivity(geri1);
            }
        });





    }
}