package thigk1.NguyenPhucTamHuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class VldetailActivity extends AppCompatActivity {

    ImageView iconBack;
    TextView tvTenVatLieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vldetail);

        iconBack = findViewById(R.id.icon_back);
        tvTenVatLieu = findViewById(R.id.tv_vatlieu_chitiet);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("TEN_VAT_LIEU")) {
            String tenVatLieu = intent.getStringExtra("TEN_VAT_LIEU");

            tvTenVatLieu.setText(tenVatLieu);
        }

        iconBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
