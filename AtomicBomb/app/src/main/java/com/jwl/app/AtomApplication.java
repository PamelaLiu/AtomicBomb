package com.jwl.app;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import java.util.ArrayList;
import java.util.List;


/**
 * FrameApplication
 * Created by jwl on 2015-11-16.
 */

public class AtomApplication extends Application {

    private static AtomApplication mInstance = null;

    public List<Object> activities = new ArrayList<>();


    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        mInstance = this;

        super.onCreate();
    }

    /**
     * Application 实例
     * @return FrameApplication
     */
    public static AtomApplication getInstance() {

        return mInstance;
    }

    /**
     * 获取版本
     * @return String
     */
    public String getAppVersion() {
        try {
            PackageManager manager = getPackageManager();
            PackageInfo info = manager.getPackageInfo(getPackageName(), 0);
            String version = info.versionName;
            return version;
        } catch (Exception e) {
            return "0";
        }
    }

    /**
     * activity 压栈
     * @param activity
     */
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    /**
     * 获取当前页Activity
     * @return Activity
     */
    public Activity getCurrentActivity() {
        clearInvalidActivity();

        if (activities.size() > 0)
            return (Activity) activities.get(activities.size() - 1);
        else
            return null;
    }

    /**
     * 删除指定索引的Activity
     * @param index
     */
    public void removeForIndexActivity(int index) {
        clearInvalidActivity();

        int lenght = activities.size();
        if (lenght != 0 && lenght > index)
        {
            Activity activity = (Activity) activities.get(index);
            if (!activity.isFinishing())
                activity.finish();
            activities.remove(index);
        }
    }

    /**
     * removeActivity（RETAIN_BOTTOM）
     * 保留最底部
     */
    public static int RETAIN_BOTTOM = -1;

    /**
     * removeActivity（RETAIN_TOP）
     * 保留最顶部
     */
    public static int RETAIN_TOP = -2;

    /**
     * 删除指定数量的Activity
     * @param num
     * @return boolean
     */
    public boolean removeActivity(int num)
    {
        clearInvalidActivity();

        int length = activities.size();
        if (length != 0 && num != 0 && length > num)
        {
            if(num == RETAIN_BOTTOM)
            {
                for (int i = 1; i < length; ++i)
                {
                    Activity activity = (Activity) activities.get(i);
                    if (!activity.isFinishing())
                        activity.finish();
                    activities.remove(i);
                }
            }
            else if (num == RETAIN_TOP)
            {
                for (int i = length - 2; i >= 0; --i)
                {
                    Activity activity = (Activity) activities.get(i);
                    if (!activity.isFinishing())
                        activity.finish();
                    activities.remove(i);
                }
            }
            else
            {
                for (int i = length - 1; i >= 0; --i)
                {
                    Activity activity = (Activity) activities.get(i);
                    if (!activity.isFinishing())
                        activity.finish();
                    activities.remove(i);
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * 清理无效Activity
     */
    public void clearInvalidActivity() {
        for (int i = 0; i < activities.size(); ++i) {
            Activity activity = (Activity) activities.get(i);
            if (activity == null || activity.isFinishing())
                activities.remove(i);
        }
    }

    /**
     * 退出，清除栈里所有Activity
     */
    public void exit() {
        for (int i = 0; i < activities.size(); ++i) {
            Activity activity = (Activity) activities.get(i);
            if (!activity.isFinishing()) {
                activity.finish();
                activities.remove(i);
            }
        }
    }





}
