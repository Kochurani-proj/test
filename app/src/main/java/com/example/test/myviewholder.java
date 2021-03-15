package com.example.test;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder {
    ImageView im;
    TextView t1;
    public myviewholder(@NonNull View itemView) {
        super(itemView);
        im=(ImageView)itemView.findViewById(R.id.img1);
        t1=(TextView)itemView.findViewById(R.id.t1);
    }
}
