package com.example.findmycar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.findmycar.utils.MyLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent welcomeIntent = new Intent(this, MonitorService.class);
        startService(welcomeIntent);
        MyLog.i("start monitor service in main activity");
        Toast.makeText(this, "MainActivity startService", Toast.LENGTH_SHORT).show();
    }
}
