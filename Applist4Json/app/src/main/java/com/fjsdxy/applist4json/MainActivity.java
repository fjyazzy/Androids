package com.fjsdxy.applist4json;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;
import java.io.InputStream;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView mListView;
    //需要适配的数据,图片集合
    //private String[] names,icons;
    int nums=8;
    private String[] names= new String[nums];
    private String[] icons = new String[nums];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i=0;
        try {
            //读取applist.json文件
            InputStream is = this.getResources().openRawResource(R.raw.applist);
            //把每个app信息集合存到applistInfos中
            List<Applistinfo> ApplistInfos = Applistservice.getInfosFromJson(is);
            //循环读取ApplistInfos中的每一条数据
            for (Applistinfo info : ApplistInfos) {
                names[i]=info.getAppname();
                icons[i]=info.getAppicon();
                Log.i("For zzytest",names[i]);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "解析信息失败", Toast.LENGTH_SHORT).show();
        }

        setContentView(R.layout.activity_main);
        //初始化ListView控件
        mListView = (ListView) findViewById(R.id.lv);
        //创建一个Adapter的实例
        MyBaseAdapter mAdapter = new MyBaseAdapter();
        //设置Adapter
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
        // TODO Auto-generated method stub
        String text= mListView.getItemAtPosition(position)+"";
        Toast.makeText(this, "你的选择是：position="+position+" | text="+text,Toast.LENGTH_SHORT).show();
        
    }

    class MyBaseAdapter extends BaseAdapter {
        //得到item的总数
        @Override
        public int getCount() {
            //返回ListView Item条目的总数
            return names.length;
        }
        //得到Item代表的对象
        @Override
        public Object getItem(int position) {
            //返回ListView Item条目代表的对象
            return names[position];
        }
        //得到Item的id
        @Override
        public long getItemId(int position) {
            //返回ListView Item的id
            return position;
        }
        //得到Item的View视图
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                convertView = LayoutInflater.from(getApplicationContext()).
                        inflate(R.layout.list_item,parent,false);
                holder = new ViewHolder();
                holder.mTextView = (TextView)convertView.findViewById
                        (R.id. item_tv);
                holder.imageView=(ImageView) convertView.findViewById(R.id.item_image);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.mTextView.setText(names[position]);
            //holder.imageView.setBackgroundResource(icons[position]);
            //根据字符串资源名获得资源id
            Resources res = MainActivity.this.getResources();
            int resId=res.getIdentifier(icons[position],//需要转换的资源名称
                    "drawable",        //资源类型
                    "com.fjsdxy.applist4json");
            holder.imageView.setBackgroundResource(resId);

            return convertView;
        }
        class ViewHolder {
            TextView mTextView;
            ImageView imageView;
        }


    }
}
