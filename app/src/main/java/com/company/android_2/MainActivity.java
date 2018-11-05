package com.company.android_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "State";
    private Furniture furniture = new Furniture("Аркадия", "Макеевка", "Кожа", "Каштановый", 10000);
    TextView txtV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, this.getLocalClassName() + " : onCreate()");

        txtV = findViewById(R.id.resTxtView);

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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent;
        switch(id){
            case R.id.action_item1:
                intent = new Intent(this, Activity2.class);
                intent.putExtra("inf", furniture.getName()+ " " + furniture.getMaterial() + " "
                + " " + furniture.getManufacturer() + " " + furniture.getColor());
                startActivityForResult(intent, 1);
                break;
            case R.id.action_item2:
                intent = new Intent("lab2.thirdActivity");
                intent.putExtra("mainA", furniture.getName()+ " " + furniture.getMaterial() + " "
                        + " " + furniture.getManufacturer() + " " + furniture.getColor());
                intent.putExtra("dopA", furniture.getCost() + "");
                startActivityForResult(intent, 2);
                break;
            case R.id.action_item3:
                intent = new Intent("lab2.fourthActivity");
                intent.putExtra("mainA", furniture.getName()+ " " + furniture.getMaterial() + " "
                        + " " + furniture.getManufacturer() + " " + furniture.getColor());
                intent.putExtra("dopA", furniture.getCost() + "");
                startActivityForResult(intent, 3);
                break;
            case R.id.action_item4:
                intent = new Intent("lab2.fifthActivity");
                intent.putExtra("mainA", furniture.getName()+ " " + furniture.getMaterial() + " "
                        + " " + furniture.getManufacturer() + " " + furniture.getColor());
                intent.putExtra("dopA", furniture.getCost() + "");
                startActivityForResult(intent, 4);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null) {return;}
        String rate;
        switch (requestCode){
            case 1:
                txtV.setText("Данные на 2 активности получены");
                break;
            case 2:
                rate = "Текстовая активность завершена с оценкой " + data.getStringExtra("rate");
                txtV.setText(rate);
                break;
            case 3:
                txtV.setText("Кнопочная активность завершена");
                break;
            case 4:
                txtV.setText("Радио активность завершена");
                break;

        }

    }


}
