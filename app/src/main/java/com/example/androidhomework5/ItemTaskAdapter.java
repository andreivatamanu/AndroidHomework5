package com.example.androidhomework5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ItemTaskAdapter extends RecyclerView.Adapter<ItemTaskViewHolder> {

    private List<ItemTask> mItemTaskList;
    private Context mContext;

    public ItemTaskAdapter(List<ItemTask> itemTaskList, Context context) {
        mItemTaskList = itemTaskList;
        mContext = context;
    }

    @NonNull
    @Override
    public ItemTaskViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView =
                LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tasks_item
                        , viewGroup, false);

        return new ItemTaskViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemTaskViewHolder itemTaskViewHolder, int i) {

        ItemTask currentItemTask = mItemTaskList.get(i);
        itemTaskViewHolder.getTextViewTitle().setText(currentItemTask.getTask());
        itemTaskViewHolder.getCheckBox().setChecked(currentItemTask.isStatus());

        itemTaskViewHolder.getCheckBox().setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                currentItemTask.setStatus(true);
            }else{
                currentItemTask.setStatus(false);
            }
        });

        itemTaskViewHolder.itemView.setOnClickListener(v -> {
            if(itemTaskViewHolder.getCheckBox().isChecked()) {
                itemTaskViewHolder.getCheckBox().setChecked(false);
                currentItemTask.setStatus(false);
            }else{
                itemTaskViewHolder.getCheckBox().setChecked(true);
                currentItemTask.setStatus(true);
            }
        });

        itemTaskViewHolder.itemView.setOnLongClickListener(v -> {
            mItemTaskList.remove(i);
            notifyDataSetChanged();
            return true;
        });

    }

    @Override
    public int getItemCount() {
        return mItemTaskList.size();
    }

    public void swapItems(List<ItemTask> todolist){
        this.mItemTaskList = todolist;
        notifyDataSetChanged();
    }
}
