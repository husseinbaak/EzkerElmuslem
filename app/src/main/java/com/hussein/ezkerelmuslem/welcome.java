package com.hussein.ezkerelmuslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ImageView imageView=(ImageView) findViewById(R.id.welcome_Img);
        Thread thread=new Thread(){
         public void run(){
             try{
                sleep(3000);
                 Intent mainActiv=new Intent(getApplicationContext(), MainActivity.class);
                 startActivity(mainActiv);
                 finish();
             }catch(InterruptedException e){
                e.printStackTrace();
             }
         }
        };
        thread.start();
        }
}