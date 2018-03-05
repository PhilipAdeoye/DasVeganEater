package com.example.philip.dasveganeater;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class VeggiesFragment extends Fragment {


    public VeggiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.food_list, container, false);

        final ArrayList<Food> foods = new ArrayList<>();

        foods.add(new Food("Carrots"));
        foods.add(new Food("Onions", "Halitosis on form"));

        FoodArrayAdapter foodArrayAdapter = new FoodArrayAdapter(getActivity(), foods);

        ListView listView = rootView.findViewById(R.id.food_list);
        listView.setAdapter(foodArrayAdapter);

        return rootView;
    }

}
