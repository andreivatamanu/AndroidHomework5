package com.example.androidhomework5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Challenge6 extends AppCompatActivity {

    private RecyclerView mRecyclerViewTask;
    private ItemTaskAdapter mItemTaskAdapter;
    private List<ItemTask> mItemTaskList;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge6);

        initView();
    }

    private void initView() {
        mRecyclerViewTask = findViewById(R.id.recycler_view_item_task);
        mEditText = findViewById(R.id.recycler_view_edit_text);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewTask.setLayoutManager(layoutManager);
        mItemTaskAdapter = new ItemTaskAdapter(getTasks(),
                Challenge6.this);
        mRecyclerViewTask.setAdapter(mItemTaskAdapter);
    }

    private List<ItemTask> getTasks() {
        mItemTaskList = new ArrayList<>();

        return mItemTaskList;
    }

    public void addItem(View view) {

        if (!mEditText.getText().toString().isEmpty()) {

            mItemTaskList.add(new ItemTask(mEditText.getText().toString(), false));

        }

        mItemTaskAdapter.swapItems(mItemTaskList);

        mEditText.setText(getString(R.string.empty));
    }
}
