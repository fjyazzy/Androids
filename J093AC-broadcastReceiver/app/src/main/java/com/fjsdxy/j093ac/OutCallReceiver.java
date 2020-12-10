package com.fjsdxy.j093ac;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

public class OutCallReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i("MyReceiver","onReceive");
        Toast.makeText(context,"收到了一条广播",Toast.LENGTH_SHORT).show();

        //获取拨打的电话号码
        String outcallnumber = getResultData();
        //创建SharedPreferences对象,获取拦截号码
        SharedPreferences sp = context.getSharedPreferences("config",Context.MODE_PRIVATE);
        String number =sp.getString("number","");
        //判断是否是拦截电话号码
        if(outcallnumber.equals(number)){
            //清除电话
            setResultData(null);
        }


    }
}
