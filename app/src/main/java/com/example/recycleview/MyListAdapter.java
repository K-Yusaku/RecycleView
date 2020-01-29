package com.example.recycleview;

import android.app.LauncherActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyListAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private ArrayList<ListItem> data;

    // コンストラクター（データソースを準備）
    public MyListAdapter(ArrayList<ListItem> data ) {
        this.data = data;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(this.data.get(position).getTitle());
        holder.tag.setText(this.data.get(position).getTag());
        holder.desc.setText(this.data.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return this.data.size();
    }
}
