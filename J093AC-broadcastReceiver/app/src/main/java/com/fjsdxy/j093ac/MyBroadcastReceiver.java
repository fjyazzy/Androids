package com.fjsdxy.j093ac;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.i("MyBroadcastReceiver", "自定义的广播接收者,接收到了求救广播事件");
        Log.i("MyBroadcastReceiver",intent.getAction());
    }
}