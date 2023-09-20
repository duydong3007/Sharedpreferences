package com.example.sharedfreferencesandroid;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;

public class MySharedfreferences {

    private static final String mysharedfreferencs="mysharedfreferencs";
    private static Context mContext;

    public MySharedfreferences(Context mContext) {
        this.mContext = mContext;
    }

    public static void putBooleanValue(String key,boolean value){
        SharedPreferences sharedPreferences=mContext.getSharedPreferences(mysharedfreferencs,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putBoolean(key,value);
        editor.apply();
    }
    public static boolean getBooleanValue(String key){
        SharedPreferences sharedPreferences=mContext.getSharedPreferences(mysharedfreferencs,Context.MODE_PRIVATE);

        return sharedPreferences.getBoolean(key,false);
    }
    public static void putStringsetValue(String key, Set<String> values){
        SharedPreferences sharedPreferences=mContext.getSharedPreferences(mysharedfreferencs,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putStringSet(key,values);
        editor.apply();
    }
    public static Set<String> getStringsetValue(String key){
        SharedPreferences sharedPreferences=mContext.getSharedPreferences(mysharedfreferencs,Context.MODE_PRIVATE);

        Set<String> valuess=new HashSet<>();
        return sharedPreferences.getStringSet(key,valuess);
    }
}
