package com.example.recycleview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    // ビューに配置されたウィジェットを保持しておくためのフィールド
    TextView title;
    TextView tag;
    TextView desc;

    // コンストラクター（ウィジェットへの参照を格納）
    MyViewHolder(View itemView){
        super(itemView);
        this.title = itemView.findViewById(R.id.title);
        this.tag = itemView.findViewById(R.id.tag);
        this.desc = itemView.findViewById(R.id.desc);
    }
}
