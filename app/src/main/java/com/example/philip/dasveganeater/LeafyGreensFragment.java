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
public class LeafyGreensFragment extends Fragment {


    public LeafyGreensFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.food_list, container, false);

        final ArrayList<Food> foods = new ArrayList<>();

        foods.add(new Food("Kale", "Rising star kale certainly deserves its place in the spotlight.", R.drawable.leafy_greens_kale, "Rich in vitamins A, C, K, B6, as well as calcium and magnesium. It definitely earns its title as a 'superfood' — it’s packed with anti-cancer and cholesterol-lowering antioxidants. These antioxidants also promote heart and eye health."));
        foods.add(new Food("Collards", "Collard greens are a true leafy rockstar.", R.drawable.leafy_greens_collards, "For one thing, a serving of collard greens has more calcium than a glass of milk! They’re also packed with several potent anti-cancer properties, and are perhaps the best leafy green for lowering cholesterol. They’re  also rich in vitamins K, C, & A."));
        foods.add(new Food("Spinach", "Popeye isn’t the only one raving about the greatness of spinach. ", R.drawable.leafy_greens_spinach, "This leafy green is rich in iron, calcium, and a whole alphabet of vitamins. One property in spinach has been shown to help combat prostate cancer more than any other popular veggie!"));
        foods.add(new Food("Broccoli Rabe (Rapini)", "Don’t be confused by the name — broccoli rabe, or rapini,  isn’t related to that famous veggie of the name name.", R.drawable.leafy_greens_rapini, "It’s actually related to turnips! Rapini has plenty of vitamin C, as well as K, A, iron and calcium."));
        foods.add(new Food("Dandelion Greens", "Dandelions are often thought of as a pesky weed.", R.drawable.leafy_greens_dandelion_greens, "But the greens of dandelions aren’t pesky at all — in fact, they’re nutritional powerhouses! Some even consider dandelion greens to be one of the most nutritious vegetable around! In addition to so many of the  nutritional perks and antioxidants  that other leafy greens give you, dandelion greens are great for digestion and combating viruses."));
        foods.add(new Food("Cabbage", "Hundreds of studies have shown that cabbage is an excellent cancer-combating veggie.", R.drawable.leafy_greens_cabbage, "It’s also great for your digestive track and your heart. Bok choy, a Chinese cousin of cabbage, is also a nutritious — and delicious — leafy green."));
        foods.add(new Food("Turnip Greens", "The greens on top of the turnip roots are discarded all too often.", R.drawable.leafy_greens_turnip_greens, "And it’s a shame, really, because the greens are nutritional powerhouses! They are exceptionally bitter, a taste that has been linked in part  to its abundant calcium content. Like so many leafy greens on this list, turnip greens are high in vitamins A, K and C. They have plenty of antioxidants and contain plenty of fiber."));
        foods.add(new Food("Chard", "With colorful stems and bright green leaves, chard is definitely one of the prettiest greens out there.", R.drawable.leafy_greens_chard, "And, with plenty of vitamins A and C, as well as hefty doses of  iron and fiber, its nutritional value is nothing to sneeze at either."));


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
