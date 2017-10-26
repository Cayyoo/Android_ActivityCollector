package com.example.android_activitycollector;

import android.os.Bundle;

/**
 * 集中管理Activity：
 * 1、封装一个CollectorActivity用于集中管理Activity
 * 2、定义BaseActivity，调用添加、删除Activity的方法
 * 3、之后无论想在哪里销毁所有Activity（或退出程序），调用CollectorActivity.finishAllActivity()即可
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        可在调用CollectorActivity.finishAllActivity()之后，
        再调用killProcess()，以保证完全退出。

        注意：killProcess()只能用于杀掉当前进程，不能杀死其他进程
         */
        android.os.Process.killProcess(android.os.Process.myPid());
    }

}
