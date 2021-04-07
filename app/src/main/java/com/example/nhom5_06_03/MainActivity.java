package com.example.nhom5_06_03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.nhom5_06_03.fargment.HorizontalFlipTransformation;
import com.example.nhom5_06_03.fargment.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tab;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    public String name="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab=findViewById(R.id.tab);
        viewPager=findViewById(R.id.viewPager);
        adapter=new ViewPagerAdapter(getSupportFragmentManager(),
                ViewPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        viewPager.setPageTransformer(true,
                new HorizontalFlipTransformation());
        tab.setupWithViewPager(viewPager);
        tab.getTabAt(0).setIcon(R.drawable.ic_home);
        tab.getTabAt(1).setIcon(R.drawable.ic_search);
        tab.getTabAt(2).setIcon(R.drawable.ic_notifications);
    }
}
