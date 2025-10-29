package thigk1.NguyenPhucTamHuy;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.textfield.TextInputEditText;

public class DtActivity extends AppCompatActivity {

    TextInputEditText inputChieuDai, inputChieuRong, tvKetQua;
    AppCompatButton btnTinhToan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dt);

        inputChieuDai = findViewById(R.id.input_chieuDai);
        inputChieuRong = findViewById(R.id.input_chieuRong);
        tvKetQua = findViewById(R.id.tv_ketQua);
        btnTinhToan = findViewById(R.id.btn_tinhToan);

        btnTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chieuDaiStr = inputChieuDai.getText().toString();
                String chieuRongStr = inputChieuRong.getText().toString();

                if (chieuDaiStr.isEmpty() || chieuRongStr.isEmpty()) {
                    Toast.makeText(DtActivity.this, "Nhập đầy đủ", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    double chieuDai = Double.parseDouble(chieuDaiStr);
                    double chieuRong = Double.parseDouble(chieuRongStr);

                    double dienTich = chieuDai * chieuRong;

                    tvKetQua.setText(String.format("%.2f", dienTich));

                } catch (NumberFormatException e) {
                    Toast.makeText(DtActivity.this, "Không hợp lệ!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
