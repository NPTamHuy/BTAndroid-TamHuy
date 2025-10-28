package com.example.gk2210;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.textfield.TextInputEditText;

public class DtbActivity extends AppCompatActivity {

    TextInputEditText inputDiemGK, inputDiemCK, tvKetQua;
    AppCompatButton btnTinhDiem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dtb);

        inputDiemGK = findViewById(R.id.input_diemGK);
        inputDiemCK = findViewById(R.id.input_diemCK);
        tvKetQua = findViewById(R.id.tv_ketQua);
        btnTinhDiem = findViewById(R.id.btn_tinhDiem);

        btnTinhDiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String diemGKStr = inputDiemGK.getText().toString();
                String diemCKStr = inputDiemCK.getText().toString();

                if (diemGKStr.isEmpty() || diemCKStr.isEmpty()) {
                    Toast.makeText(DtbActivity.this, "Vui lòng nhập đủ điểm!", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    double diemGK = Double.parseDouble(diemGKStr);
                    double diemCK = Double.parseDouble(diemCKStr);
                    double diemTB = (diemGK * 0.5) + (diemCK * 0.5);

                    tvKetQua.setText(String.format("%.2f", diemTB));

                } catch (NumberFormatException e) {
                    Toast.makeText(DtbActivity.this, "Điểm nhập không hợp lệ!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}