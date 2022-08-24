package com.project.chefklub.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.project.chefklub.R;
import com.project.chefklub.adapters.QuickTipsItemAdapter;
import com.project.chefklub.models.QuickTipsItemModel;

import java.util.ArrayList;
import java.util.List;

public class QuickTipsDetailsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<QuickTipsItemModel> quickTipsItemModelsList;
    QuickTipsItemAdapter quickTipsItemAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_tips_details);

        String tip = getIntent().getStringExtra("tip");

        recyclerView = findViewById(R.id.quick_tips_list);
        imageView = findViewById(R.id.image_Qt_items);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        quickTipsItemModelsList = new ArrayList<>();
        quickTipsItemAdapter = new QuickTipsItemAdapter(quickTipsItemModelsList);
        recyclerView.setAdapter(quickTipsItemAdapter);

        if (tip != null && tip.equalsIgnoreCase("breakfast")){

            imageView.setImageResource(R.drawable.breakfastimages);
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.breakfastimages,"breakfast"));
            quickTipsItemAdapter.notifyDataSetChanged();
        }
        if (tip != null && tip.equalsIgnoreCase("brunch")){
            imageView.setImageResource(R.drawable.brunchimages);
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.breakfastimages,"breakfast"));
            quickTipsItemAdapter.notifyDataSetChanged();
        }
        if (tip != null && tip.equalsIgnoreCase("lunch")){
            imageView.setImageResource(R.drawable.lunchimage);
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.breakfastimages,"breakfast"));
            quickTipsItemAdapter.notifyDataSetChanged();
        }
        if (tip != null && tip.equalsIgnoreCase("dinner")){
            imageView.setImageResource(R.drawable.dinnerimage);
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.breakfastimages,"breakfast"));
            quickTipsItemAdapter.notifyDataSetChanged();
        }
        if (tip != null && tip.equalsIgnoreCase("smoothie")){
            imageView.setImageResource(R.drawable.smoothieimage);
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.breakfastimages,"breakfast"));
            quickTipsItemAdapter.notifyDataSetChanged();
        }
        if (tip != null && tip.equalsIgnoreCase("simple")){
            imageView.setImageResource(R.drawable.simplemeals);
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.breakfastimages,"breakfast"));
            quickTipsItemAdapter.notifyDataSetChanged();
        }
        if (tip != null && tip.equalsIgnoreCase("cheap")){
            imageView.setImageResource(R.drawable.breakfastimages);
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.breakfastimages,"breakfast"));
            quickTipsItemAdapter.notifyDataSetChanged();
        }

    }
}