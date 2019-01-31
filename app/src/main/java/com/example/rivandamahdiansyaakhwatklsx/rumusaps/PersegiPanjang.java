package com.example.rivandamahdiansyaakhwatklsx.rumusaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        Button btn = findViewById(R.id.btnSisi);
        final EditText input = findViewById(R.id.editText);
        final TextView txtHasil = findViewById(R.id.txtHasil);

        btn. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float sisi = Float.parseFloat(input.getText().toString());
                float hasil = sisi * sisi;
                txtHasil.setText( + hasil + "");
            }
        });
    }
}
