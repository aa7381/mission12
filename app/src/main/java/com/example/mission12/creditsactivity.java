package com.example.mission12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class creditsactivity extends AppCompatActivity {
    TextView tV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditsactivity);
        tV.findViewById(R.id.tV);


        Intent gi = getIntent();
        double sum = gi.getDoubleExtra("n",1);
        tV.setText(String.valueOf(sum));
        finish();
    }

    }


