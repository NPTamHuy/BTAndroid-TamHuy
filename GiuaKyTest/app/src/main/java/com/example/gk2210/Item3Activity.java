package com.example.gk2210;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Item3Activity extends AppCompatActivity {

    TextView tvMonHocChiTiet;
    ImageView iconBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item3);

        // 1. Ánh xạ các View
        tvMonHocChiTiet = findViewById(R.id.tv_monhoc_chitiet);
        iconBack = findViewById(R.id.icon_back);

        // 2. Nhận dữ liệu (String) từ Intent
        Intent intent = getIntent();
        // "TEN_MON_HOC" là cái "chìa khóa" mà chúng ta sẽ dùng ở DsActivity
        String tenMon = intent.getStringExtra("TEN_MON_HOC");

        // 3. Hiển thị dữ liệu lên TextView
        if (tenMon != null && !tenMon.isEmpty()) {
            tvMonHocChiTiet.setText(tenMon);
        }

        // 4. Xử lý nút quay lại
        iconBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // finish() sẽ đóng Activity hiện tại và quay về màn hình trước đó
                finish();
            }
        });
    }
}
