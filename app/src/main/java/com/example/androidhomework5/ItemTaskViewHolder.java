package com.example.androidhomework5;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class ItemTaskViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextViewTitle;
    private CheckBox mCheckBox;


    public ItemTaskViewHolder(@NonNull View itemView) {
        super(itemView);
        mTextViewTitle = itemView.findViewById(R.id.text_view_item_task);
        mCheckBox = itemView.findViewById(R.id.check_box_item_task);
    }

    public TextView getTextViewTitle() {
        return mTextViewTitle;
    }

    public void setTextViewTitle(TextView textViewTitle) {
        mTextViewTitle = textViewTitle;
    }

    public CheckBox getCheckBox() {
        return mCheckBox;
    }

    public void setCheckBox(CheckBox checkBox) {
        mCheckBox = checkBox;
    }
}
