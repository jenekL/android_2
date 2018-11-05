package com.company.android_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    private static final String TAG = "State";
    Button btn1;
    Button btn2;
    int cost;
    String dopA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        btn1 = findViewById(R.id.fourthActBtn1);
        btn2 = findViewById(R.id.fourthActBtn2);

        Log.d(TAG, this.getLocalClassName() + " : onCreate()");


        Intent intent = getIntent();
        String mainA = intent.getStringExtra("mainA");
        dopA = intent.getStringExtra("dopA");



        btn1.setText(mainA);
        btn2.setText(dopA);

        cost = Integer.parseInt(dopA);




        findViewById(R.id.fourthActBtn3).setOnClickListener(event -> {
            //Intent intent1 = new Intent();
            setResult(RESULT_OK, intent);
            finish();
        });
    }


    public void oncl(View v){
        cost = Integer.parseInt(dopA);
        cost += 100;
        dopA = cost + "";

        btn2.setText(dopA);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, this.getLocalClassName() + " : onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, this.getLocalClassName() + " : onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, this.getLocalClassName() + " : onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, this.getLocalClassName() + " : onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, this.getLocalClassName() + " : onDestroy()");
    }
}
