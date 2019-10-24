package com.example.assignment2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



    // We need to give a type in angle brackets <> when we extend RecyclerView.Adapter
// It's saying that we want an adapter that adapts to ArticleViewHolder (our custom ViewHolder)
    public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
        // class variable that holds the data that we want to adapt
        private ArrayList<Item> itemsToAdapt;

        public void setData(ArrayList<Item> itemsToAdapt) {
            // This is basically a Setter that we use to give data to the adapter
            this.itemsToAdapt = itemsToAdapt;
        }

        @NonNull
        @Override
        public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            // First create a View from the layout file. It'll probably be a ViewGroup like
            // ConstraintLayout that contains more Views inside it.
            // This view now represents your entire one item.
            View view =
                    LayoutInflater.from(parent.getContext())
                            .inflate(R.layout.item, parent, false);

            // Then create an instance of your custom ViewHolder with the View you got from inflating
            // the layout.
            ItemViewHolder itemViewHolder = new ItemViewHolder(view);
            return itemViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
            // Compare what we have in this method, to what we used to have in MainActivity

            // 'position' is the index of the ViewHolder currently being bound (note VIEWHOLDER). So
            // if position is 0, then we are binding the first ViewHolder in the list. This means the
            // corresponding data object will be at index 0 of our data ArrayList.
            final Item itemAtPosition = itemsToAdapt.get(position);

            holder.nameTextView.setText(itemAtPosition.getName());
            // holder.costTextView.setText(itemAtPosition.getCost());
            // holder.descTextView.setText(itemAtPosition.getDesc());


            holder.view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();

                    Intent intent = new Intent(context, ItemDetail.class);
                    intent.putExtra("ItemID", itemAtPosition.getItemID());
                    context.startActivity(intent);
                }
            });



            holder.itemImageView.setImageResource(itemAtPosition.getImageDrawableId());


        }

        @Override
        public int getItemCount() {
            return itemsToAdapt.size();
        }

        // ViewHolder represents one item, but doesn't have data when it's first constructed.
        // We assign the data in onBindViewHolder.
        public static class ItemViewHolder extends RecyclerView.ViewHolder {
            public View view;
            public TextView nameTextView;
            //public TextView costTextView;
            //public TextView descTextView;
            public ImageView itemImageView;

            // This constructor is used in onCreateViewHolder
            public ItemViewHolder(View v) {
                super(v);  // runs the constructor for the ViewHolder superclass
                view = v;

                nameTextView = v.findViewById(R.id.foodName);
                itemImageView = v.findViewById(R.id.foodIcon);
                //costTextView = v.findViewById(R.id.detailCost);
                //descTextView = v.findViewById(R.id.detailDesc);
            }
        }


    }


