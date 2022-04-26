package com.example.courseproject1.Recyclerview1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadCaster1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        boolean isOn = intent.getBooleanExtra("message ",false);

        if(isOn){
        Toast.makeText(context, "airplane mode on", Toast.LENGTH_SHORT).show();}
        else{
            Toast.makeText(context, "airplane mode offf", Toast.LENGTH_SHORT).show();
        }
    }
}
