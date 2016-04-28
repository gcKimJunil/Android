package com.example.administrator.homework02;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TimeTable extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);
    }
    public void onBackButtonClicked(View v){
        Toast.makeText(getApplicationContext(),"Clicked Back Button",Toast.LENGTH_LONG).show();
        finish();
    }
}
