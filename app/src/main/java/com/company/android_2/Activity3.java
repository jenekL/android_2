package com.company.android_2;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    private static final String TAG = "State";
    TextView txt1;
    TextView txt2;
    boolean closed = false;
    int rate;
    String data[] = { "ОЧЕНЬ ПЛОХО", "1", "2", "3", "4", "5" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        txt1 = findViewById(R.id.thirdActTxtView1);
        txt2 = findViewById(R.id.thirdActTxtView2);

        Log.d(TAG, this.getLocalClassName() + " : onCreate()");

        Intent intent = getIntent();
        String mainA = intent.getStringExtra("mainA");
        String dopA = intent.getStringExtra("dopA");

        txt1.setText(mainA);
        txt2.setText(dopA);

        closed = false;

        findViewById(R.id.thirdActButton1).setOnClickListener(event -> {

            if(closed) {
                intent.putExtra("rate", rate + " ");
                Log.d(TAG, "рате " + rate);
                setResult(RESULT_OK, intent);
                finish();
            }
            else {
                AlertDialog alertDialog = (AlertDialog) onCreateDialog(this);
                alertDialog.show();
            }



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

    protected Dialog onCreateDialog(Context context) {
        AlertDialog.Builder adb = new AlertDialog.Builder(context);

        adb.setTitle("Оцените данные");

        adb.setSingleChoiceItems(data, -1, myClickListener);

        adb.setCancelable(false);
        adb.setNegativeButton("Отмена", (dialog, id1) -> dialog.cancel());

        adb.setPositiveButton("OK", myClickListener);
        return adb.create();
    }

    DialogInterface.OnClickListener myClickListener = (dialog, which) -> {
        ListView lv = ((AlertDialog) dialog).getListView();
        if (which == Dialog.BUTTON_POSITIVE) {
            Log.d(TAG, "pos = " + lv.getCheckedItemPosition());
            rate = lv.getCheckedItemPosition();
            closed = true;
        }
        else {
            Log.d(TAG, "which = " + which);
        }


    };
}
