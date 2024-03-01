package com.example.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText val1,val2;
    TextView result;
    Button buttontambah,buttonkurang,buttonkali,buttonbagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        result = findViewById(R.id.tvHasil);
        buttontambah = findViewById(R.id.buttontambah);
        buttonkurang = findViewById(R.id.buttonkurang);
        buttonkali = findViewById(R.id.buttonkali);
        buttonbagi = findViewById(R.id.buttonbagi);

        buttontambah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                int value1 = Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                int hasil = value1 + value2;
                result.setText(String.valueOf(hasil));
            }
        });

        buttonkurang.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                int value1 = Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                int hasil = value1 - value2;
                result.setText(String.valueOf(hasil));
            }
        });

        buttonkali.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                int value1 = Integer.parseInt(val1.getText().toString());
                int value2 = Integer.parseInt(val2.getText().toString());
                int hasil = value1 * value2;
                result.setText(String.valueOf(hasil));
            }
        });

        buttonbagi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                double value1 = Integer.parseInt(val1.getText().toString());
                double value2 = Integer.parseInt(val2.getText().toString());
                if (value2 ==0)
                    Toast.makeText(MainActivity.this, "Tidak dapat dibagi dengan 0 ya", Toast.LENGTH_SHORT).show();
                double hasil = value1 / value2;
                result.setText(String.valueOf(hasil));
            }
        });


    }
}