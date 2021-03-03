package com.example.lopena_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.displaytext);
        String firstname = "Kurt";
        String lastname = "Lopena";
        char middleInitial = 'S';
        int myAge =  18;
        double myMoney= 420;
        float myGrade= 87;

        //String.valueof(myMoney);
        display.setText("My name is "+firstname+" "+middleInitial+" "+lastname+"\nand my age is "+myAge+".\nI want my grade in TVL3 to be "+myGrade);

    }
}