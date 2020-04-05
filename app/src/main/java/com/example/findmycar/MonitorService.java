package com.example.findmycar;

import android.app.Service;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.example.findmycar.utils.MyLog;
import com.example.findmycar.utils.MyToast;

public class MonitorService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    //private boolean firstRun = true;
    @Override
    public void onCreate() {
        MyToast.show(this, "MonitorService onCreate is in");
        MyLog.i("MonitorService onCreate is in");
        register();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        MyLog.i("MonitorService onStartCommand is in");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        MyToast.show(this, "MonitorService onDestroy is in");
        MyLog.i("MonitorService onDestroy is in");
        super.onDestroy();
    }

    private void register() {

        IntentFilter i = new IntentFilter();
        i.addAction(BluetoothDevice.ACTION_ACL_CONNECTED);
        i.addAction(BluetoothDevice.ACTION_ACL_DISCONNECTED);

        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals(BluetoothDevice.ACTION_ACL_CONNECTED)) {
                    MyToast.show(context, "ACTION_ACL_CONNECTED");
                    MyLog.i("ACTION_ACL_CONNECTED");
                } else if (intent.getAction().equals(BluetoothDevice.ACTION_ACL_DISCONNECTED)) {
                    MyToast.show(context, "ACTION_ACL_DISCONNECTED");
                    MyLog.i("ACTION_ACL_DISCONNECTED");
                }
            }
        }, i);
    }
}
