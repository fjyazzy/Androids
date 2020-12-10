package com.fjsdxy.j19a02;

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

        myBtn_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, linearlayout1.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, linearlayout2.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, relativelayout.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, framelayout.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, tablelayout.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, absolutelayout.class);
                MainActivity.this.startActivity(intent);
            }
        });


    }
}