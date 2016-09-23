package com.example.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onRestart() {
        Log.i(MyApp.MYTAG,"Main:onRestart event");
        super.onRestart();
    }
    @Override
    protected void onStart() {
        Log.i(MyApp.MYTAG,"Main:onStart event");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.i(MyApp.MYTAG,"Main:onStop event");
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.i(MyApp.MYTAG,"Main:onResume event");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(MyApp.MYTAG,"Main:onPause event");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.i(MyApp.MYTAG,"Main:onDestroy event");
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
