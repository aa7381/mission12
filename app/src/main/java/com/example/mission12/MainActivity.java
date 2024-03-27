package com.example.mission12;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Handler handler;
    private int delayMillis = 1000; // Delay in milliseconds
    Button btn, btn2, btn3;
    ImageView iV, iV2, iV3, iV4;
    EditText eT;
    double num =0 , sum = 0,numlast=0;

    int count = 0 ;
    boolean pluspress = false ;

    boolean minuspress = false ;

    boolean kefelpress = false ;

    boolean helokpress = false ;

    boolean press = false ;






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

        handler = new Handler();

       // eT.setHint(String.valueOf(numlast));



    }









    public  void notpressequal()
    {

        if(pluspress==true)
        {

            pluspress = false;
            String textValue = eT.getText().toString();
            num = Double.parseDouble(textValue);
            numlast+=num;
            eT.setText("");
            //eT.setText(String.valueOf(numlast));
            eT.setHint(String.valueOf(numlast));
            count = 0 ;


        }
        else if (minuspress == true)
        {

            minuspress = false;
            String textValue = eT.getText().toString();
            num = Double.parseDouble(textValue);
            numlast-=num;
            eT.setText("");
            //eT.setText(String.valueOf(numlast));
            eT.setHint(String.valueOf(numlast));
            count = 0 ;
        }else if(kefelpress == true)
        {
        //    sum*=num;
          //  eT.setText(String.valueOf(sum));
            kefelpress = false;
        } else if (helokpress ==true) {
         //   sum/=num;
        //   eT.setText(String.valueOf(sum));
            helokpress = false;
        }
    }


    // פלוס


        public void clicked (View view)
        {

            pluspress = true;

            count++;


            if (count>=2)
            {

                notpressequal();

            }

            else
            {



                if (eT.getText().toString().isEmpty())
                {
                    String textValue1 = eT.getHint().toString();
                    numlast = Double.parseDouble(textValue1);

                }
                else
                {
                    String textValue = eT.getText().toString();
                    num = Double.parseDouble(textValue);
                    numlast+=num;
                    eT.setText("");
                    eT.setHint(String.valueOf(numlast));
                }


                   // numlast=num;
                //eT.setHint(String.valueOf(numlast));
                //eT.setText(String.valueOf(numlast));




                }


          //  }
        }

    //מינוס
    public void clicked2(View view)
    {
        minuspress = true;

        count++;


        if (count>=2)
        {

            notpressequal();
        }

        else

        {
            String textValue = eT.getText().toString();
            num = Double.parseDouble(textValue);
            numlast-=num;
            eT.setText("");
        }


        // numlast=num;
        eT.setHint(String.valueOf(numlast));
    }


    //כפל
    public void clicked3(View view)
    {
        kefelpress = true;

        count++;


        if (count>=2)
        {

            // notpressequal( pluspress , minuspress , kefelpress, helokpress, sum ,  num, eT);
            // eT.setText(String.valueOf(sum));
            eT.setText("");
            sum=sum*num;
            //eT.setText(String.valueOf(sum));
            eT.setHint(String.valueOf(sum));
            count = 0 ;
        }

        else
        {
            String textValue = eT.getText().toString();
            num = Double.parseDouble(textValue);

            //if (!eT.getText().toString().isEmpty())
            //{

            eT.setText("");
            sum*=num;
            eT.setHint(String.valueOf(sum));
        }
    }

    //שווה
    public void equal(View view)
    {
        if(pluspress == true)
        {

            notpressequal();
           // count = 0 ;

           // String textValue = eT.getText().toString();
           // num = Double.parseDouble(textValue);
           // numlast+=num;
        }
        if(minuspress == true)
        {

            notpressequal();
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
        //eT.setText(String.valueOf(numlast));
        //eT.setHint(String.valueOf(numlast));


        //איפוס
    }

    public void clicked4(View view)
    {
        helokpress = true;

        count++;


        if (count>=2)
        {

            // notpressequal( pluspress , minuspress , kefelpress, helokpress, sum ,  num, eT);
            // eT.setText(String.valueOf(sum));
            eT.setText("");
            sum=sum/num;
            eT.setText(" ");
            eT.setHint(String.valueOf(sum));
            count = 0 ;
        }

        else
        {
            String textValue = eT.getText().toString();
            num = Double.parseDouble(textValue);

            //if (!eT.getText().toString().isEmpty())
            //{

            eT.setText("");
            sum/=num;
            eT.setHint(String.valueOf(sum));
        }
    }
    public void restart(View view)
    {
        sum = 0 ;
        num = 0 ;
        eT.setText("");
        eT.setHint("");
    }

    //credits
    public void go(View view) {
        Intent si = new Intent(this,creditsactivity.class);
        si.putExtra("n", sum);
        startActivity(si);
    }

}














