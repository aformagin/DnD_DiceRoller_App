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

    ////////////////////////////////////////////////////////////////////////////
    //FOUR SIDED DIE
    ////////////////////////////////////////////////////////////////////////////
    public void rollD4(View view) {
        int num = 0;
        String modValue;
        num = (int) (Math.random() * (4 - 1 + 1) + 1);


        //Gets the modifier so it can be added to the num
        TextView diceMod = (TextView) findViewById(R.id.txtD4M);
        modValue = diceMod.getText().toString();
        int mod = Integer.parseInt(modValue);
        if (diceMod.getText() == null) {
            diceMod.setText("0");
        }


        TextView dice = (TextView) (findViewById(R.id.txtD4));
        dice.setText(Integer.toString(num + mod));

    }

    public void modAddD4(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtD4M);
        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
        num++;
        diceMod.setText(Integer.toString(num));
    }

    public void modSubD4(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtD4M);
        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
        num--;
        diceMod.setText(Integer.toString(num));
    }

    ////////////////////////////////////////////////////////////////////////////
    //SIX SIDED DIE
    ////////////////////////////////////////////////////////////////////////////
    //Classic 6 sided die
    public void rollD6(View view) {

        int num = 0;
        String modValue;

        //Randomly generates a number ot be placed in the dice result field
        num = (int) (Math.random() * (6 - 1 + 1) + 1);

        //Gets the modifier so it can be added to the num
        TextView diceMod = (TextView) findViewById(R.id.txtD6M);
        TextView dice = (TextView) (findViewById(R.id.txtD6));
        modValue = diceMod.getText().toString();
        int mod = Integer.parseInt(modValue);
        if (diceMod.getText() == null) {
            diceMod.setText("0");
        }


        dice.setText(Integer.toString(num + mod));
    }


    public void modAddD6(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtD6M);
        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
        num++;
        diceMod.setText(Integer.toString(num));
    }

    public void modSubD6(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtD6M);
        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
        num--;
        diceMod.setText(Integer.toString(num));
    }

    ////////////////////////////////////////////////////////////////////////////
    //EIGHT SIDED DIE
    ////////////////////////////////////////////////////////////////////////////
    public void rollD8(View view) {
        int num = 0;
        String modValue;
        num = (int) (Math.random() * (8 - 1 + 1) + 1);


        //Gets the modifier so it can be added to the num
        TextView diceMod = (TextView) findViewById(R.id.txtD8M);
        modValue = diceMod.getText().toString();
        int mod = Integer.parseInt(modValue);
        if (diceMod.getText() == null) {
            diceMod.setText("0");
        }

        TextView dice = (TextView) (findViewById(R.id.txtD8));
        dice.setText(Integer.toString(num + mod));
    }

    public void modAddD8(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtD8M);
        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
        num++;
        diceMod.setText(Integer.toString(num));
    }

    public void modSubD8(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtD8M);
        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
        num--;
        diceMod.setText(Integer.toString(num));
    }

    ////////////////////////////////////////////////////////////////////////////
    //TEN SIDED DIE
    ////////////////////////////////////////////////////////////////////////////
    public void rollD10(View view) {
        int num = 0;
        String modValue;

        num = (int) (Math.random() * (10 - 1 + 1) + 1);


        //Gets the modifier so it can be added to the num
        TextView diceMod = (TextView) findViewById(R.id.txtD10M);
        modValue = diceMod.getText().toString();
        int mod = Integer.parseInt(modValue);
        if (diceMod.getText() == null) {
            diceMod.setText("0");
        }

        TextView dice = (TextView) (findViewById(R.id.txtD10));
        dice.setText(Integer.toString(num + mod));
    }

    public void modAddD10(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtD10M);
        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
        num++;
        diceMod.setText(Integer.toString(num));
    }

    public void modSubD10(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtD10M);
        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
        num--;
        diceMod.setText(Integer.toString(num));
    }

    ////////////////////////////////////////////////////////////////////////////
    //TWELVE SIDED DIE
    ////////////////////////////////////////////////////////////////////////////
    public void rollD12(View view) {
        int num = 0;
        String modValue;

        num = (int) (Math.random() * (12 - 1 + 1) + 1);


        //Gets the modifier so it can be added to the num
        TextView diceMod = (TextView) findViewById(R.id.txtD12M);
        modValue = diceMod.getText().toString();
        int mod = Integer.parseInt(modValue);
        if (diceMod.getText() == null) {
            diceMod.setText("0");
        }

        TextView dice = (TextView) (findViewById(R.id.txtD12));
        dice.setText(Integer.toString(num + mod));
    }

    public void modAddD12(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtD12M);
        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
        num++;
        diceMod.setText(Integer.toString(num));
    }

    public void modSubD12(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtD12M);
        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
        num--;
        diceMod.setText(Integer.toString(num));
    }

    ////////////////////////////////////////////////////////////////////////////
    //TWENTY SIDED DIE
    ////////////////////////////////////////////////////////////////////////////
    public void rollD20(View view) {
        int num = 0;
        String modValue;

        num = (int) (Math.random() * (20 - 1 + 1) + 1);

        //Gets the modifier so it can be added to the num
        TextView diceMod = (TextView) findViewById(R.id.txtD20M);
        modValue = diceMod.getText().toString();
        int mod = Integer.parseInt(modValue);
        if (diceMod.getText() == null) {
            diceMod.setText("0");
        }

        TextView dice = (TextView) (findViewById(R.id.txtD20));
        dice.setText(Integer.toString(num + mod));
    }

    public void modAddD20(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtD20M);


        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
            num++;
        diceMod.setText(Integer.toString(num));
    }

    public void modSubD20(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtD20M);
        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
        num--;
        diceMod.setText(Integer.toString(num));
    }
    ////////////////////////////////////////////////////////////////////////////
    //PERCENTILE SIDED DIE
    ////////////////////////////////////////////////////////////////////////////
/*
    public void modAddPercent(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtDPercentM);
        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
        num++;
        diceMod.setText(Integer.toString(num));
    }

    public void modSubPercent(View view) {
        String modValue;
        TextView diceMod = (TextView) findViewById(R.id.txtDPercentM);
        modValue = diceMod.getText().toString();
        int num = Integer.parseInt(modValue);
        num--;
        diceMod.setText(Integer.toString(num));
    }*/

    /////////////////////////////////////////////////////////////////
    //Reset Function
    /////////////////////////////////////////////////////////////////
    public void diceReset (View view){
        ((TextView)findViewById(R.id.txtD4M)).setText("0");
        ((TextView)findViewById(R.id.txtD4)).setText("0");
        ((TextView)findViewById(R.id.txtD6M)).setText("0");
        ((TextView)findViewById(R.id.txtD6)).setText("0");
        ((TextView)findViewById(R.id.txtD8M)).setText("0");
        ((TextView)findViewById(R.id.txtD8)).setText("0");
        ((TextView)findViewById(R.id.txtD10M)).setText("0");
        ((TextView)findViewById(R.id.txtD10)).setText("0");
        ((TextView)findViewById(R.id.txtD12M)).setText("0");
        ((TextView)findViewById(R.id.txtD12)).setText("0");
        ((TextView)findViewById(R.id.txtD20M)).setText("0");
        ((TextView)findViewById(R.id.txtD20)).setText("0");
       // ((TextView)findViewById(R.id.txtD4M)).setText("0");
       // ((TextView)findViewById(R.id.txtD4)).setText("0");
    }
}