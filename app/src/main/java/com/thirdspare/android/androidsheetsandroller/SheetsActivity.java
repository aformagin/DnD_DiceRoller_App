package com.thirdspare.android.androidsheetsandroller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Austin on 2017-05-30.
 */

public class SheetsActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheets);

    }

    public void show5E (View view){
        Intent sheet5EIntent = new Intent(this, SheetActivity5E.class);
        startActivity(sheet5EIntent);
    }
}
