package com.fjsdxy.applist4json;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.lang.reflect.Type;

public class Applistservice {
    //解析json文件返回App的集合
    public static List<Applistinfo> getInfosFromJson(InputStream is)
            throws IOException {
        byte[] buffer = new byte[is.available()];
        is.read(buffer);
        String json = new String(buffer, "utf-8");
        //使用gson库解析JSON数据
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Applistinfo>>() { }.getType();
        List<Applistinfo> ApplistInfos = gson.fromJson(json, listType);
        return ApplistInfos;
    }
}
