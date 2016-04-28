package com.example.administrator.homework02;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //전역변수 선언
    EditText ps1, ps2, ps3, ps4;
    String s = "0000";
    Button btn;
    //Context context = getApplicationContext();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ps1 = (EditText)findViewById(R.id.password1);
        ps2 = (EditText)findViewById(R.id.password2);
        ps3 = (EditText)findViewById(R.id.password3);
        ps4 = (EditText)findViewById(R.id.password4);

        //btn = (Button)findViewById(R.id.login);
    }

    public void loginButtonClicked(View v)
    {
        s = ps1.getText().toString();
        s = s+ps2.getText().toString();
        s = s+ps3.getText().toString();
        s = s+ps4.getText().toString();
        if(s.equals("0000") == true){
            Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(getApplicationContext(),ListActivity.class);
            startActivity(myIntent);
        }
        else{
            Toast.makeText(getApplicationContext(), "Not Valid", Toast.LENGTH_SHORT).show();
        }

    }
}
