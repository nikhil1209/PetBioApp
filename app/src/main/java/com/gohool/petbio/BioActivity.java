package com.gohool.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {
    private ImageView img;
    private TextView name;
    private TextView bio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        img=(ImageView) findViewById(R.id.imageid);
        name=(TextView) findViewById(R.id.nameid);
        bio=(TextView) findViewById(R.id.bioid);

        extras=getIntent().getExtras();

        if(extras!=null){
            String nm=extras.getString("name");
            String bo=extras.getString("bio");
            setup(nm,bo);
        }

    }

    public void setup(String n,String b){
        if(n.equals("Meeko")){
            img.setImageDrawable(getResources().getDrawable(R.drawable.ki));
            name.setText(n);
            bio.setText(b);
        }
        if(n.equals("Jarvis")){
            img.setImageDrawable(getResources().getDrawable(R.drawable.goofy));
            name.setText(n);
            bio.setText(b);
        }
    }
}