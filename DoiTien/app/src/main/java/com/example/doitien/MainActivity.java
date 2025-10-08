package com.example.doitien;

import android.os.Bundle;
import android.view.View; // Import lớp View
import android.widget.Button; // Import lớp Button
import android.widget.EditText; // Import lớp EditText
import android.widget.Toast; // Import Toast để hiển thị thông báo

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat; // Import để định dạng số

public class MainActivity extends AppCompatActivity {

    // 1. Khai báo các biến cho View
    EditText edtUSD, edtVND;
    Button btnConvert;

    // Giả sử tỷ giá là 25,450 VND cho 1 USD
    // Bạn nên cập nhật tỷ giá này hoặc lấy từ một API để có kết quả chính xác
    final double EXCHANGE_RATE = 25450;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // 2. Ánh xạ các View từ layout XML
        edtUSD = findViewById(R.id.USD);
        edtVND = findViewById(R.id.VND);
        btnConvert = findViewById(R.id.btn_1); // ID của nút là btn_1

        // 3. Thiết lập sự kiện click cho nút "CONVERT"
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Gọi hàm xử lý chuyển đổi
                convertCurrency();
            }
        });


        // Đoạn code mặc định để xử lý giao diện tràn viền
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void convertCurrency() {
        // Lấy chuỗi người dùng nhập vào ô USD
        String usdString = edtUSD.getText().toString();

        // Kiểm tra xem người dùng đã nhập gì chưa
        if (usdString.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập số tiền USD", Toast.LENGTH_SHORT).show();
            return; // Dừng hàm nếu chưa nhập
        }

        try {
            // Chuyển chuỗi thành số (double)
            double usdValue = Double.parseDouble(usdString);

            // Thực hiện phép tính chuyển đổi
            double vndValue = usdValue * EXCHANGE_RATE;


              edtVND.setText(formattedVnd);

        } catch (NumberFormatException e) {
            // Bắt lỗi nếu người dùng nhập không phải là số
            Toast.makeText(this, "Số tiền nhập không hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
}
