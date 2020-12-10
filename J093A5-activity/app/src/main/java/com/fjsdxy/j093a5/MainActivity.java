package com.fjsdxy.j093a5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv);
        textView.setText("调用onCreate");
        Log.i("MainActivity","调用OnCreate()");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MainActivity","调用OnStart()");
        textView.setText("调用onStart()");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("MainActivity","调用OnResume()");
        textView.setText("调用onResume()");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("MainActivity","调用OnPause()");
        textView.setText("调用onPause()");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MainActivity","调用OnStop()");
        //textView.setText("调用onStop()");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("MainActivity","调用OnDestroy()");
        //textView.setText("调用onDestroy()");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("MainActivity","调用onRestart()");
    }
}