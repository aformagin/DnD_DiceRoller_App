package com.thirdspare.android.androidsheetsandroller;

//This is the dice rolling class for the dice layout. Here will be the rolling functions for each type of die

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Types of die
//D4
//D6
//D8
//D10
//D12
//D20
//%
public class DiceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

    }

    public void rollD4(View view) {
        int num = 0;

        num = (int) (Math.random() * (4 - 1 + 1) + 1);

        TextView dice = (TextView) (findViewById(R.id.txtD4));
        dice.setText(Integer.toString(num));
        // return num;

    }

    //Classic 6 sided die
    public void rollD6(View view) {

        int num = 0;
        String modValue;

        //Randomly generates a number ot be placed in the dice result field
        num = (int) (Math.random() * (6 - 1 + 1) + 1);

        //Gets the modifier so it can be added to the num
        //EditText diceMod = (EditText) findViewById(R.id.edtD6);
        TextView dice = (TextView) (findViewById(R.id.txtD6));

        //modValue = diceMod.getText().toString();
       /* int mod = Integer.parseInt(modValue);
        if (diceMod.getText() == null){
            diceMod.setText("0");
        }*/





        dice.setText(Integer.toString(num));
    }

    public void rollD8(View view) {
        int num = 0;

        num = (int) (Math.random() * (8 - 1 + 1) + 1);

        TextView dice = (TextView) (findViewById(R.id.txtD8));
        dice.setText(Integer.toString(num));
    }

    public void rollD10(View view) {
        int num = 0;

        num = (int) (Math.random() * (10 - 1 + 1) + 1);

        TextView dice = (TextView) (findViewById(R.id.txtD10));
        dice.setText(Integer.toString(num));
    }

    public void rollD12(View view) {
        int num = 0;

        num = (int) (Math.random() * (12 - 1 + 1) + 1);

        TextView dice = (TextView) (findViewById(R.id.txtD12));
        dice.setText(Integer.toString(num));
    }

    public void rollD20(View view) {
        int num = 0;

        num = (int) (Math.random() * (20 - 1 + 1) + 1);

        TextView dice = (TextView) (findViewById(R.id.txtD20));
        dice.setText(Integer.toString(num));
    }
}