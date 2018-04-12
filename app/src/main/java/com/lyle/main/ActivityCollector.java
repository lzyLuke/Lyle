package com.lyle.main;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector  {

    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    //    这个函数可以在任何时候方便的退出程序
    public static void finishAll(){
        for(Activity i:activities){
            if(!i.isFinishing()){
                i.finish();
            }
        }
        activities.clear();
    }
}

