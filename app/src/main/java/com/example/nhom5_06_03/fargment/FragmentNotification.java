package com.example.nhom5_06_03.fargment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.nhom5_06_03.MainActivity;
import com.example.nhom5_06_03.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentNotification extends Fragment {
    private Button bt;
    private TextView tv;
    private View v;
    public FragmentNotification() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_notification, container, false);
        bt=v.findViewById(R.id.btShow);
        tv=v.findViewById(R.id.tv);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(((MainActivity)getActivity()).name);
            }
        });
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //
    }
}
