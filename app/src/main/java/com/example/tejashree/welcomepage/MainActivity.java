package com.example.tejashree.welcomepage;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo=(TextView)findViewById(R.id.logo);
        Typeface t=Typeface.createFromAsset(getAssets(),"fa-solid-900.ttf");
        logo.setTypeface(t);

    }
}
