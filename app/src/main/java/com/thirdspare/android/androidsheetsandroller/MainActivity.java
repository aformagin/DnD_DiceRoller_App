package com.thirdspare.android.androidsheetsandroller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File SheetsAndRoller = new File("SheetsAndRoller");

        if(!SheetsAndRoller.exists() && !SheetsAndRoller.isDirectory())
        {
            // create empty directory
            if (SheetsAndRoller.mkdirs())
            {
                Log.i("CreateDir","App dir created");
                Toast.makeText(MainActivity.this, "File Created", Toast.LENGTH_LONG).show();

            }
            else
            {
                Log.w("CreateDir","Unable to create app dir!");
                Toast.makeText(MainActivity.this, "No File Created", Toast.LENGTH_LONG).show();
            }
        }
        else
        {
            Log.i("CreateDir","App dir already exists");
            Toast.makeText(MainActivity.this, "ALready Created", Toast.LENGTH_LONG).show();
        }

    }

    public void testString(View view){

        TextView txtT = (TextView)findViewById(R.id.txtTitle);
        txtT.setText(Environment.getExternalStorageDirectory()+File.separator+"SheetsAndRoller");
    }
    public void showDiceScreen (View view){
        Intent diceIntent = new Intent(this, DiceActivity.class);
        startActivity(diceIntent);
    }

    public void showSheetsScreen (View view){
        Intent sheetIntent = new Intent(this, SheetsActivity.class);
        startActivity(sheetIntent);
    }
}
