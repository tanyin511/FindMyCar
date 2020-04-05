package com.example.findmycar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import android.widget.Toast;

import com.example.findmycar.utils.MyLog;

public class Boot extends BroadcastReceiver {

    public static final String ACTION = "android.intent.action.BOOT_COMPLETED";

    @Override
    public void onReceive(Context context, Intent intent) {
        MyLog.i("haha Boot is in~~~~~~");


        if (intent.getAction().equals(ACTION)) {
            //Intent welcomeIntent = new Intent(context, com.example.findmycar.MonitorService.class);
            //context.startService(welcomeIntent);

            Intent i = new Intent(context, MainActivity.class);
            context.startActivity(i);
            Toast.makeText(context, "boot complete", Toast.LENGTH_LONG).show();

        }
    }
}
