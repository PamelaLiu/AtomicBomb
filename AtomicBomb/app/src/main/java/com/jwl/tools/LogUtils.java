package com.jwl.tools;

/**
 *
 * Created by jwl on 2015-11-17.
 */
public class LogUtils {

    private static final boolean NORMAL_LOG = true;
    private static final String TAG = "JWL";


    public static void logI(String string) {
        if (NORMAL_LOG)
            android.util.Log.i(TAG, string);
    }

    public static void logE(String string) {
        if (NORMAL_LOG)
            android.util.Log.e(TAG, string);
    }

    public static void logD(String string) {
        if (NORMAL_LOG)
            android.util.Log.d(TAG, string);
    }

    public static void logW(String string) {
        if (NORMAL_LOG)
            android.util.Log.w(TAG, string);
    }

}
