package com.company.android_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private static final String TAG = "State";
    TextView txtV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Log.d(TAG, this.getLocalClassName() + " : onCreate()");

        Intent intent = getIntent();
        String text = intent.getStringExtra("inf");
        txtV =  findViewById(R.id.textView1);
        txtV.setText(text);

        findViewById(R.id.backButton).setOnClickListener(event -> {
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
