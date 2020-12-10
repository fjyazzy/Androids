package com.fjsdxy.j093ac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button myBtn_1;
    private Button myBtn_2;
    private Button myBtn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBtn_1 = (Button) findViewById(R.id.btn_1);
        myBtn_2 = (Button) findViewById(R.id.btn_2);
        myBtn_3 = (Button) findViewById(R.id.btn_3);

        myBtn_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, dhlj.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, forHelp.class);
                MainActivity.this.startActivity(intent);
            }
        });
        myBtn_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, pbgm.class);
                MainActivity.this.startActivity(intent);
            }
        });


    }
}