package com.example.mission12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class creditsactivity extends AppCompatActivity {
    TextView tV;
    double sum =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditsactivity);
        tV.findViewById(R.id.tV);


        Intent gi = getIntent();
        sum = gi.getDoubleExtra("n",-1);
        tV.setText(String.valueOf(sum));

    }
        public void go_back(View view)
        {
            finish();
        }
    }


