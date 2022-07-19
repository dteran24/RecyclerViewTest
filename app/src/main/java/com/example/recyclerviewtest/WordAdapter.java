package com.example.recyclerviewtest;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtest.R;

//holder = reserve
//DishAdapter.DishViewHolder = inner class
public class WordAdapter extends RecyclerView.Adapter<WordAdapter.DishViewHolder>  {
    public static String TAG = WordAdapter.class.getSimpleName();

    /*private static ClickListener clickListener;
    public interface ClickListener {
        void onItemClick(int position, View v);
        void onItemLongClick(int position, View v);
    }*/

    String[] dishes;


    public WordAdapter(String[] mDishes){
        dishes = mDishes;
    }

    @NonNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(TAG,"nicholas is going to market to buy a row plank");
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View plank = layoutInflater.inflate(R.layout.row,parent,false);

        return new DishViewHolder(plank);
    }

    @Override
    public void onBindViewHolder(@NonNull DishViewHolder holder, int position) {
        Log.i(TAG,"christian- is writing"+ dishes[position]);
        //holder.dishTextView.getText();
        holder.word.setText(dishes[position]);



    }

    @Override
    public int getItemCount() {
        Log.i(TAG,"kenneth- counting the no of items in the data");

        return dishes.length;
    }




    public class DishViewHolder extends RecyclerView.ViewHolder  {
        TextView word;
        public DishViewHolder(@NonNull View nicholasPlank) {
            super(nicholasPlank);
            // nicholasPlank.setOnClickListener(this);
            Log.i(TAG,"david- vh got the plank");
            word = nicholasPlank.findViewById(R.id.row_textView);

        }



       /* @Override
        public void onClick(View view) {
            clickListener.onItemClick(getAdapterPosition(), view);
        }
        public void setOnItemClickListener(ClickListener clickListener) {
            DishAdapter.clickListener = clickListener;
        }*/
    }
}