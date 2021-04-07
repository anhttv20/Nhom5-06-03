package com.example.nhom5_06_03.fargment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter  extends FragmentStatePagerAdapter {
    private int numPager=3;
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new FragmentHome();
            case 1:return new FragmentSearch();
            case 2:return new FragmentNotification();
            default:return new FragmentHome();
        }
    }

    @Override
    public int getCount() {
        return numPager;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:return "Home";
            case 1:return "Search";
            case 2:return "Notification";
            default:return "Home";
        }
    }
}
