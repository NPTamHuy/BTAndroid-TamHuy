package thigk1.NguyenPhucTamHuy;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class DsActivity extends AppCompatActivity {

    ListView lvDanhSach;

    String[] danhSachVatLieu = {
            "Thép",
            "Nhôm",
            "Xi măng",
            "Gạch",
            "Kính",
            "Đá hoa cương ",
            "Nhựa ",
            "Đồng",
            "Thạch cao"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ds);

        lvDanhSach = findViewById(R.id.listview_vatlieu);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.listview_vatlieu,
                danhSachVatLieu
        );

        lvDanhSach.setAdapter(adapter);
        lvDanhSach.setDivider(null);
        lvDanhSach.setDividerHeight(0);
        lvDanhSach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String vatLieu = danhSachVatLieu[position];
                Toast.makeText(DsActivity.this, "Bạn đã chọn: " + vatLieu, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
