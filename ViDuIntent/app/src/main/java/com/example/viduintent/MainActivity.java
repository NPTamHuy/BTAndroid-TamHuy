package com.example.viduintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TỐI ƯU: Ánh xạ các View một lần duy nhất khi Activity được tạo.
        EditText edHoTen = findViewById(R.id.edHoTen);
        // SỬA LỖI: ID của Button phải là "btnChuyenTrang" để khớp với layout XML.
        Button nutChuyen2 = findViewById(R.id.btnChuyenTrang);

        nutChuyen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code chuyen man hinh
                //1. Tao intent để chỉ định màn hình muốn chuyển đến
                Intent iChuyen2 = new Intent(MainActivity.this, SecondActivity.class);

                //2. Lấy dữ liệu từ EditText đã được ánh xạ sẵn.
                String data = edHoTen.getText().toString();

                //2.2 Goi vao iChuyen2, dung putExtra(key, value)
                iChuyen2.putExtra("ht", data);
                iChuyen2.putExtra("copyright", "MCT");

                //3 Kich hoat man hinh 2 và gửi kèm Intent
                startActivity(iChuyen2);
            }
        });
    }
}
