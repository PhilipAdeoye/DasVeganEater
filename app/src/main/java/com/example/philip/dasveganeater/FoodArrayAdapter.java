package com.example.philip.dasveganeater;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Philip-Mac on 3/4/18.
 */

public class FoodArrayAdapter extends ArrayAdapter<Food> {

    public FoodArrayAdapter(@NonNull Activity context, @NonNull ArrayList<Food> foods) {
        super(context, 0, foods);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        Food currentFood = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentFood.getName());

        TextView descriptionTextView = listItemView.findViewById(R.id.short_description_text_view);
        descriptionTextView.setText(currentFood.getShortDescription());

        ImageView imageView = listItemView.findViewById(R.id.image_view);
        if (currentFood.hasImageResourceId()) {
            imageView.setImageResource(currentFood.getImageResourceId());
        }

        return listItemView;

    }
}
