package com.hussein.ezkerelmuslem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProjeGelistiren extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proje_gelistiren);
        ListView proje_yapan=(ListView) findViewById(R.id.list_view);
        String [] yapan={"Hussein","Orhan","Ak Dogan","Samet","Berat"};
        int yapanXml= androidx.appcompat.R.layout.support_simple_spinner_dropdown_item;
        ArrayAdapter adapter=new ArrayAdapter(ProjeGelistiren.this,yapanXml,yapan);
        proje_yapan.setAdapter(adapter);
    }
}