package com.project.chefklub.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.chefklub.Activities.QuickTipsDetailsActivity;
import com.project.chefklub.R;
import com.project.chefklub.models.QuickTipModel;

import java.util.List;

public class QuictipsAdapters extends RecyclerView.Adapter<QuictipsAdapters.ViewHolder> {

    Context context;
    List<QuickTipModel>list;

    public QuictipsAdapters(Context context, List<QuickTipModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.quick_tip_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, QuickTipsDetailsActivity.class);
                intent.putExtra("tip",list.get(position).getTip());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image =itemView.findViewById(R.id.image_qt);
            name = itemView.findViewById(R.id.name_qt);


        }
    }
}
