package com.cmm.fetchrewards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {


    private List<Item> itemList;
    private Context context;

    ItemAdapter(List<Item> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        final Item item = itemList.get(position);
        holder.itemText.setText(item.getName());
        holder.itemListId.setText(item.getListID());
    }

    class ViewHolder extends RecyclerView.ViewHolder  {

        // define the View objects
        TextView itemText;
        TextView itemListId;

        ViewHolder(View itemView) {
            super(itemView);

            // initialize the View objectt
            itemText = itemView.findViewById(R.id.item_name);
            itemListId = itemView.findViewById(R.id.list_id);
        }

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
