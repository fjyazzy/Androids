package com.fjsdxy.j093ac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class dhlj extends AppCompatActivity {
    private EditText et_ipnumber;
    private SharedPreferences sp;
    OutCallReceiver myReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhlj);
        et_ipnumber = (EditText) findViewById(R.id.et_ipnumber);
        // 创建SharedPreferences对象
        sp = getSharedPreferences("config", MODE_PRIVATE);

        //动态注册
        myReceiver=new OutCallReceiver();
        String action =Intent.ACTION_NEW_OUTGOING_CALL;
        Log.d("MainActivity",action);
        IntentFilter intentFilter=new IntentFilter(Intent.ACTION_NEW_OUTGOING_CALL);
        intentFilter.setPriority(Integer.MAX_VALUE);
        registerReceiver(myReceiver,intentFilter);
    }

    protected void onDestroy(){
        super.onDestroy();
        unregisterReceiver(myReceiver);
    }


    public void click(View view) {
        // 获取用户输入的拦截号码
        String number = et_ipnumber.getText().toString().trim();
        //创建Editor对象,保存用户输入的拦截号码
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("number", number);
        editor.commit();
        Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();
    }
}