package com.hussein.ezkerelmuslem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Eklenen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eklenen);
        TextView eklenen_txt=(TextView)findViewById(R.id.eklenen_txt);
        Bundle b=getIntent().getExtras();
        String z=b.getString("zikir");
        eklenen_txt.setText(z );

    }
}