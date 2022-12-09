package com.hussein.ezkerelmuslem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ZikirAdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zikir_add);
        Button zikir_bt=(Button) findViewById(R.id.bt_zikirEkle);
        zikir_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtZikir=(EditText)findViewById(R.id.edit_txt);
                Intent intent=new Intent(getApplicationContext(),Eklenen.class);
                Bundle ba=new Bundle();
                ba.putString("zikir",txtZikir.getText().toString());
                intent.putExtras(ba);
                startActivity(intent);

                startActivity(intent);
            }
        });
    }
}