package com.project.chefklub.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.chefklub.R;
import com.project.chefklub.models.VerticalModel;

import java.util.ArrayList;
import java.util.List;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.viewHolder> {

    Context context;
    ArrayList<VerticalModel> list;

    public VerticalAdapter(Context context, ArrayList<VerticalModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_recipes_items,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.duration.setText(list.get(position).getDuration());
        holder.rating.setText(list.get(position).getRating());
        holder.cost.setText(list.get(position).getCost());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name,duration,rating,cost;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image_vr);
            name = itemView.findViewById(R.id.name);
            duration = itemView.findViewById(R.id.duration);
            rating = itemView.findViewById(R.id.rating);
            cost = itemView.findViewById(R.id.cost);
        }
    }
}
