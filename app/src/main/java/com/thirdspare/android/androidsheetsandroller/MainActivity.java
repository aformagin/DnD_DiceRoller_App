package com.thirdspare.android.androidsheetsandroller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends Activity {
    public String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Sheets";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File dir = new File(path);
        dir.mkdirs();
        if (dir.exists()){
            Toast.makeText(MainActivity.this, "File Created", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this, "No File Created", Toast.LENGTH_LONG).show();
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
    public void showRulesScreen (View view){
        Intent rulesIntent = new Intent(this, PDFActivity.class);
        startActivity(rulesIntent);
    }
    public void showAboutScreen (View view){
        Intent showAbout = new Intent(this, AboutActivity.class);
        startActivity(showAbout);
    }
}
