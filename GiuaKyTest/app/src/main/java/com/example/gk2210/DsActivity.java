package com.example.gk2210;

import android.content.Intent; // <-- THÊM IMPORT NÀY
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
// Bỏ import Toast nếu bạn không dùng nữa
// import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DsActivity extends AppCompatActivity {

    ListView lvMonHoc;

    String[] danhSachMonHoc = {
            "Tin học đại cương",
            "Lập trình Java",
            "Phát triển ứng dụng web",
            "Khai phá dữ liệu lớn",
            "Kinh tế chính trị Mác-Lê nin",
            "Lập trình di động",
            "Cấu trúc dữ liệu và giải thuật",
            "Cơ sở dữ liệu"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds);

        lvMonHoc = findViewById(R.id.listview_monhoc);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.list_item_monhoc,
                R.id.tv_monhoc,
                danhSachMonHoc
        );

        lvMonHoc.setAdapter(adapter);
        lvMonHoc.setDivider(null);
        lvMonHoc.setDividerHeight(0);

        // Bắt sự kiện click để CHUYỂN MÀN HÌNH (hoàn thành 0.5đ)
        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Lấy tên môn học được click
                String tenMon = danhSachMonHoc[position];

                // XÓA DÒNG TOAST CŨ:
                // Toast.makeText(DsActivity.this, "Bạn đã chọn: " + tenMon, Toast.LENGTH_SHORT).show();

                // THÊM CODE MỚI ĐỂ CHUYỂN MÀN HÌNH:
                // 1. Tạo Intent để mở Item3Activity
                Intent intent = new Intent(DsActivity.this, Item3Activity.class);

                // 2. Gói "tenMon" vào Intent, dùng "TEN_MON_HOC" làm chìa khóa
                intent.putExtra("TEN_MON_HOC", tenMon);

                // 3. Bắt đầu Activity mới
                startActivity(intent);
            }
        });
    }
}

