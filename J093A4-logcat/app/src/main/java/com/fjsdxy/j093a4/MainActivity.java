package com.fjsdxy.j093a4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private Button myBtn_1;
    private Button myBtn_2;
    private Button myBtn_3;
    private Button myBtn_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBtn_1 = (Button) findViewById(R.id.btn_1);
        myBtn_2 = (Button) findViewById(R.id.btn_2);
        myBtn_3 = (Button) findViewById(R.id.btn_3);
        myBtn_4 = (Button) findViewById(R.id.btn_4);

        myBtn_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MyI18N.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog dialog;                           //声明对象
                dialog = new AlertDialog.Builder(MainActivity.this)        //绑定当前界面窗口
                        .setTitle("请配置测试内容，创建测试项目！")             //设置标题
                        .setMessage("是否确定退出？")         //设置提示信息
                        .setIcon(R.mipmap.ic_launcher)       //设置图标
                        .setPositiveButton("确定", null)     //添加“确定”按钮
                        .setNegativeButton("取消", null)     //添加“取消”按钮
                        .create();                          //创建对话框
                dialog.show();
            }
        });
        myBtn_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v("MainActivity-from zzy", "Verbose");
                Log.d("MainActivity-from zzy", "Degug");
                Log.i("MainActivity-from zzy", "Info");
                Log.w("MainActivity-from zzy", "Warning");
                Log.e("MainActivity-from zzy", "Error");
            }
        });
        myBtn_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MyDebug.class);
                MainActivity.this.startActivity(intent);
            }
        });


    }
}