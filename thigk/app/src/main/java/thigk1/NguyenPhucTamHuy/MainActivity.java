package thigk1.NguyenPhucTamHuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast; // Import Toast
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView; // Import CardView

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
                Intent intent = new Intent(MainActivity.this, DtActivity.class);
                startActivity(intent);
            }
        });

        cardDs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DsActivity.class);
                startActivity(intent);
            }
        });


    }
}
