package com.example.philip.dasveganeater;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GrainsFragment extends Fragment {


    public GrainsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.food_list, container, false);

        final ArrayList<Food> foods = new ArrayList<>();

        foods.add(new Food("Rice", "Staple all over the world", R.drawable.placeholder, "Grown in many places, rice has become a staple ..."));
        foods.add(new Food("Oats", "Quaker made these world famous", R.drawable.placeholder, "Grown primarily in temperate conditions, Oats ..."));


        FoodArrayAdapter foodArrayAdapter = new FoodArrayAdapter(getActivity(), foods);

        ListView listView = rootView.findViewById(R.id.food_list);
        listView.setAdapter(foodArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Food food = foods.get(position);

                Intent intent = new Intent(getActivity(), FoodDetailActivity.class);
                intent.putExtra(Constants.FOOD, food);

                startActivity(intent);
            }
        });

        return rootView;
    }

}
