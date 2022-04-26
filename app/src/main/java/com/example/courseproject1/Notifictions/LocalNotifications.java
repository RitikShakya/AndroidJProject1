package com.example.courseproject1.Notifictions;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.courseproject1.R;

public class LocalNotifications extends AppCompatActivity {

    Button increment;
    int count=0;

    String channel_id ="1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Notifications");
        setContentView(R.layout.activity_local_notifications);

        increment = findViewById(R.id.incrementnotify);

        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count =count+1;

                increment.setText(""+count);

                if(count==5){

                    notifyme();
                }
            }
        });
    }

    public void notifyme(){

        NotificationChannel notificationChannel =new NotificationChannel(channel_id,"1", NotificationManager.IMPORTANCE_DEFAULT);

        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.createNotificationChannel(notificationChannel);

        Notification.Builder builder = new Notification.Builder(LocalNotifications.this, channel_id);
        builder.setContentTitle("not").setContentText("hello");

        NotificationManagerCompat compat = NotificationManagerCompat.from(LocalNotifications.this);
        compat.notify(1,builder.build());
    }



}