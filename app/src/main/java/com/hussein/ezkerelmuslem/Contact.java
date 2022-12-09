package com.hussein.ezkerelmuslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);


    }
    public void getFaceBook(View view){
        Intent face=new Intent(Intent.ACTION_VIEW   );
        face.setData(Uri.parse("https://www.facebook.com/hussein9894/"));
        startActivity(face);
    }
}