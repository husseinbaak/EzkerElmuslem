package com.hussein.ezkerelmuslem;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.hussein.ezkerelmuslem.Contact;
import com.hussein.ezkerelmuslem.EvdenCikma;
import com.hussein.ezkerelmuslem.R;
import com.hussein.ezkerelmuslem.Yagmur;
import com.hussein.ezkerelmuslem.ZikirAdd;
import com.hussein.ezkerelmuslem.aksam;
import com.hussein.ezkerelmuslem.namaz;
import com.hussein.ezkerelmuslem.sabah;
import com.hussein.ezkerelmuslem.yolcu;

import org.jetbrains.annotations.NotNull;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("أذكار");
        setSupportActionBar(toolbar);
        ImageView i_namaz=findViewById(R.id.namaz);
        Button b_namaz=(Button) findViewById(R.id.namaz_bt);
        i_namaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), namaz.class  );
                startActivity(intent);
            }
        });

        b_namaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),namaz.class);
                startActivity(intent);
            }
        });

        ImageView i_sabah=findViewById(R.id.img_sabah);
        Button b_sabah=findViewById(R.id.b_sabah);
        i_sabah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), sabah.class);
                startActivity(intent);
            }
        });
        b_sabah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),sabah.class);
                startActivity(intent);
            }
        });
        ImageView i_aksam=findViewById(R.id.img_aksam);
        Button b_aksam=findViewById(R.id.br_aksam);
        i_aksam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), aksam.class    );
                startActivity(intent);
            }
        });
        b_aksam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),aksam.class    );
                startActivity(intent);
            }
        });

        ImageView i_yol=findViewById(R.id.ımg_yol);
        Button b_yol=findViewById(R.id.bt_yol);
        i_yol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), yolcu.class    );
                startActivity(intent);
            }
        });
        b_yol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),yolcu.class    );
                startActivity(intent);
            }
        });

        ImageView i_evden=findViewById(R.id.img_ev);
        Button b_evden=findViewById(R.id.bt_ev);
        i_evden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), EvdenCikma.class    );
                startActivity(intent);
            }
        });
        b_evden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),EvdenCikma.class    );
                startActivity(intent);
            }
        });


        ImageView i_yag=findViewById(R.id.img_yag);
        Button b_yag=findViewById(R.id.bt_yag);
        i_yag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Yagmur.class    );
                startActivity(intent);
            }
        });
        b_yag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Yagmur.class);
                startActivity(intent);
            }
        });





        Button b_add=findViewById(R.id.bt_add);
        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ZikirAdd.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.menu_home){

        }

        if(id==R.id.menu_contact){
            Intent intent=new Intent(getApplicationContext(), Contact.class);
            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }



}