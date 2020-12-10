package com.fjsdxy.j093ac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pbgm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pbgm);
    }
    public void send(View view){
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.fjsdxy.j093ac","com.fjsdxy.j093ac.MyBroadcastReceiverOne,"));
        intent.setComponent(new ComponentName("com.fjsdxy.j093ac","com.fjsdxy.j093ac.MyBroadcastReceiverTwo"));
        intent.setComponent(new ComponentName("com.fjsdxy.j093ac","com.fjsdxy.j093ac.MyBroadcastReceiverThree"));
        // 定义广播的事件类型
        intent.setAction("Intercept_Stitch");
        // 发送广播
        sendOrderedBroadcast(intent,null);
    }

}