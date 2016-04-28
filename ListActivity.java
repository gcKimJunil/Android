package com.example.administrator.homework02;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ListActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
    //Link
    public void onButton1Clicked(View v){
        Intent myIntent = new Intent(getApplicationContext(),TimeTable.class);
        startActivity(myIntent);
    }
    public void onButton2Clicked(View v){
        Intent myIntent = new Intent(getApplicationContext(),TipCounter.class);
        startActivity(myIntent);
    }
    public void onButton3Clicked(View v){
        Intent myIntent = new Intent(getApplicationContext(),Calculator.class);
        startActivity(myIntent);
    }

}
