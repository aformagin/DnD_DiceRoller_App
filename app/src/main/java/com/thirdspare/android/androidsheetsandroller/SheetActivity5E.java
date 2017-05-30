package com.thirdspare.android.androidsheetsandroller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SheetActivity5E extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheets_5e);

    }

    ////////////////////////////////////////////////////////////
    //Roll for strength ability
    ////////////////////////////////////////////////////////////
    public void rollSTR(View view) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int mod = 0;

        num1 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num2 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num3 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num4 = (int) (Math.random() * (6 - 1 + 1) + 1);


        if (num1 < num2 && num1 < num3 && num1 < num4) {
            num1 = 0;
        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
            num2 = 0;
        } else if (num3 < num2 && num1 < num4 && num3 < num1) {
            num3 = 0;
        }
        //if (num4 < num2 && num4 < num3 && num4 < num1)
        else {
            num4 = 0;
        }

        int totalResult = num1 + num2 + num3 + num4;

        if (totalResult >= 18) {
            mod = 4;
        } else if (totalResult >= 16) {
            mod = 3;
        } else if (totalResult >= 14) {
            mod = 2;
        } else if (totalResult >= 12) {
            mod = 1;
        } else if (totalResult >= 10) {
            mod = 0;
        } else if (totalResult >= 8) {
            mod = -1;
        } else if (totalResult >= 6) {
            mod = -2;
        }
        // if (totalResult >= 4)
        else {
            mod = -3;
        }


        TextView score = (TextView) findViewById(R.id.txtSTRScoreVAL);
        TextView modifier = (TextView) (findViewById(R.id.txtSTRModVAL));
        String scoreString = score.getText().toString();

        score.setText(Integer.toString(totalResult));
        modifier.setText(Integer.toString(mod));


    }
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////
    //Roll for DEX ability
    ////////////////////////////////////////////////////////////
    public void rollDEX(View view) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int mod = 0;

        num1 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num2 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num3 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num4 = (int) (Math.random() * (6 - 1 + 1) + 1);


        if (num1 < num2 && num1 < num3 && num1 < num4) {
            num1 = 0;
        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
            num2 = 0;
        } else if (num3 < num2 && num1 < num4 && num3 < num1) {
            num3 = 0;
        }
        //if (num4 < num2 && num4 < num3 && num4 < num1)
        else {
            num4 = 0;
        }

        int totalResult = num1 + num2 + num3 + num4;

        if (totalResult >= 18) {
            mod = 4;
        } else if (totalResult >= 16) {
            mod = 3;
        } else if (totalResult >= 14) {
            mod = 2;
        } else if (totalResult >= 12) {
            mod = 1;
        } else if (totalResult >= 10) {
            mod = 0;
        } else if (totalResult >= 8) {
            mod = -1;
        } else if (totalResult >= 6) {
            mod = -2;
        }
        // if (totalResult >= 4)
        else {
            mod = -3;
        }


        TextView score = (TextView) findViewById(R.id.txtDEXScoreVAL);
        TextView modifier = (TextView) (findViewById(R.id.txtDEXModVAL));
        String scoreString = score.getText().toString();

        score.setText(Integer.toString(totalResult));
        modifier.setText(Integer.toString(mod));


    }
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////
    //Roll for CON ability
    ////////////////////////////////////////////////////////////
    public void rollCON(View view) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int mod = 0;

        num1 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num2 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num3 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num4 = (int) (Math.random() * (6 - 1 + 1) + 1);


        if (num1 < num2 && num1 < num3 && num1 < num4) {
            num1 = 0;
        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
            num2 = 0;
        } else if (num3 < num2 && num1 < num4 && num3 < num1) {
            num3 = 0;
        }
        //if (num4 < num2 && num4 < num3 && num4 < num1)
        else {
            num4 = 0;
        }

        int totalResult = num1 + num2 + num3 + num4;

        if (totalResult >= 18) {
            mod = 4;
        } else if (totalResult >= 16) {
            mod = 3;
        } else if (totalResult >= 14) {
            mod = 2;
        } else if (totalResult >= 12) {
            mod = 1;
        } else if (totalResult >= 10) {
            mod = 0;
        } else if (totalResult >= 8) {
            mod = -1;
        } else if (totalResult >= 6) {
            mod = -2;
        }
        // if (totalResult >= 4)
        else {
            mod = -3;
        }


        TextView score = (TextView) findViewById(R.id.txtCONScoreVAL);
        TextView modifier = (TextView) (findViewById(R.id.txtCONModVAL));
        String scoreString = score.getText().toString();

        score.setText(Integer.toString(totalResult));
        modifier.setText(Integer.toString(mod));


    }
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////
    //Roll for INT ability
    ////////////////////////////////////////////////////////////
    public void rollINT(View view) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int mod = 0;

        num1 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num2 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num3 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num4 = (int) (Math.random() * (6 - 1 + 1) + 1);


        if (num1 < num2 && num1 < num3 && num1 < num4) {
            num1 = 0;
        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
            num2 = 0;
        } else if (num3 < num2 && num1 < num4 && num3 < num1) {
            num3 = 0;
        }
        //if (num4 < num2 && num4 < num3 && num4 < num1)
        else {
            num4 = 0;
        }

        int totalResult = num1 + num2 + num3 + num4;

        if (totalResult >= 18) {
            mod = 4;
        } else if (totalResult >= 16) {
            mod = 3;
        } else if (totalResult >= 14) {
            mod = 2;
        } else if (totalResult >= 12) {
            mod = 1;
        } else if (totalResult >= 10) {
            mod = 0;
        } else if (totalResult >= 8) {
            mod = -1;
        } else if (totalResult >= 6) {
            mod = -2;
        }
        // if (totalResult >= 4)
        else {
            mod = -3;
        }


        TextView score = (TextView) findViewById(R.id.txtINTScoreVAL);
        TextView modifier = (TextView) (findViewById(R.id.txtINTModVAL));
        String scoreString = score.getText().toString();

        score.setText(Integer.toString(totalResult));
        modifier.setText(Integer.toString(mod));


    }
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////
    //Roll for WIS ability
    ////////////////////////////////////////////////////////////
    public void rollWIS(View view) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int mod = 0;

        num1 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num2 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num3 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num4 = (int) (Math.random() * (6 - 1 + 1) + 1);


        if (num1 < num2 && num1 < num3 && num1 < num4) {
            num1 = 0;
        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
            num2 = 0;
        } else if (num3 < num2 && num1 < num4 && num3 < num1) {
            num3 = 0;
        }
        //if (num4 < num2 && num4 < num3 && num4 < num1)
        else {
            num4 = 0;
        }

        int totalResult = num1 + num2 + num3 + num4;

        if (totalResult >= 18) {
            mod = 4;
        } else if (totalResult >= 16) {
            mod = 3;
        } else if (totalResult >= 14) {
            mod = 2;
        } else if (totalResult >= 12) {
            mod = 1;
        } else if (totalResult >= 10) {
            mod = 0;
        } else if (totalResult >= 8) {
            mod = -1;
        } else if (totalResult >= 6) {
            mod = -2;
        }
        // if (totalResult >= 4)
        else {
            mod = -3;
        }


        TextView score = (TextView) findViewById(R.id.txtWISScoreVAL);
        TextView modifier = (TextView) (findViewById(R.id.txtWISModVAL));
        String scoreString = score.getText().toString();

        score.setText(Integer.toString(totalResult));
        modifier.setText(Integer.toString(mod));


    }
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////
    //Roll for CHA ability
    ////////////////////////////////////////////////////////////
    public void rollCHA(View view) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int mod = 0;

        num1 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num2 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num3 = (int) (Math.random() * (6 - 1 + 1) + 1);
        num4 = (int) (Math.random() * (6 - 1 + 1) + 1);


        if (num1 < num2 && num1 < num3 && num1 < num4) {
            num1 = 0;
        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
            num2 = 0;
        } else if (num3 < num2 && num1 < num4 && num3 < num1) {
            num3 = 0;
        }
        //if (num4 < num2 && num4 < num3 && num4 < num1)
        else {
            num4 = 0;
        }

        int totalResult = num1 + num2 + num3 + num4;

        if (totalResult >= 18) {
            mod = 4;
        } else if (totalResult >= 16) {
            mod = 3;
        } else if (totalResult >= 14) {
            mod = 2;
        } else if (totalResult >= 12) {
            mod = 1;
        } else if (totalResult >= 10) {
            mod = 0;
        } else if (totalResult >= 8) {
            mod = -1;
        } else if (totalResult >= 6) {
            mod = -2;
        }
        // if (totalResult >= 4)
        else {
            mod = -3;
        }


        TextView score = (TextView) findViewById(R.id.txtCHAScoreVAL);
        TextView modifier = (TextView) (findViewById(R.id.txtCHAModVAL));
        String scoreString = score.getText().toString();

        score.setText(Integer.toString(totalResult));
        modifier.setText(Integer.toString(mod));


    }
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////


}
