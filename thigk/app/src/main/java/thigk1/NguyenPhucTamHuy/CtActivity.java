package thigk1.NguyenPhucTamHuy;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class CtActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<CongTrinh> congTrinhList;
    CongTrinhAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congtrinh);

        recyclerView = findViewById(R.id.recyclerview_congtrinh);
        congTrinhList = new ArrayList<>();

        congTrinhList.add(new CongTrinh("Chung Cư", "Thời gian: 12 tháng", R.drawable.wp));
        congTrinhList.add(new CongTrinh("Nhà Ở", "Thời gian: 8 tháng", R.drawable.wp));
        congTrinhList.add(new CongTrinh("Khách Sanj", "Thời gian: 6 tháng", R.drawable.wp));
        congTrinhList.add(new CongTrinh("Công ty", "Thời gian: 2 tháng", R.drawable.wp));

        adapter = new CongTrinhAdapter(this, congTrinhList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
