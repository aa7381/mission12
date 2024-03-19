package com.example.mission12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn, btn2;
    ImageView iV, iV2, iV3, iV4;
    EditText eT;

    int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        iV = (ImageView) findViewById(R.id.iV);
        iV2 = (ImageView) findViewById(R.id.iV2);
        iV3 = (ImageView) findViewById(R.id.iV3);
        iV4 = (ImageView) findViewById(R.id.iV4);
        eT = (EditText) findViewById(R.id.eT);
    }

    public void clicked(View view) {

        if (eT.getText().toString().isEmpty()) {
            eT.setText("");
            
        }
    }
}



