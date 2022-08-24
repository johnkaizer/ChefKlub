package com.project.chefklub.ui.QuickTips;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.chefklub.R;
import com.project.chefklub.adapters.QuictipsAdapters;
import com.project.chefklub.models.HorizontalModel;
import com.project.chefklub.models.QuickTipModel;

import java.util.ArrayList;
import java.util.List;


public class QuickTipsFragment extends Fragment {

    RecyclerView recyclerView;
    List<QuickTipModel> quickTipModels;
    QuictipsAdapters quictipsAdapters;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_quick_tips, container, false);

        recyclerView = root.findViewById(R.id.quick_tips_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        quickTipModels = new ArrayList<>();

        quickTipModels.add(new QuickTipModel(R.drawable.breakfastimages, "Breakfast Tips","breakfast"));
        quickTipModels.add(new QuickTipModel(R.drawable.brunchimages, "Brunch Tips","brunch"));
        quickTipModels.add(new QuickTipModel(R.drawable.lunchimage, "Lunch Tips","lunch"));
        quickTipModels.add(new QuickTipModel(R.drawable.dinnerimage, "Dinner tips","dinner"));
        quickTipModels.add(new QuickTipModel(R.drawable.smoothieimage, "Smoothie tips","smoothie"));
        quickTipModels.add(new QuickTipModel(R.drawable.simplemeals, "Simple Meals tips","simple"));
        quickTipModels.add(new QuickTipModel(R.drawable.ugali, "Cheap Meals tips","cheap"));


        quictipsAdapters = new QuictipsAdapters(getContext(), quickTipModels);
        recyclerView.setAdapter(quictipsAdapters);
        quictipsAdapters.notifyDataSetChanged();

        return root;
    }
}