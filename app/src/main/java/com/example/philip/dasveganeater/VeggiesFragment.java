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
public class VeggiesFragment extends Fragment {


    public VeggiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.food_list, container, false);

        final ArrayList<Food> foods = new ArrayList<>();

        foods.add(new Food("Artichokes", "One medium-size globe artichoke packs a real punch of dietary fiber, weighing in at 10 grams.", R.drawable.veggies_artichokes, "Eating the edible parts of the leaves and heart will also serve up a good amount of the required daily value (DV) of vitamin C, vitamin K and folate. A recent study found that artichokes ranked extremely high in total antioxidants per serving, out of more than 1,000 foods tested. Artichokes even outranked broccoli and spinach. Just watch out for those high-calorie sauces that make such delicious dips for the fibrous leaves."));
        foods.add(new Food("Asparagus", "Asparagus is high in vitamins C and K.", R.drawable.veggies_asparagus, "Although an asparagus bed rewards you for years, you’ll need patience to wait on the first harvest, which doesn’t come until the second spring. The first spring that you plant, leave the plants alone to grow into tall ferns (4-5 feet high). This builds strong roots that send out the asparagus shoots the next spring. Even though the asparagus harvest comes in spring, remember to mulch, water, and weed the bed throughout the growing season to ensure an even better crop next year. Asparagus is high in vitamins C and K."));
        foods.add(new Food("Cauliflower", "Munching on raw cauliflower has always been a popular with dieters and for good reason: cauliflower is very low in calories, high in fiber, low in carbohydrates, and packed with a very long list of nutrients.", R.drawable.veggies_cauliflower, "Cooking does not seem to change the nutrient levels significantly. When cruciferous vegetables, such as cauliflower and broccoli are cut, an important group of phytonutrients called isothiocyanates begin to form on the surface. Researchers studying the benefits of these nutrients suggest letting the cut vegetables sit for five to ten minutes before cooking; then cook as briefly as possible to retain nutrients and prevent formation of smelly sulphur compounds."));
        foods.add(new Food("Celery", "This crunchy staple tastes best when harvested fresh from the garden. Early maturing stalks are crisp and flavorful.", R.drawable.veggies_celery, "Plants grow well in most regions of the country, but no matter where you grow them, be sure to water regularly for best results. When harvesting, cut the outside stalks first. If stalks begin to sprawl as they grow, tie them together loosely with garden twine. Both stalks and leaves are edible; eat them raw, or use them in stir-fries, soups, and casseroles."));
        foods.add(new Food("Corn", "Sweet corn, whether white or yellow, is higher in calories and sugars than many other vegetables.", R.drawable.veggies_corn, "But also provides a good source of fiber, thiamin, folate, and a host of phytonutrients., such as lutein, important for healthy vision. Research has recently discovered that cooking sweet corn significantly boosts this whole grain's antioxidant activity, despite some loss of Vitamin C. One powerful group of antioxidants called phenolics, important in fighting disease, have been found to be much higher in corn than in other fruits and vegetables."));
        foods.add(new Food("Cucumbers", "Cucumbers have a very high water content, very few calories, lots of fiber, and a whole range of vitamins and minerals.", R.drawable.veggies_cucumber, "Their hydrating quality is important for healthy skin, and two compounds in them, ascorbic acid and caffeic acid, prevent water retention and explain why sliced cucumbers are often used topically for swollen eyes, burns, and other skin problems. Munching on a cucumber ever day is an easy, cooling way to add both fiber and water to the diet. Studies have also shown that adding foods high in potassium, magnesium and fiber, such as cucumbers, helps keep blood pressure at healthy levels."));
        foods.add(new Food("Onions", "The health benefits of onions are so numerous that it is impossible to list them all.", R.drawable.veggies_onioins, "Much of this benefit comes from powerful sulfur compounds, the same ones that account for the onion's eye-watering odor. These compounds, along with chromium, a trace mineral in good supply in onions, and vitamin B6 have been found for help regulate blood sugar, lower total cholesterol and triglyceride levels, and lower blood pressure. Onions have also been found to boost intestinal and bone health and ward off several types of cancer. Researchers say that the more pungent the onion, the greater the load of beneficial phytonutrients."));
        foods.add(new Food("Bell Peppers", "The perfect pepper for stuffing, freezing, and fresh eating! Plants produce plenty of medium-sized green bell peppers with classic blocky bell shape.", R.drawable.veggies_bell_peppers, "Brightly colored bell peppers, whether they are green, red, orange, or yellow, offer large amounts of some of the most important nutrients. They are excellent sources of vitamin C and vitamin A (through its concentration of carotenoids such as beta-carotene), two very powerful antioxidants. Vitamin B6 and folate, important for heart health, and an assortment of important minerals are also high in bell peppers. The high percentage of vitamin A found in green bell peppers is important for lung health."));
        foods.add(new Food("Tomatoes", "Plants are very prolific, yielding lots of bright red fruit that are the perfect balance between meaty and juicy, and very richly flavored.", R.drawable.veggies_tomatoes, "The red tomato is listed on most nutritional lists as a superfood. It is packed with the antioxidant vitamins A and C, potassium and the B vitamins for heart health, and above all a powerful carotenoid called lycopene. This phytonutrient, which is responsible for the bright red color of tomatoes, has been studied for its role in fighting various cancers, and its ability to lower cholesterol. When tomatoes are cooked, even more lycopene is made available. Lycopene has been shown to be especially effective when eaten with fat-rich foods such as avocado, olive oil, or nuts. There are the ingredients for a powerhouse salad!"));
        foods.add(new Food("Sweet Potatoes", "Sweet potatoes are rich in complex carbohydrates.", R.drawable.veggies_sweet_potatoes, "Which is one of the reasons they have been ranked number one in nutrition of all vegetables by nutritionists at the Center for Science in the Public Interest (CSPI). Other points were given for high content of fiber, protein, vitamins A and C, iron, and calcium. This vegetable is a powerful antioxidant, anti-inflammatory food that offers an over-the-top amount of vitamin A as well as huge percentages of the daily value for numerous other vitamins and minerals. Among the many health benefits of a large dose of vitamin A is protection from lung disease."));

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
