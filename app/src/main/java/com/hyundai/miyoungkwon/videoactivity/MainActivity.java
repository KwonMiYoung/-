package com.hyundai.miyoungkwon.videoactivity;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void onClick1(View view)
    {
        Intent intent1=new Intent(this,VideoActivity.class);
        startActivity(intent1);
    }

    public void onClick2(View view)
    {
        Intent intent2=new Intent(this,MyCarPatternActivity.class);
        startActivity(intent2);
    }

    public void onClick3(View view)
    {
        Intent intent3=new Intent(this,AnotherActivity.class);
        startActivity(intent3);
    }

}
