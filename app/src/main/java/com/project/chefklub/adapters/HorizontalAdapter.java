package com.project.chefklub.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.project.chefklub.Activities.RecipeDetailsActivity;
import com.project.chefklub.R;
import com.project.chefklub.models.HorizontalModel;
import com.project.chefklub.models.VerticalModel;

import java.util.ArrayList;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.viewHolder> {

    Activity activity;
    ArrayList<HorizontalModel> list;
    Recipes recipes;
    Context context;

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
            verticalModels.add(new VerticalModel(R.drawable.backedfish, "Backed Fish", "2.0 - Hours", "4.5", "KSH 1800","1. Fish\n2. Onions\n3. Tomatoes\n", "Wrap your fish with the ingredients in a foil"));
            verticalModels.add(new VerticalModel(R.drawable.fishstew, "Fish Stew", "1.5 - Hours", "4.0", "KSH 2000","1. Fish\n2. Onions\n3. Tomatoes\n", "Wrap your fish with the ingredients in a foil"));
            verticalModels.add(new VerticalModel(R.drawable.curryfish, "Curry Fish", "1.0 - Hours", "5.0", "KSH 1800","1. Fish\n2. Onions\n3. Tomatoes\n", "Wrap your fish with the ingredients in a foil"));

            recipes.callBack(position, verticalModels);
            check = false;
        }
         holder.cardView1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 row_index = position;
                 notifyDataSetChanged();
                 if (position == 0){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.backedfish,"Backed Fish","2.0 - Hours","4.5","KSH 1800","1. Fish\n2. Onions\n3. Tomatoes\n", "Wrap your fish with the ingredients in a foil"));
                     verticalModels.add(new VerticalModel(R.drawable.fishstew,"Fish Stew","1.5 - Hours","4.0","KSH 2000","1. Fish\n2. Onions\n3. Tomatoes\n", "Wrap your fish with the ingredients in a foil"));
                     verticalModels.add(new VerticalModel(R.drawable.curryfish,"Curry Fish","1.0 - Hours","5.0","KSH 1800","1. Fish\n2. Onions\n3. Tomatoes\n", "Wrap your fish with the ingredients in a foil"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 1){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.chickencurry,"Chicken Curry","2.0 - Hours","4.5","KSH 1500","1. Chicken\n2. Onions\n3. Tomatoes\n4. Curry Powder", "Wrap your fish with the ingredients in a foil"));
                     verticalModels.add(new VerticalModel(R.drawable.chickenstew,"Chicken Stew","2.0 - Hours","4.0","KSH 1500","1. Chicken\n2. Onions\n3. Tomatoes\n4. Vegetables", "Wrap your fish with the ingredients in a foil"));
                     verticalModels.add(new VerticalModel(R.drawable.friedchiken,"Frfied Chicken","0.5 - Hours","5.0","KSH 1800","1. Chicken\n2. Onions\n3. Tomatoes\n", "Wrap your fish with the ingredients in a foil"));
                     verticalModels.add(new VerticalModel(R.drawable.grilledchick,"Grilled Chicken","3 - Hours","4.5","KSH 2000","1. Chicken\n2. Onions\n3. Tomatoes\n", "Wrap your fish with the ingredients in a foil"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 2){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.omenafry,"Wetfry Omena","1.5 - Hours","4.5","KSH 2000","1. Omena\n2. Onions\n3. Tomatoes\n", "Wrap your fish with the ingredients in a foil"));
                     verticalModels.add(new VerticalModel(R.drawable.omenastew,"Omena Stew","1.0 - Hours","5.0","KSH 1900","1. Omena\n2. Onions\n3. Tomatoes\n", "Wrap your fish with the ingredients in a foil"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 3){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.bluebandugali,"Blueband Ugali","0.5 - Hours","4.5","KSH 1700","1. Maize flour\n2. Blueband\n3. Water\n", "Boil some water till it stars bubbling, add blueband and let it dissolve then add flour while stirring to your satisfaction"));
                     verticalModels.add(new VerticalModel(R.drawable.brownugali,"Brown Ugali","0.5 - Hours","4.0","KSH 2000","1. Sorghum flour\n2 . Water\n", "Boil some water till it stars bubbling add flour while stirring to your satisfaction"));
                     verticalModels.add(new VerticalModel(R.drawable.whiteugali,"White Ugali","0.5 - Hours","4.5","KSH 1700","1. White Maize flour\n2.  Water\n", "Boil some water till it stars bubbling add flour while stirring to your satisfaction"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 4){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.beefsamosa,"Beef Samiosa","2.0 - Hours","4.5","1500","1. Wheat flour\n2. Minced Meat\n3. Cooking Oil\n", "Boil some water till it stars bubbling, add blueband and let it dissolve then add flour while stirring to your satisfaction"));
                     verticalModels.add(new VerticalModel(R.drawable.ndengusamosa,"Ndengu Samosa","2.0 - Hours","4.0","KSH 1700","1. Wheat flour\n2. Green grams\n3. Cooking Oil\n", "Boil some water till it stars bubbling, add blueband and let it dissolve then add flour while stirring to your satisfaction"));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 5){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.beefpilau,"Beef Pilau","2.0 - Hours","3.5","KSH 2000","1. Rice\n2. Beef\n3. Cooking Oil\n4. Spices","  "));
                     verticalModels.add(new VerticalModel(R.drawable.chickenpilau,"Chicken Pilau","2.0 - Hours","5.0","KSH 1500","1. Rice\n2. Chicken\n3. Cooking Oil\n4. Spices","  "));
                     verticalModels.add(new VerticalModel(R.drawable.zanzibarpilau,"Zanzibar Pilau","2.0 - Hours","4.0","KSH 2000","1. Rice\n2. Beef\n3. Cooking Oil\n4. Spices","  "));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 6){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.muttonfried,"Fried Mutton","2.5 - Hours","5.0","KSH 1400","1. Mutton\n2. Tomatoes\n3. Onions\n4. Oil","  "));
                     verticalModels.add(new VerticalModel(R.drawable.boiledmuttton,"Boiled Mutton","3 - Hours","4.0","KSH 1800","1. Mutton\n2. Tomatoes\n3. Onions","  "));
                     verticalModels.add(new VerticalModel(R.drawable.muttonstew,"Mutton Stew","2.5 - Hours","5.0","KSH 1700","1. Mutton\n2. Tomatoes\n3. Onions\n4. Oil","  "));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 7){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.porkstew,"Pork Stew","1.5 - Hours","4.5","KSH 1500","1. Pork\n2. Tomatoes\n3. Onions\n4. Oil","  "));
                     verticalModels.add(new VerticalModel(R.drawable.boiledpork,"Boiled Pork","2.0 - Hours","4.0","KSH 1700","1. Pork\n2. Tomatoes\n3. Onions\n4. Oil","  "));
                     verticalModels.add(new VerticalModel(R.drawable.friedpork,"Fried Pork","0.5 - Hours","5.0","KSH 2000","1. Pork\n2. Tomatoes\n3. Onions\n4. Oil","  "));
                     verticalModels.add(new VerticalModel(R.drawable.wetfrypork,"Wetfry Pork","1.0 - Hours","4.5","KSH 1500","1. Pork\n2. Tomatoes\n3. Onions\n4. Oil","  "));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 8){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.peasgitheri,"Peas Githeri","3.0 - Hours","4.0","KSH 1700","1. Peas\n2. Maize\n3.  Onions","  "));
                     verticalModels.add(new VerticalModel(R.drawable.simplegitheri,"Simple Githeri","4.0 - Hours","5.0","1500","1. Maize\n2. Beans\n3. Onions\n4. Oil","  "));
                     recipes.callBack(position, verticalModels );
                 }
                 else if (position == 9){
                     ArrayList<VerticalModel> verticalModels = new ArrayList<>();
                     verticalModels.add(new VerticalModel(R.drawable.peasgitheri,"Peas Githeri","3.0 - Hours","4.0","KSH 1700","1. Maize\n2. Beans\n3. Onions\n4. Oil","  "));
                     verticalModels.add(new VerticalModel(R.drawable.simplegitheri,"Simple Githeri","4.0 - Hours","5.0","1500","1. Maize\n2. Beans\n3. Onions\n4. Oil","  "));
                     recipes.callBack(position, verticalModels );
                 }
             }
         });
         if (select){
             if (position==0){
                 holder.cardView1.setBackgroundResource(R.drawable.backgr);
                 select = false;
             }
         }
         else {
             if (row_index==position){
                 holder.cardView1.setBackgroundResource(R.drawable.backgr);

             }else  {
                 holder.cardView1.setBackgroundResource(R.drawable.default_backgr);
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
        CardView cardView1,cardView2;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image_recipe);
            name = itemView.findViewById(R.id.text_recipe);
            cardView1 = itemView.findViewById(R.id.cardView1);
            cardView2 = itemView.findViewById(R.id.cardView2);

        }
    }
}
