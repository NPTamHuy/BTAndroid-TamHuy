package com.example.viduintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent iNhanDuoc = getIntent();
        String htNhanDuoc = iNhanDuoc.getStringExtra("ht");
        TextView tvKetQua = findViewById(R.id.tvKetQua);
        tvKetQua.setText(htNhanDuoc);


        Button buttonBack = findViewById(R.id.btnBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
