package com.project.chefklub.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.chefklub.R;
import com.project.chefklub.models.FavouriteModelHoriz;

import java.util.List;

public class FavouriteAdapterHoriz extends RecyclerView.Adapter<FavouriteAdapterHoriz.ViewHolder> {

    List<FavouriteModelHoriz>list;

    public FavouriteAdapterHoriz(List<FavouriteModelHoriz> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.hor_fav_items,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.desc.setText(list.get(position).getDesc());
        holder.name.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView desc, name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.fav_image);
            name = itemView.findViewById(R.id.fav_name);
            desc = itemView.findViewById(R.id.fav_desc);
        }
    }
}
