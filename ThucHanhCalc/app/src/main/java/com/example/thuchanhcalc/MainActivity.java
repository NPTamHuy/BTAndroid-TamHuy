package com.example.thuchanhcalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etxt1, etxt2;
    TextView txtresult;
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Ánh xạ View
        etxt1 = findViewById(R.id.etxt1);
        etxt2 = findViewById(R.id.etxt2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        txtresult = findViewById(R.id.txtresult);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Phương thức này được gọi từ thuộc tính android:onClick trong file XML
    public void XuLyPhepToan(View view) {
            // Lấy giá trị từ EditText và chuyển sang số
            int a = Integer.parseInt(etxt1.getText().toString());
            int b = Integer.parseInt(etxt2.getText().toString());
            int ketQua;

            // Kiểm tra xem nút nào đã được nhấn
            if (view.getId() == R.id.btn1) {
                ketQua = a + b;
                txtresult.setText(String.valueOf(ketQua));
            } else if (view.getId() == R.id.btn2) {
                ketQua = a - b;
                txtresult.setText(String.valueOf(ketQua));
            } else if (view.getId() == R.id.btn3) {
                ketQua = a * b;
                txtresult.setText(String.valueOf(ketQua));
            } else if (view.getId() == R.id.btn4) {
                double ketQuaChia = (double) a / b;
                txtresult.setText(String.valueOf(ketQuaChia));
            }
        }
}

