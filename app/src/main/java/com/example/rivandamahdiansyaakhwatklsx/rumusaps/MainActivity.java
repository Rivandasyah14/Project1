package com.example.rivandamahdiansyaakhwatklsx.rumusaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnPersegipanjang);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), Persegi.class);
                startActivity(a);
            }
        });

        Button btn2 = findViewById(R.id.btnPersegi);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplicationContext(), PersegiPanjang.class);
                startActivity(b);
            }
        });

        Button btn3 = findViewById(R.id.btnSegitiga);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getApplicationContext(), Segitiga.class);
                startActivity(c);
            }
        });
    }
}
