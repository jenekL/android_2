package com.company.android_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioButton;

public class Activity5 extends AppCompatActivity {
    private static final String TAG = "State";
    RadioButton btn1;
    RadioButton btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        btn1 = findViewById(R.id.fifthActRBtn1);
        btn2 = findViewById(R.id.fifthActRBtn2);

        Log.d(TAG, this.getLocalClassName() + " : onCreate()");


        Intent intent = getIntent();
        String mainA = intent.getStringExtra("mainA");
        String dopA = intent.getStringExtra("dopA");

        btn1.setText(mainA);
        btn2.setText(dopA);

        findViewById(R.id.fifthActBtn1).setOnClickListener(event -> {
            //Intent intent1 = new Intent();
            setResult(RESULT_OK, intent);
            finish();
        });
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
