package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class gallerytitleview extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;
    TextView firstt1;
    ImageView firstimg;
    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallerytitleview);
        setTitle("Recyclerview");
        TextView firstt1=(TextView)findViewById(R.id.firstt1);

        rcv=(RecyclerView)findViewById(R.id.recview);
          adapter=new myadapter(dataqueue());
          rcv.setAdapter(adapter);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);


    }
    public ArrayList<model>dataqueue(){
        ArrayList<model> holder=new ArrayList<>();
        model ob1=new model();
        ob1.setHeader("Demo");
        ob1.setImname(R.drawable.img4);
        holder.add(ob1);
        model ob2=new model();
        ob2.setHeader("Demo");
        ob2.setImname(R.drawable.img2);
        holder.add(ob2);
        model ob3=new model();
        ob3.setHeader("Demo");
        ob3.setImname(R.drawable.img3);
        holder.add(ob3);
        model ob4=new model();
        ob4.setHeader("Demo");
        ob4.setImname(R.drawable.img5);
        holder.add(ob4);
        return holder;
    }


    public void fim(View view) {
        Intent i=new Intent(getApplicationContext(),galleryactivity.class);
        startActivity(i);
    }
}