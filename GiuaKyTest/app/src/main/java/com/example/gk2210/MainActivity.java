package com.example.gk2210;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView cardDtb, cardDs, cardHd, cardAb, cardBonus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardDtb = findViewById(R.id.card_dtb);
        cardDs = findViewById(R.id.card_ds);
        cardHd = findViewById(R.id.card_hd);
        cardAb = findViewById(R.id.card_ab);
        cardBonus = findViewById(R.id.card_bonus);

        cardDtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, DtbActivity.class);
                startActivity(myIntent);
            }
        });

        cardAb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, AboutMeActivity.class);
                startActivity(myIntent);
            }
        });

    }
}

