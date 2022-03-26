package com.example.incomeexpenseinput;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText sa,ti,bo,iv,sa1,ti1,bo1,iv1,sa2,ti2,bo2,iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        sa1=(EditText) findViewById(R.id.sa1);
        ti1=(EditText) findViewById(R.id.ti1);
       bo1=(EditText) findViewById(R.id.bo1);
       iv1=(EditText) findViewById(R.id.iv1);
        sa=(EditText) findViewById(R.id.sa);
        ti=(EditText) findViewById(R.id.ti);
        bo=(EditText) findViewById(R.id.bo);
        iv=(EditText) findViewById(R.id.iv);
        sa2=(EditText) findViewById(R.id.sa2);
        ti2=(EditText) findViewById(R.id.ti2);
        bo2=(EditText) findViewById(R.id.bo2);
        iv2=(EditText) findViewById(R.id.iv2);

    }

    public void Compute(View view) {

        float g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12;
        g1=Float.parseFloat(sa1.getText().toString());
        g2=Float.parseFloat(ti1.getText().toString());
        g3=Float.parseFloat(iv1.getText().toString());
        g4=Float.parseFloat(bo1.getText().toString());
        g5=Float.parseFloat(sa.getText().toString());
        g6=Float.parseFloat(ti.getText().toString());
        g7=Float.parseFloat(iv.getText().toString());
        g8=Float.parseFloat(bo.getText().toString());
        g9=Float.parseFloat(sa2.getText().toString());
        g10=Float.parseFloat(ti2.getText().toString());
        g11=Float.parseFloat(iv2.getText().toString());
        g12=Float.parseFloat(bo2.getText().toString());
        Intent n=new Intent(this,com.example.incomeexpenseinput.Results.class);
        n.putExtra("1",g1);
        n.putExtra("2",g2);
        n.putExtra("3",g3);
        n.putExtra("4",g4);
        n.putExtra("5",g5);
        n.putExtra("6",g6);
        n.putExtra("7",g7);
        n.putExtra("8",g8);
        n.putExtra("9",g9);
        n.putExtra("10",g10);
        n.putExtra("11",g11);
        n.putExtra("12",g12);
        startActivity(n);
    }
}