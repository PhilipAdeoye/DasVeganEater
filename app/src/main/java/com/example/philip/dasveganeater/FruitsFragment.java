package com.example.philip.dasveganeater;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FruitsFragment extends Fragment {


    public FruitsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.food_list, container, false);

        final ArrayList<Food> foods = new ArrayList<>();

        foods.add(new Food("Peaches and Nectarines", "Packed with potassium", R.drawable.fruits_peaches_and_nectarines, "Everyone knows that bananas boast high amounts of potassium, but two small peaches or nectarines have more of the essential mineral than one medium banana, boosting nerve and muscle health. The skins, in particular, are rich in antioxidants and insoluble fiber. And for those watching their weight, peaches are a healthy way to add sweetness to any diet. Bake, broil, or poach them to create pies, cobblers, and other desserts."));
        foods.add(new Food("Pineapples", "Powerful anti-inflammatory", R.drawable.fruits_pineapples, "Grilled, frozen, dried, or fresh, this sweet and tangy tropical fruit is jam-packed with bromelain, an anti-inflammatory enzyme that has been shown to reduce the risk of heart attacks and strokes, as well as increase fertility. Try these other inflammation-fighting foods."));
        foods.add(new Food("Grapes", "Heart healthy", R.drawable.fruits_grapes, "As one of the world’s oldest and most abundant fruit crops, grapes have been proven to ward off heart disease and high cholesterol thanks to high levels of the antioxidants quercetin and resveratrol. Each little bulb is also a great source of potassium and iron, which prevent muscle cramps and anemia. Stick with the purple or red kind, as they contain the highest concentration of healthy compounds."));
        foods.add(new Food("Kiwis", "Loaded with vitamins", R.drawable.fruits_kiwi, "Beneath its fuzzy skin is a sweet fruit loaded with vitamins C and E, both strong antioxidants that protect against cancer and promote eye health. Kiwis are also low in calories and high in fiber, making them ideal for weight loss. Because they can last up to four weeks when stored in the refrigerator, they are a great snack to keep all year round. Learn more about the health benefits of kiwis."));
        foods.add(new Food("Mangoes", "Immunity boosters", R.drawable.fruits_mangoes, "Mangoes are becoming increasingly popular among nutritionists due to their exceptionally high levels of beta-carotene, which the body converts into vitamin A to promote bone growth and a healthy immune system. Even more, these exotic treats are packed with more than 50 percent of your daily vitamin C—that’s more than oranges provide."));
        foods.add(new Food("Apples", "Brain- and heart-healthy", R.drawable.fruits_apples, "One medium apple is low on calories (only 80!) but heavy on quertecin, a powerful antioxidant that protects brain cell degeneration, which can lead to Alzheimer’s disease. Adults who eat apples are less likely to develop high blood pressure, according to one study. Apples can also lower cholesterol and prevent colon cancer, as well as promote healthy teeth and weight loss. Don't forget to eat the skin, too—it’s especially rich in disease-fighting compounds like flavonoids, which reduce the risk of heart disease. Here are the best ways to eat apples."));
        foods.add(new Food("Pomegranates", "More antioxidants than red wine or green tea", R.drawable.fruits_pomegranates, "Pomegranate juice has two to three times the antioxidant capacity of red wine or green tea, and is also a great source of potassium, which sustains energy and controls high blood pressure. Research shows that drinking ¼ cup of pomegranate juice daily could improve cardiovascular health, lower cholesterol, and help with erectile dysfunction. However, talk to your doctor before you drink regular amounts of pomegranate juice, as it can sometimes negatively interact with prescription drugs. Top salads with pomegranate seeds for a vitamin-packed meal, or try any of these other healthy salad recipes."));
        foods.add(new Food("Grapefruit", "Vitamin C powerhouse", R.drawable.fruits_grapefruit, "Although oranges are a great source of vitamin C, grapefruits pack a bigger punch. Just half of a grapefruit contains nearly 50 percent of your daily vitamin C, as well as high levels of fiber, potassium, and vitamin A. Studies have suggested that grapefruit can alleviate the symptoms of arthritis and repair damaged or oily skin and hair. It’s little wonder that this delicious fruit is no longer just a breakfast staple. Here are more surprising health benefits of grapefruit (and two dangers to watch for)."));
        foods.add(new Food("Bananas", "Healthy on-the-go snack", R.drawable.fruits_bananas, "A banana is the perfect on-the-go snack, already wrapped and full of potassium and fiber to promote long-lasting energy and keep you alert all day long. And since it contains no fat or salt, bananas are a much healthier snack option than a granola bar or bag of pretzels. Want to make your bananas last longer? Here’s a trick: Store them in the refrigerator after they’re ripe. Although the peel may turn brown, the fruit underneath will stay delicious for three to five extra days. Don’t know what to do with your overripe bananas? Here are uncommon uses for bananas."));
        foods.add(new Food("Blueberries", "Anti-aging powerhouses", R.drawable.fruits_blueberries, "Long considered one of the beloved “superfoods,” these sweet treats are tiny but mighty, loaded with antioxidants and vitamin C to help fight disease, as well as anthocyanin, a pigment shown to boost brainpower. One study found that people who ate the greatest amount of this fruit were less likely to develop age-related macular degeneration, the leading cause of blindness in older adults."));

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
