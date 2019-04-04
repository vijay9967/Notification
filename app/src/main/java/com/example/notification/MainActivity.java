package com.example.notification;

import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void click(View v)
{
    NotificationCompat.Builder nb = new NotificationCompat.Builder(this);
    nb.setContentTitle("Notification Recieved");
    nb.setContentText("Your notification is be prepared for your android practical");
    nb.setSmallIcon(R.drawable.a1);
    NotificationManager nm =(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
    nm.notify(0,nb.build());
    nb.setPriority(0);
}
}