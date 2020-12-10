package com.fjsdxy.j093ac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class forHelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_help);
    }
    public void send(View view){
        Intent intent = new Intent();
        // 定义广播的事件类型
        intent.setComponent(new ComponentName("com.fjsdxy.j093ac","com.fjsdxy.j093ac.MyBroadcastReceiver"));
        intent.setAction("Help_Stitch");
        // 发送广播
        sendBroadcast(intent);
    }
}