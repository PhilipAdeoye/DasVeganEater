package com.example.philip.dasveganeater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        // Get the intent
        Intent intent = getIntent();
        if (intent == null)
            return;

        // Get the extra data passed with the intent
        Bundle extras = intent.getExtras();
        if (extras == null)
            return;

        // Get the food
        Food food = (Food) extras.getSerializable(Constants.FOOD);
        if (food != null) {

            // Set the title in the action bar
            setTitle(food.getName());

            // Set the image
            ImageView foodDetailImageView = findViewById(R.id.food_detail_image_view);
            if (food.hasImageResourceId())
                foodDetailImageView.setImageResource(food.getImageResourceId());

            // Set the short description
            TextView foodDetailShortDescriptionTextView = findViewById(R.id.food_detail_short_description);
            if (food.getShortDescription() != null) {
                foodDetailShortDescriptionTextView.setText(food.getShortDescription());
                foodDetailShortDescriptionTextView.setVisibility(View.VISIBLE);
            } else {
                foodDetailShortDescriptionTextView.setVisibility(View.GONE);
            }

            // Set the long description if available, or hide if unavailable
            TextView foodDetailLongDescriptionTextView = findViewById(R.id.food_detail_long_description);
            if (food.getLongDescription() != null) {
                foodDetailLongDescriptionTextView.setText(food.getLongDescription());
                foodDetailLongDescriptionTextView.setVisibility(View.VISIBLE);
            } else {
                foodDetailLongDescriptionTextView.setVisibility(View.GONE);
            }
        }

    }
}
