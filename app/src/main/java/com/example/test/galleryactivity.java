package com.example.test;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class galleryactivity extends AppCompatActivity {
    ImageView mImageView;
    private static final int IMAGE_PICK_CODE=1000;
    private static final int PERMISSION_CODE=1001;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galleryactivity);
        mImageView =findViewById(R.id.photo);
      mImageView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M) {
                  if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
                      String[] permissions={Manifest.permission.READ_EXTERNAL_STORAGE};
                      requestPermissions(permissions,PERMISSION_CODE);

                  } else {
                      pickImageFromGallery();
                  }
              }
              else{
                  pickImageFromGallery();

              }
          }
      });
    }

    private void pickImageFromGallery() {
        Intent intent =new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent,IMAGE_PICK_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == IMAGE_PICK_CODE) {
            mImageView.setImageURI(data.getData());
        }
    }}

