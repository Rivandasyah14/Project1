package com.example.rivandamahdiansyaakhwatklsx.rumusaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        Button btn = findViewById(R.id.btnaxt);
        final EditText input = findViewById(R.id.editalas);
        final EditText input2 = findViewById(R.id.edittinggi);
        final TextView txtHasil = findViewById(R.id.txtHasilaxt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float alas = Float.parseFloat(input.getText().toString());
                float tinggi = Float.parseFloat(input2.getText().toString());
                float hasil = alas * tinggi / 2;
                txtHasil.setText( + hasil + "");
            }
        });
    }
}
