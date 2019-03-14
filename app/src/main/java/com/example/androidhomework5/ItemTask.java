package com.example.androidhomework5;

public class ItemTask {

    private String mTask;
    private boolean mStatus;

    public ItemTask(String task, boolean status) {
        mTask = task;
        mStatus = status;
    }

    public String getTask() {
        return mTask;
    }

    public void setTask(String task) {
        mTask = task;
    }

    public boolean isStatus() {
        return mStatus;
    }

    public void setStatus(boolean status) {
        mStatus = status;
    }
}
