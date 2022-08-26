package com.project.chefklub.ui.Favourite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.chefklub.R;
import com.project.chefklub.adapters.FavouriteAdapter;
import com.project.chefklub.adapters.FavouriteAdapterHoriz;
import com.project.chefklub.models.FavouriteModel;
import com.project.chefklub.models.FavouriteModelHoriz;

import java.util.ArrayList;
import java.util.List;

public class FavouriteMealFragment extends Fragment {

    RecyclerView recyclerView, recyclerView1;
    List<FavouriteModelHoriz> favouriteAdapterHorizList;
    FavouriteAdapterHoriz favouriteAapterHoriz;
    //
    List<FavouriteModel> favouriteModelList;
    FavouriteAdapter favouriteAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.favourite_meal_fragement, container, false);

        // Horizontal Recyclerview

        recyclerView = root.findViewById(R.id.fav_horiz_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        favouriteAdapterHorizList = new ArrayList<FavouriteModelHoriz>();

        favouriteAdapterHorizList.add(new FavouriteModelHoriz(R.drawable.breakfast5,"Fav Breakfast1","Breakfast"));
        favouriteAdapterHorizList.add(new FavouriteModelHoriz(R.drawable.lunch2,"Fav Lunch ","Lunch"));
        favouriteAdapterHorizList.add(new FavouriteModelHoriz(R.drawable.breakfast5,"Fav Breakfast for family","Breakfast"));
        favouriteAdapterHorizList.add(new FavouriteModelHoriz(R.drawable.brunch3,"Fav Brunch for 2","Bunch"));
        favouriteAdapterHorizList.add(new FavouriteModelHoriz(R.drawable.dinner2,"Fav Dinner night","Dinner"));
        favouriteAdapterHorizList.add(new FavouriteModelHoriz(R.drawable.smoothie2,"Fav Smoothie Sato","Smoothie"));
        favouriteAdapterHorizList.add(new FavouriteModelHoriz(R.drawable.breakfast3,"Fav Breakfast ya Power","Breakfast"));

        favouriteAapterHoriz = new FavouriteAdapterHoriz(favouriteAdapterHorizList );
        recyclerView.setAdapter(favouriteAapterHoriz);

        // Vertical Recyclerview

        recyclerView1 = root.findViewById(R.id.fav_horiz_ver);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        favouriteModelList = new ArrayList<FavouriteModel>();

        favouriteModelList.add(new FavouriteModel(R.drawable.breakfast5,"Fav Breakfast1","Breakfast"));
        favouriteModelList.add(new FavouriteModel(R.drawable.lunch2,"Fav Lunch ","Lunch"));
        favouriteModelList.add(new FavouriteModel(R.drawable.breakfast5,"Fav Breakfast for family","Breakfast"));
        favouriteModelList.add(new FavouriteModel(R.drawable.brunch3,"Fav Brunch for 2","Bunch"));
        favouriteModelList.add(new FavouriteModel(R.drawable.dinner2,"Fav Dinner night","Dinner"));
        favouriteModelList.add(new FavouriteModel(R.drawable.smoothie2,"Fav Smoothie Sato","Smoothie"));
        favouriteModelList.add(new FavouriteModel(R.drawable.breakfast3,"Fav Breakfast ya Power","Breakfast"));

        favouriteAdapter = new FavouriteAdapter(favouriteModelList );
        recyclerView1.setAdapter(favouriteAdapter);



        return root;
    }

}