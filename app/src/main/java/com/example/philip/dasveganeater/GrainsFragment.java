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

        foods.add(new Food("Whole Rye", "This cereal grain has more nutrients per 100-calorie serving than any other whole grain.", R.drawable.grains_whole_rye, "It has four times more fiber than whole wheat and 50 percent of the daily recommended amount of iron. It also promotes weight loss, helps prevent gallstones and prevents breast cancer."));
        foods.add(new Food("Quinoa", "OK, this is actually a seed, not a grain", R.drawable.grains_quinoa, "But it’s widely considered a grain, so we’ll include here. It is super nutritious, especially for vegans because it is a complete protein. It is also high in vitamin E and calcium and low in fat. Quinoa is gluten free."));
        foods.add(new Food("Oats", "Oats help enhance immune response to infection and stabilize blood sugar.", R.drawable.grains_oats, "Oats are gluten free."));
        foods.add(new Food("Barley", "Barley is a great source of fiber and selenium", R.drawable.grains_barley, "And a good source of phosphorous, copper and manganese. It also helps prevent gallstones."));
        foods.add(new Food("Millet", "This grain is a good source of manganese, phosphorus and magnesium.", R.drawable.grains_millet, "It helps with the development and repair of body tissue, helps prevent gallstones and protects against breast cancer."));
        foods.add(new Food("Brown Rice", "Brown rice is an excellent source of manganese and a good source of selenium and magnesium.", R.drawable.grains_brown_rice, "It’s also high in fiber, rich in antioxidants and helps stabilize blood sugar."));
        foods.add(new Food("Buckwheat", "Also not a grain; it’s technically a fruit seed", R.drawable.grains_buckwheat, "But it is used like one in cooking, and it’s a good substitute for grains because it is gluten free. Buckwheat helps control blood sugar and helps prevent gallstones."));
        foods.add(new Food("Spelt", "This grain does not seem to cause sensitivities in many people who are intolerant of wheat.", R.drawable.grains_spelt, "It is an excellent source of manganese and a good source of protein, copper and zinc."));
        foods.add(new Food("Whole Wheat", "This popular grain is rich in B vitamins and vitamin E.", R.drawable.grains_whole_wheat, "It’s also low in fat."));


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
