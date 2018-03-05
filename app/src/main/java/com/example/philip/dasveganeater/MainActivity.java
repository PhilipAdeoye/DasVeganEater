package com.example.philip.dasveganeater;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);

        VeganEaterFragmentPagerAdapter adapter = new VeganEaterFragmentPagerAdapter(
                getSupportFragmentManager(),
                new ArrayList<>(Arrays.asList(
                        getResources().getString(R.string.grains_text),
                        getResources().getString(R.string.legumes_text),
                        getResources().getString(R.string.fruits_text),
                        getResources().getString(R.string.veggies_text),
                        getResources().getString(R.string.leafy_greens_text)
                )
        ));

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
