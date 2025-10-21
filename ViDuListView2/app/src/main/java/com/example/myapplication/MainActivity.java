package com.example.my_application;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvCity;
    ArrayAdapter<String> cityAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lvCity = findViewById(R.id.listViewCity);

        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Hà Nội");
        cityList.add("TP. Hồ Chí Minh");
        cityList.add("Nha Trang");
        cityList.add("Đà Nẵng");
        cityList.add("Hải Phòng");
        cityList.add("Cần Thơ");
        cityList.add("Huế");
        cityList.add("Vũng Tàu");
        cityList.add("Đà Lạt");
        cityList.add("Quy Nhơn");

        cityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cityList);
        lvCity.setAdapter(cityAdapter);

        lvCity.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedCity = cityAdapter.getItem(position);
                Toast.makeText(MainActivity.this, "Bạn đã chọn: " + selectedCity, Toast.LENGTH_SHORT).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
