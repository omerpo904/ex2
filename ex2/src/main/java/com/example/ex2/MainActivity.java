package com.example.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String Key_count="count";
    int clickCount=0;

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
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.i(MyApp.MYTAG,"Main:onRestoreInstance event");
        if(savedInstanceState!=null)
            this.clickCount=savedInstanceState.getInt(Key_count,0);
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.i(MyApp.MYTAG,"Main:onSaveInstance event");
        outState.putInt(Key_count,this.clickCount);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void displaymessaage( View v){
        clickCount++;
       EditText et= (EditText)findViewById(R.id.eTxtpo);
        String messeage =getResources().getString(R.string.emptyname);
        String messeag=getResources().getString(R.string.name);
        String name=et.getText().toString();

            if(name.isEmpty())
            Toast.makeText(this,String.format(messeage,clickCount),Toast.LENGTH_LONG).show();
             else
            Toast.makeText(this,String.format(messeag,clickCount,name),Toast.LENGTH_LONG).show();


    }

}