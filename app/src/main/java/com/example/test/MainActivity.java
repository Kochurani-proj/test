package com.example.test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton fbutton;

Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fbutton=(FloatingActionButton)findViewById(R.id.fbutton);

            fbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
                    View mView=getLayoutInflater().inflate(R.layout.mydialogcustom,null);
                    final EditText edt=(EditText)mView.findViewById(R.id.titleid);
                    Button B_cancel=(Button)mView.findViewById(R.id.b_cancel);
                    Button Bok=(Button)mView.findViewById(R.id.bok);
                    alert.setView(mView);
                    final AlertDialog alertDialog=alert.create();
alertDialog.setCanceledOnTouchOutside(false);
B_cancel.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

       alertDialog.dismiss();
    }
});
Bok.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

Intent i=new Intent(MainActivity.this,gallerytitleview.class);
startActivity(i);
    }
});
alertDialog.show();
                }
                });
    }
}