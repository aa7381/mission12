package com.example.mission12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn, btn2, btn3;
    ImageView iV, iV2, iV3, iV4;
    EditText eT;
    double num =0 , sum = 0 ;


    int count = 0 ;
    boolean pluspress = false ;

    boolean minuspress = false ;

    boolean kefelpress = false ;

    boolean helokpress = false ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        iV = (ImageView) findViewById(R.id.iV);
        iV2 = (ImageView) findViewById(R.id.iV2);
        iV3 = (ImageView) findViewById(R.id.iV3);
        iV4 = (ImageView) findViewById(R.id.iV4);
        eT = (EditText) findViewById(R.id.eT);




    }

    // פלוס


        public void clicked (View view)
        {
            pluspress = true;

            String textValue = eT.getText().toString();
            count++;
            num = Double.parseDouble(textValue);

            if (count>=2)
            {
                sum+=num;
                eT.setText(String.valueOf(sum));
                count = 0 ;
            } else if (!eT.getText().toString().isEmpty()) {
                eT.setText("");
                sum=num;
            }
        }

    //מינוס
    public void clicked2(View view)
    {
        minuspress = true;

        String textValue2 = eT.getText().toString();
        count++;
        num = Double.parseDouble(textValue2);

        if (count>=2)
        {
            sum-=num;
            eT.setText(String.valueOf(sum));
            count = 0 ;
        } else if (!eT.getText().toString().isEmpty()) {
            eT.setText("");
            sum=num;
        }
    }


    //כפל
    public void clicked3(View view)
    {
        kefelpress = true;

        String textValue3 = eT.getText().toString();
        count++;
        num = Double.parseDouble(textValue3);

        if (count>=2)
        {
            sum*=num;
            eT.setText(String.valueOf(sum));
            count = 0 ;
        } else if (!eT.getText().toString().isEmpty()) {
            eT.setText("");
            sum=num;
        }
    }

    //חילוק

    public void clicked4(View view)
    {
        helokpress = true;

        String textValue4 = eT.getText().toString();
        count++;
        num = Double.parseDouble(textValue4);

        if (count>=2)
        {
            sum/=num;
            eT.setText(String.valueOf(sum));
            count = 0 ;
        } else if (!eT.getText().toString().isEmpty()) {
            eT.setText("");
            sum=num;
        }
    }

    //שווה
    public void equal(View view)
    {
        if(pluspress == true)
        {
            count = 0 ;
            pluspress = false;
            String textValue = eT.getText().toString();
            num = Double.parseDouble(textValue);
            sum+=num;
        }
        if(minuspress == true)
        {
            count = 0 ;
            minuspress = false;
            String textValue2 = eT.getText().toString();
            num = Double.parseDouble(textValue2);
            sum-=num;
        }
        if(kefelpress == true)
        {
            count = 0 ;
            kefelpress = false;
            String textValue3 = eT.getText().toString();
            num = Double.parseDouble(textValue3);
            sum*=num;
        }
        if(helokpress == true)
        {
            count = 0 ;
            helokpress = false;
            String textValue4 = eT.getText().toString();
            num = Double.parseDouble(textValue4);
            sum/=num;
        }
        eT.setText(String.valueOf(sum));

        //איפוס
    }
    public void restart(View view)
    {
        sum = 0 ;
        num = 0 ;
        eT.setText("");
    }

    //credits
    public void go(View view) {
        Intent si = new Intent(this,creditsactivity.class);
        si.putExtra("n", sum);
        startActivity(si);
    }

}














