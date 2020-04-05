package com.example.findmycar.utils;

import android.content.Context;
import android.widget.Toast;

public class MyToast {
    public static void show(Context c, String s) {
        Toast.makeText(c, s, Toast.LENGTH_LONG).show();
    }
}
