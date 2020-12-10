package com.fjsdxy.j093a3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button myBtn_1;
    private Button myBtn_2;
    private Button myBtn_3;
    private Button myBtn_4;
    private Button myBtn_5;
    private Button myBtn_6;
    private Button myBtn_7;
    private Button myBtn_8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBtn_1 = (Button) findViewById(R.id.btn_1);
        myBtn_2 = (Button) findViewById(R.id.btn_2);
        myBtn_3 = (Button) findViewById(R.id.btn_3);
        myBtn_4 = (Button) findViewById(R.id.btn_4);
        myBtn_5 = (Button) findViewById(R.id.btn_5);
        myBtn_6 = (Button) findViewById(R.id.btn_6);
        myBtn_7 = (Button) findViewById(R.id.btn_7);
        myBtn_8 = (Button) findViewById(R.id.btn_8);

        myBtn_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //普通对话框
            AlertDialog dialog;                           //声明对象
            dialog = new AlertDialog.Builder(MainActivity.this)        //绑定当前界面窗口
                .setTitle("Dialog对话框")             //设置标题
                .setMessage("是否确定退出？")         //设置提示信息
                .setIcon(R.mipmap.ic_launcher)       //设置图标
                .setPositiveButton("确定", null)     //添加“确定”按钮
                .setNegativeButton("取消", null)     //添加“取消”按钮
                .create();                          //创建对话框
            dialog.show();
            }
        });
        myBtn_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //单选对话框
                new AlertDialog.Builder(MainActivity.this)               //生成对话框
                .setTitle("请选择性别")              //设置标题
                .setIcon(R.mipmap.ic_launcher)      //设置图标
                .setSingleChoiceItems(new String[]{"男", "女"}, 0,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        }
                )
                .setPositiveButton("确定", null)
                .show();
            }
        });
        myBtn_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //多选对话框
                new AlertDialog.Builder(MainActivity.this)
                .setTitle("请添加兴趣爱好！")
                .setIcon(R.mipmap.ic_launcher)
                .setMultiChoiceItems(new String[]{"旅游", "美食", "汽车", "宠物"},
                        null, null)
                .setPositiveButton("确定", null)
                .show();

            }
        });
        myBtn_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //进度条对话框
                ProgressDialog prodialog;                //声明对话框
                prodialog = new ProgressDialog(MainActivity.this); //构建对话框
                prodialog.setTitle("进度条对话框");
                prodialog.setIcon(R.mipmap.ic_launcher);
                prodialog.incrementProgressBy(10);
                prodialog.setMessage("正在下载请等候...");
                prodialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL); //设置水平进度条
////            prodialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);//设置圆形进度条
                prodialog.show();
                prodialog.setProgress(80);
            }
        });
        myBtn_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //创建Toast消息对话框
            Toast.makeText(MainActivity.this, "Hello,Toast", Toast.LENGTH_SHORT).show();
            }
        });
        myBtn_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MyDialog myDialog = new MyDialog(MainActivity.this, "我是自定义的Dialog");
                myDialog.show();
            }
        });
        myBtn_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MyStyle.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MyTheme.class);
                MainActivity.this.startActivity(intent);
            }
        });


    }
}