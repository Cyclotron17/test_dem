package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView zero,one,two,three,four,five,six,seven,eight,nine,add,div,sub,mul,back,point,equal,clear;
    TextView operation ,result;
    String input="",output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      definehooks();
        zero = findViewById(R.id.zero);
        operation= findViewById(R.id.operation);


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation.setText("0.0");
            }
        });

    }
    private void definehooks(){
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        add = findViewById(R.id.add);
         div= findViewById(R.id.modulus);
        point = findViewById(R.id.dot);
        back = findViewById(R.id.back);
        equal = findViewById(R.id.equals);
        clear = findViewById(R.id.AC);
        operation = findViewById(R.id.operation);
        result = findViewById(R.id.result);



    }
}