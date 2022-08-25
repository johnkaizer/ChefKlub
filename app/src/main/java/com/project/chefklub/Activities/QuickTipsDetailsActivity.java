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
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.breakfast1,"breakfast tip 1"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.breakfast2,"breakfast tip 2"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.breakfast3,"breakfast tip 3"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.breakfast4,"breakfast tip 4"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.breakfast5,"breakfast tip 5"));
            quickTipsItemAdapter.notifyDataSetChanged();
        }
        if (tip != null && tip.equalsIgnoreCase("brunch")){
            imageView.setImageResource(R.drawable.brunchimages);
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.brunch1,"brunch tip 1"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.brunch2,"brunch tip 2"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.brunch3,"brunch tip 3"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.brunch4,"brunch tip 4"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.brunch5,"brunch tip 5"));
            quickTipsItemAdapter.notifyDataSetChanged();
        }
        if (tip != null && tip.equalsIgnoreCase("lunch")){
            imageView.setImageResource(R.drawable.lunchimage);
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.lunch1,"lunch tip 1"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.lunch2,"lunch tip 2"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.lunch3,"lunch tip 3"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.lunch4,"lunch tip 4"));
            quickTipsItemAdapter.notifyDataSetChanged();
        }
        if (tip != null && tip.equalsIgnoreCase("dinner")){
            imageView.setImageResource(R.drawable.dinnerimage);
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.dinner1,"dinner tip 1"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.dinner2,"dinner tip 2"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.dinner3,"dinner tip 3"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.dinner4,"dinner tip 4"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.dinner5,"dinner tip 5"));
            quickTipsItemAdapter.notifyDataSetChanged();
        }
        if (tip != null && tip.equalsIgnoreCase("smoothie")){
            imageView.setImageResource(R.drawable.smoothieimage);
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.smoothie1,"smoothie tip 1"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.smoothie2,"smoothie tip 2"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.smoothie3,"smoothie tip 3"));
            quickTipsItemModelsList.add(new QuickTipsItemModel(R.drawable.smoothie4,"smoothie tip 4"));

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