package com.thirdspare.android.androidsheetsandroller;

//This is the dice rolling class for the dice layout. Here will be the rolling functions for each type of die

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
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


        final MediaPlayer diceSoundMP = MediaPlayer.create(this, R.raw.dicesound);
        Button btn4 = (Button) this.findViewById(R.id.btnD4);
        final TextView mod4 = (TextView) this.findViewById(R.id.txtD4M);
        final TextView txt4 = (TextView) this.findViewById(R.id.txtD4);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                diceSoundMP.start();
                roll(4, Integer.parseInt(mod4.getText().toString()), txt4);
            }
        });

        Button btn6 = (Button) this.findViewById(R.id.btnD6);
        final TextView mod6 = (TextView) this.findViewById(R.id.txtD6M);
        final TextView txt6 = (TextView) this.findViewById(R.id.txtD6);
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                diceSoundMP.start();
                roll(6, Integer.parseInt(mod6.getText().toString()), txt6);
            }

        });

        ImageButton btn4Add = (ImageButton) this.findViewById(R.id.btnUpD4);
        btn4Add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                modAdd(mod4);
            }
        });

        ImageButton btn4Sub = (ImageButton) this.findViewById(R.id.btnDownD4);
        btn4Sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                modSub(mod4);
            }
        });

    }


    public void roll (int sides, int mod, TextView text){
        int num = 0;
        String modValue;
        num = (int) (Math.random() * (sides) + 1);

        text.setText(Integer.toString(num + mod));
    }
    public void modAdd(TextView text){
        text.setText(String.valueOf(Integer.parseInt(text.getText().toString())+1));
    }
    public void modSub(TextView text){
        text.setText(String.valueOf(Integer.parseInt(text.getText().toString())-1));
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