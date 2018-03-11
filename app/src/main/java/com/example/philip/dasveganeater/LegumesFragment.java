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
public class LegumesFragment extends Fragment {


    public LegumesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.food_list, container, false);

        final ArrayList<Food> foods = new ArrayList<>();

        foods.add(new Food("Beans", "The most common varieties of legumes are beans. These include adzuki beans, black beans, soybeans, anasazi beans, fava beans, garbanzo beans (chickpeas), kidney beans and lima beans.", R.drawable.legumes_beans, "These foods are high in protein and carbohydrates but low in fat. For example, 1 cup of cooked adzuki beans contains 17 grams of protein, 57 grams of carbohydrates, 294 calories and only 0.2 grams of fat. In comparison, 1 cup of cooked chickpeas contains 15 grams of protein, 45 grams of carbohydrates, 269 calories and 4 grams of fat. Because of their assortment of flavors and textures, a mixture of lightly-seasoned, cooked-then-cooled beans makes a flavorful, nutritious and filling salad."));
        foods.add(new Food("Nuts", "Some legumes are inappropriately called 'nuts.' The most common example is the peanut, with other examples including soy nuts and carob nuts.", R.drawable.legumes_nuts, "Similar to other nuts, these legumes contain high concentrations of protein, fat and carbohydrates. For example, 1/4 cup of dry-roasted soy nuts contains 11 grams of protein, 10 grams of fat, 11 grams of carbohydrates and 150 calories, and 1/4 cup of dry-roasted peanuts has 7 grams of protein, 5 grams of carbohydrates, 160 calories and 13 grams of fat. When eating soy or peanuts, choose dry-roasted and unsalted varieties to avoid the high fat and sodium content of oil-roasted, salted nuts."));
        foods.add(new Food("Peas", "A number of legumes are labeled as peas, including green peas, snow peas, snap peas, split peas and black-eyed peas.", R.drawable.legumes_peas, "Similar to beans, peas contain high concentrations of carbohydrates and protein but little fat. For example, 1 cup of boiled green peas contains 8.6 grams of protein, 25 grams of carbohydrates, 134 calories and 0.4 gram of fat. Split peas contain higher concentrations of protein and carbohydrates but a similar amount of fat. One cup of boiled split peas contains 16 grams of protein, 41 grams of carbohydrates, 231 calories and only 1 gram of fat. As most varieties have a naturally sweet flavor, peas are great as a side-dish, snack, addition to a stir-fry or topping on a salad."));
        foods.add(new Food("Lentils", "Legumes that are classified as nuts, beans and peas are approximately spherical in shape. With their flat, round shape, lentils differ from this general pattern.", R.drawable.legumes_lentils, "Whether yellow, orange, green, brown or black, the nutritional profile of lentils does not change with their color. However, sprouted lentils differ from non-sprouted lentils in their nutritional content. One cup of uncooked sprouted lentils contains 7 grams of protein, 17 grams of carbohydrates, 82 calories and 0.5 gram of fat. As they are much denser, non-sprouted lentils provide larger amounts of these nutrients. One cup of cooked lentils contains 18 grams of protein, 40 grams of carbohydrates, 1 gram of fat and 140 calories. Although the non-sprouted variety is more common in cooked dishes, both varieties can serve as the basis for Indian dal curries."));


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
