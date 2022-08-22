package com.project.chefklub.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.project.chefklub.R;
import com.project.chefklub.models.HorizontalModel;
import com.project.chefklub.models.VerticalModel;

import java.util.ArrayList;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.viewHolder> {

    Activity activity;
    ArrayList<HorizontalModel> list;
    Recipes recipes;

    boolean check = true;
    boolean select  = true;
    int row_index = -1;

    public HorizontalAdapter(Activity activity, ArrayList<HorizontalModel> list, Recipes recipes) {
        this.activity = activity;
        this.list = list;
        this.recipes = recipes;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<VerticalModel> verticalModels = new ArrayList<>();
            verticalModels.add(new VerticalModel(R.drawable.backedfish, "Backed Fish", "2.0 - Hours", "4.5", "KSH 1800"));
            verticalModels.add(new VerticalModel(R.drawable.fishstew, "Fish Stew", "1.5 - Hours", "4.0", "KSH 2000"));
            verticalModels.add(new VerticalModel(R.drawable.curryfish, "Curry Fish", "1.0 - Hours", "5.0", "KSH 1800"));

            recipes.callBack(position, verticalModels);
            check = false;
        }
         holder.cardView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 row_index = position;
                 notifyDataSetChanged();
                 if (position == 0){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.backedfish,"Backed Fish","2.0 - Hours","4.5","KSH 1800"));
                     verticalModels.add(new VerticalModel(R.drawable.fishstew,"Fish Stew","1.5 - Hours","4.0","KSH 2000"));
                     verticalModels.add(new VerticalModel(R.drawable.curryfish,"Curry Fish","1.0 - Hours","5.0","KSH 1800"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 1){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.chickencurry,"Chicken Curry","2.0 - Hours","4.5","KSH 1500"));
                     verticalModels.add(new VerticalModel(R.drawable.chickenstew,"Chicken Stew","2.0 - Hours","4.0","KSH 1500"));
                     verticalModels.add(new VerticalModel(R.drawable.friedchiken,"Frfied Chicken","0.5 - Hours","5.0","KSH 1800"));
                     verticalModels.add(new VerticalModel(R.drawable.grilledchick,"Grilled Chicken","3 - Hours","4.5","KSH 2000"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 2){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.omenafry,"Wetfry Omena","1.5 - Hours","4.5","KSH 2000"));
                     verticalModels.add(new VerticalModel(R.drawable.omenastew,"Omena Stew","1.0 - Hours","5.0","KSH 1900"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 3){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.bluebandugali,"Blueband Ugali","0.5 - Hours","4.5","KSH 1700"));
                     verticalModels.add(new VerticalModel(R.drawable.brownugali,"Brown Ugali","0.5 - Hours","4.0","KSH 2000"));
                     verticalModels.add(new VerticalModel(R.drawable.whiteugali,"White Ugali","0.5 - Hours","4.5","KSH 1700"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 4){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.beefsamosa,"Beef Samiosa","2.0 - Hours","4.5","1500"));
                     verticalModels.add(new VerticalModel(R.drawable.ndengusamosa,"Ndengu Samosa","2.0 - Hours","4.0","KSH 1700"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 5){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.beefpilau,"Beef Pilau","2.0 - Hours","3.5","KSH 2000"));
                     verticalModels.add(new VerticalModel(R.drawable.chickenpilau,"Chicken Pilau","2.0 - Hours","5.0","KSH 1500"));
                     verticalModels.add(new VerticalModel(R.drawable.zanzibarpilau,"Zanzibar Pilau","2.0 - Hours","4.0","KSH 2000"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 6){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.muttonfried,"Fried Mutton","2.5 - Hours","5.0","KSH 1400"));
                     verticalModels.add(new VerticalModel(R.drawable.boiledmuttton,"Boiled Mutton","3 - Hours","4.0","KSH 1800"));
                     verticalModels.add(new VerticalModel(R.drawable.muttonstew,"Mutton Stew","2.5 - Hours","5.0","KSH 1700"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 7){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.porkstew,"Pork Stew","1.5 - Hours","4.5","KSH 1500"));
                     verticalModels.add(new VerticalModel(R.drawable.boiledpork,"Boiled Pork","2.0 - Hours","4.0","KSH 1700"));
                     verticalModels.add(new VerticalModel(R.drawable.friedpork,"Fried Pork","0.5 - Hours","5.0","KSH 2000"));
                     verticalModels.add(new VerticalModel(R.drawable.wetfrypork,"Wetfry Pork","1.0 - Hours","4.5","KSH 1500"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 8){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.peasgitheri,"Peas Githeri","3.0 - Hours","4.0","KSH 1700"));
                     verticalModels.add(new VerticalModel(R.drawable.simplegitheri,"Simple Githeri","4.0 - Hours","5.0","1500"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 9){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.peasgitheri,"Peas Githeri","3.0 - Hours","4.0","KSH 1700"));
                     verticalModels.add(new VerticalModel(R.drawable.simplegitheri,"Simple Githeri","4.0 - Hours","5.0","1500"));
                     recipes.callBack(position, verticalModels );
                 }
             }
         });
         if (select){
             if (position == 0){
                 holder.cardView.setBackgroundResource(R.drawable.backgr);
                 select = false;
             }
         }
         else {
             if (row_index == position){
                 holder.cardView.setBackgroundResource(R.drawable.backgr);

             }else {
                 holder.cardView.setBackgroundResource(R.drawable.default_backgr);
             }
         }
        }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;
        CardView cardView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image_recipe);
            name = itemView.findViewById(R.id.text_recipe);
            cardView = itemView.findViewById(R.id.cardView1);

        }
    }
}
