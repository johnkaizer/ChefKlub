package com.project.chefklub.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.chefklub.R;
import com.project.chefklub.adapters.HorizontalAdapter;
import com.project.chefklub.adapters.Recipes;
import com.project.chefklub.adapters.VerticalAdapter;
import com.project.chefklub.models.HorizontalModel;
import com.project.chefklub.models.VerticalModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements Recipes {

    RecyclerView homeRec, verticalRec;
    ArrayList<HorizontalModel> horizontalModelList;
    HorizontalAdapter horizontalAdapter;
    //Vertical Recyclerview
    ArrayList<VerticalModel>verticalModelList;
    VerticalAdapter verticalAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        homeRec = root.findViewById(R.id.horizontal_rec);
        verticalRec = root.findViewById(R.id.vertical_rec);

        ///Horizontal recyclerview
        horizontalModelList =new ArrayList<>();

        horizontalModelList.add(new HorizontalModel(R.drawable.fish, "Fish"));
        horizontalModelList.add(new HorizontalModel(R.drawable.githeri, "Githeri"));
        horizontalModelList.add(new HorizontalModel(R.drawable.kuku, "Chicken"));
        horizontalModelList.add(new HorizontalModel(R.drawable.omena, "Sardines"));
        horizontalModelList.add(new HorizontalModel(R.drawable.ugali, "Ugali"));
        horizontalModelList.add(new HorizontalModel(R.drawable.samosa, "Samosa"));
        horizontalModelList.add(new HorizontalModel(R.drawable.pilau, "Pilau"));
        horizontalModelList.add(new HorizontalModel(R.drawable.mutton, "Mutton"));
        horizontalModelList.add(new HorizontalModel(R.drawable.pork, "Pork"));
        horizontalModelList.add(new HorizontalModel(R.drawable.chapo, "Chapati"));
        horizontalModelList.add(new HorizontalModel(R.drawable.mandazis, "Mandazi"));

        horizontalAdapter = new HorizontalAdapter(getActivity(), horizontalModelList, this);
        homeRec.setAdapter(horizontalAdapter);
        homeRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false));
        homeRec.setHasFixedSize(true);
        homeRec.setNestedScrollingEnabled(false);

        ///Vertical recyclerview
        verticalModelList = new ArrayList<>();

        verticalAdapter = new VerticalAdapter(getActivity(),verticalModelList);
        verticalRec.setAdapter(verticalAdapter);
        verticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL, false));

        return root;
    }

    @Override
    public void callBack(int position, ArrayList<VerticalModel> list) {

        verticalAdapter = new VerticalAdapter(getContext(),list);
        verticalAdapter.notifyDataSetChanged();
        verticalRec.setAdapter(verticalAdapter);

    }
}