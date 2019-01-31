package com.example.rivandamahdiansyaakhwatklsx.rumusaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Persegi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        Button btn = findViewById(R.id.btnpxl);
        final EditText input = findViewById(R.id.edit);
        final EditText input2 = findViewById(R.id.Edittext);
        final TextView txtHasil = findViewById(R.id.txtHasilpxl);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float panjang = Float.parseFloat(input.getText().toString());
                float lebar = Float.parseFloat(input2.getText().toString());
                float hasil = panjang * lebar;
                txtHasil.setText( + hasil + "");
            }
        });
    }
}
