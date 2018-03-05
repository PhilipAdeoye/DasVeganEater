package com.example.philip.dasveganeater;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Philip-Mac on 3/4/18.
 */

public class VeganEaterFragmentPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<String> foodTypes;

    public VeganEaterFragmentPagerAdapter(FragmentManager fm, @NonNull ArrayList<String> foodTypes) {
        super(fm);
        this.foodTypes = foodTypes;
    }

    @Override
    public int getCount() {
        return foodTypes.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return foodTypes.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new GrainsFragment();
        else if (position == 1)
            return new LegumesFragment();
        else if (position == 2)
            return new FruitsFragment();
        else if (position == 3)
            return new VeggiesFragment();
        else
            return new LeafyGreensFragment();
    }
}
