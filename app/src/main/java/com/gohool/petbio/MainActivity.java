package com.gohool.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private ImageView ct;
    private ImageView dg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ct=(ImageView) findViewById(R.id.catid);
        dg=(ImageView) findViewById(R.id.dogid);

        ct.setOnClickListener(this);
        dg.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.catid:
//                Toast.makeText(MainActivity.this,"in cat",Toast.LENGTH_SHORT).show();
                Intent catintent=new Intent(MainActivity.this,BioActivity.class);
                catintent.putExtra("name","Meeko");
                catintent.putExtra("bio","Great cat! Loves apples and meow a lot ;) ");
                startActivity(catintent);
                break;
            case R.id.dogid:
//                Toast.makeText(MainActivity.this,"in dog",Toast.LENGTH_SHORT).show();
                Intent dogintent=new Intent(this,BioActivity.class);
                dogintent.putExtra("name","Jarvis");
                dogintent.putExtra("bio","Lovely dog! Loves pedigree and cuddles a lot :P ");
                startActivity(dogintent);
                break;
        }

    }
}