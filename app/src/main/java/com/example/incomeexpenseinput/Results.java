package com.example.incomeexpenseinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12;
float g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        tv1=(TextView) findViewById(R.id.tv1);
        tv2=(TextView) findViewById(R.id.tv2);
        tv3=(TextView) findViewById(R.id.tv3);
        tv4=(TextView) findViewById(R.id.tv4);
        tv5=(TextView) findViewById(R.id.tv5);
        tv6=(TextView) findViewById(R.id.tv6);
        tv7=(TextView) findViewById(R.id.tv7);
        tv8=(TextView) findViewById(R.id.tv8);
        tv9=(TextView) findViewById(R.id.tv9);
        tv10=(TextView) findViewById(R.id.tv10);
        tv11=(TextView) findViewById(R.id.tv11);
        tv12=(TextView) findViewById(R.id.tv12);

        Intent recInt=getIntent();

        tv1.setText(""+recInt.getFloatExtra("1",g1));
        tv2.setText(""+recInt.getFloatExtra("2",g2));
        tv3.setText(""+recInt.getFloatExtra("3",g3));
        tv4.setText(""+recInt.getFloatExtra("4",g4));
        tv5.setText(""+recInt.getFloatExtra("5",g5));
        tv6.setText(""+recInt.getFloatExtra("6",g6));
        tv7.setText(""+recInt.getFloatExtra("7",g7));
        tv8.setText(""+recInt.getFloatExtra("8",g8));
        tv9.setText(""+recInt.getFloatExtra("9",g9));
        tv10.setText(""+recInt.getFloatExtra("10",g10));
        tv11.setText(""+recInt.getFloatExtra("11",g11));
        tv12.setText(""+recInt.getFloatExtra("12",g12));


    }
}