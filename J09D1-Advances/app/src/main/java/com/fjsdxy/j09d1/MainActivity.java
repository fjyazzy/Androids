package com.fjsdxy.j09d1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, DrawerLayout.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MyFrame.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, RecyclerViewShow.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ScratchCard.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ShowFragment.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,SwipeRefresh.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Tween.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MyVideoView.class);
                MainActivity.this.startActivity(intent);
            }
        });

    }
}