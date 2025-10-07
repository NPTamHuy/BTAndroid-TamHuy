package com.example.quizapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ArrayList<CauHoiHaiSo> dsCauHoi;

    Button da1, da2, da3, da4;
    TextView txtSo1, txtDau, txtSo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mapping view
        da1 = findViewById(R.id.da1);
        da2 = findViewById(R.id.da2);
        da3 = findViewById(R.id.da3);
        da4 = findViewById(R.id.da4);

        txtSo1 = findViewById(R.id.textView8);
        txtDau = findViewById(R.id.textView9);
        txtSo2 = findViewById(R.id.textView10);

        // Tạo ngân hàng câu hỏi
        dsCauHoi = new ArrayList<>();
        dsCauHoi.add(new CauHoiHaiSo(1,"1+1",2,3,4,5));
        dsCauHoi.add(new CauHoiHaiSo(2,"10+1",11,13,42,15));
        dsCauHoi.add(new CauHoiHaiSo(3,"10+90",100,103,102,95));

        // Hiện câu hỏi đầu tiên
        hienCauHoi(dsCauHoi.get(0));
    }

    private void hienCauHoi(CauHoiHaiSo ch) {
        // Tách loiHoi "a+b"
        String[] parts = ch.getLoiHoi().split("\\+");
        if (parts.length == 2) {
            txtSo1.setText(parts[0].trim());
            txtDau.setText("+");
            txtSo2.setText(parts[1].trim());
        } else {
            txtSo1.setText(ch.getLoiHoi());
            txtDau.setText("");
            txtSo2.setText("");
        }

        // Danh sách đáp án
        ArrayList<Integer> dapAn = new ArrayList<>();
        dapAn.add(ch.getDaDung());
        dapAn.add(ch.getSai1());
        dapAn.add(ch.getSai2());
        dapAn.add(ch.getSai3());

        // Xáo trộn
        Collections.shuffle(dapAn);

        // Gán vào button
        da1.setText(String.valueOf(dapAn.get(0)));
        da2.setText(String.valueOf(dapAn.get(1)));
        da3.setText(String.valueOf(dapAn.get(2)));
        da4.setText(String.valueOf(dapAn.get(3)));
    }
}