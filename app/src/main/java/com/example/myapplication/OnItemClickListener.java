package com.example.myapplication;

import android.view.View;

public interface OnItemClickListener {
    public void onItemClick(ItemAdapter.ItemViewHolder holder, View view, int position);
}
