package com.example.sharedfreferencesandroid;

import android.content.Context;

import java.util.Set;

public class DataLocalMananger {

    public static DataLocalMananger instance;
    public static MySharedfreferences mySharedfreferences;
    private static String firstinstall="firstinstall";
    private static String keyStringset="keyStringset";

    public static void init(Context context){
        instance=new DataLocalMananger();
        instance.mySharedfreferences=new MySharedfreferences(context);

    }

    public static DataLocalMananger getInstance(){
        if(instance==null){
            instance=new DataLocalMananger();
        }
        return instance;

    }

    public static void setfirstinstalled(boolean isfirst){
        DataLocalMananger.getInstance().mySharedfreferences.putBooleanValue(firstinstall,isfirst);
    }
    public static boolean getfirstinstalled(){
        return DataLocalMananger.getInstance().mySharedfreferences.getBooleanValue(firstinstall);
    }
    public static void setStringset(Set<String> usernames){
        DataLocalMananger.getInstance().mySharedfreferences.putStringsetValue(keyStringset,usernames);
    }
    public static Set<String> getStringset(){
        return DataLocalMananger.getInstance().mySharedfreferences.getStringsetValue(keyStringset);
    }
}
