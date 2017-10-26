package com.example.android_activitycollector;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/27.
 *
 * Activity管理器
 */

public class CollectorActivity {
    public static List<Activity> activityList=new ArrayList<>();

    /**
     * 新增一个Activity
     * @param activity
     */
    public static void addActivity(Activity activity){
        activityList.add(activity);
    }

    /**
     * 删除一个Activity
     * @param activity
     */
    public static void removeActivity(Activity activity){
        activityList.remove(activity);
    }

    /**
     * 关闭所有Activity
     */
    public static void finishAllActivity(){
        for (Activity activity : activityList){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
        activityList.clear();
    }

}
