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
        
        Button btn8 = (Button) this.findViewById(R.id.btnD8);
        final TextView mod8 = (TextView) this.findViewById(R.id.txtD8M);
        final TextView txt8 = (TextView) this.findViewById(R.id.txtD8);
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                diceSoundMP.start();
                roll(8, Integer.parseInt(mod8.getText().toString()), txt8);
            }

        });
        
        Button btn10 = (Button) this.findViewById(R.id.btnD10);
        final TextView mod10 = (TextView) this.findViewById(R.id.txtD10M);
        final TextView txt10 = (TextView) this.findViewById(R.id.txtD10);
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                diceSoundMP.start();
                roll(10, Integer.parseInt(mod10.getText().toString()), txt10);
            }

        });
        Button btn12 = (Button) this.findViewById(R.id.btnD12);
        final TextView mod12 = (TextView) this.findViewById(R.id.txtD12M);
        final TextView txt12 = (TextView) this.findViewById(R.id.txtD12);
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                diceSoundMP.start();
                roll(12, Integer.parseInt(mod12.getText().toString()), txt12);
            }

        });
        Button btn20 = (Button) this.findViewById(R.id.btnD20);
        final TextView mod20 = (TextView) this.findViewById(R.id.txtD20M);
        final TextView txt20 = (TextView) this.findViewById(R.id.txtD20);
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                diceSoundMP.start();
                roll(20, Integer.parseInt(mod20.getText().toString()), txt20);
            }

        });
        /////////////////////////////////////////////////////////////////////
        //Mods(+/-)
        /////////////////////////////////////////////////////////////////////
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
        ImageButton btn6Add = (ImageButton) this.findViewById(R.id.btnUpD6);
        btn6Add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                modAdd(mod6);
            }
        });

        ImageButton btn6Sub = (ImageButton) this.findViewById(R.id.btnDownD6);
        btn6Sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                modSub(mod6);
            }
        });
        
        ImageButton btn8Add = (ImageButton) this.findViewById(R.id.btnUpD8);
        btn8Add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                modAdd(mod8);
            }
        });

        ImageButton btn8Sub = (ImageButton) this.findViewById(R.id.btnDownD8);
        btn8Sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                modSub(mod8);
            }
        });
        ImageButton btn10Add = (ImageButton) this.findViewById(R.id.btnUpD10);
        btn10Add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                modAdd(mod10);
            }
        });

        ImageButton btn10Sub = (ImageButton) this.findViewById(R.id.btnDownD10);
        btn10Sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                modSub(mod10);
            }
        });
                ImageButton btn12Add = (ImageButton) this.findViewById(R.id.btnUpD12);
        btn12Add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                modAdd(mod12);
            }
        });

        ImageButton btn12Sub = (ImageButton) this.findViewById(R.id.btnDownD12);
        btn12Sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                modSub(mod12);
            }
        });
                ImageButton btn20Add = (ImageButton) this.findViewById(R.id.btnUpD20);
        btn20Add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                modAdd(mod20);
            }
        });

        ImageButton btn20Sub = (ImageButton) this.findViewById(R.id.btnDownD20);
        btn20Sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                modSub(mod20);
            }
        });
    }

    //Methods
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
