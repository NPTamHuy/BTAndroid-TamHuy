package com.example.fragmentex_replace;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class FooterFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_footer, container, false);

        Button b1 = v.findViewById(R.id.button_one);
        Button b2 = v.findViewById(R.id.button_two);
        Button b3 = v.findViewById(R.id.button_three);

        final FragmentManager fragmentManager = getParentFragmentManager();
        final int containerId = R.id.fragmentContainerView_Content;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .replace(containerId, new Fragment1())
                        .commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .replace(containerId, new Fragment2())
                        .commit();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .replace(containerId, new Fragment3())
                        .commit();
            }
        });

        return v;
    }
}