package com.example.nhom5_06_03.fargment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.nhom5_06_03.MainActivity;
import com.example.nhom5_06_03.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends Fragment {
    private EditText name;
    private Button bt;
    private View v;
    public FragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_home, container, false);
        name=v.findViewById(R.id.name);
        bt=v.findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st=name.getText().toString();
                ((MainActivity)getActivity()).name=st;
            }
        });
        return v;
    }
}
