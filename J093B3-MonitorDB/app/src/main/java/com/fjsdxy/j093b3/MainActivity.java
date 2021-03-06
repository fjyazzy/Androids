package com.fjsdxy.j093b3;

import androidx.appcompat.app.AppCompatActivity;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 该uri路径指向数据库应用中的数据库info表
        Uri uri = Uri.parse("content://com.fjsdxy.j093b2.PersonProvider/info");
        //注册内容观察者，参数uri指向要监测的数据库info表，
        //参数true定义了监测的范围，最后一个参数是一个内容观察者对象
        getContentResolver().registerContentObserver(uri, true,new MyObserver(new Handler()));
    }

    private class MyObserver extends ContentObserver {
        public MyObserver(Handler handler) {//handler 是一个消息处理器。
            super(handler);
        }
        @Override
        //当info表中的数据发生变化时则执行该方法
        public void onChange(boolean selfChange) {
            Log.i("监测数据变化", "有人动了你的数据库！");
            super.onChange(selfChange);
        }
    }
}
