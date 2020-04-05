package com.example.findmycar.utils;

import android.util.Log;

public class MyLog {
    private final static String TAG = "Tanyin";

    public static void i(String msg) {
        Log.i(TAG, msg);
    }

    public static void d(String msg) {
        Log.d(TAG, msg);
    }

    public static void e(String msg) {
        Log.e(TAG, msg);
    }
}
