package com.example.ex2;

import android.app.Application;
import android.util.Log;

/**
 * Created by omer porat on 9/23/2016.
 */
public class MyApp extends Application{
    public final static String MYTAG="MyApp";
    @Override
    public void onTerminate() {
        Log.i(MYTAG,"App:onTerminate event");
        super.onTerminate();
    }

    @Override
    public void onCreate() {
        Log.i(MYTAG,"App:onCreate event");
        super.onCreate();

    }

}
