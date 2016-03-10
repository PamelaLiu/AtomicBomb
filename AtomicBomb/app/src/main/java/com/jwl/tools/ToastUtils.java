package com.jwl.tools;

import android.content.Context;
import android.widget.Toast;

import com.jwl.app.AtomApplication;

/**
 *
 * Created by jwl on 2015-11-17.
 */
public class ToastUtils {

    /**
     *
     * @param message
     */
    public static void makeLong(String message) {
        Toast.makeText(AtomApplication.getInstance().getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    /**
     *
     * @param resid
     */
    public static void makeLong(int resid) {
        Context context = AtomApplication.getInstance().getApplicationContext();
        Toast.makeText(context, context.getResources().getString(resid), Toast.LENGTH_LONG).show();
    }

    /**
     *
     * @param message
     */
    public static void makeShort(String message) {
        Toast.makeText(AtomApplication.getInstance().getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    /**
     *
     * @param resid
     */
    public static void makeShort(int resid) {
        Context context = AtomApplication.getInstance().getApplicationContext();
        Toast.makeText(context, context.getResources().getString(resid), Toast.LENGTH_SHORT).show();
    }
}
