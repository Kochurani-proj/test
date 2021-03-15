package com.example.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomGalleryAdapter extends BaseAdapter {
    private Context context;
    private int[] image;
    public CustomGalleryAdapter(Context applicationContext, int[] image) {
        context=applicationContext;
        this.image=image;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(context);
        imageView.setImageResource(image[position]);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(200,200));
        return imageView;
    }
}
