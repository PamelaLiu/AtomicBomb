package com.jwl.atomicbomb.model.impl;

import android.content.Context;

import com.jwl.atomicbomb.model.ISplashModel;
import com.jwl.tools.NetWorkUtils;

/**
 * 简介：
 * 作者：jwliu
 * 时间：on 2015/11/16 16:10
 * 邮箱：liujiangwei@triphare.com
 */
public class SplashModelImpl implements ISplashModel {

    @Override
    public boolean isNetConnect(Context context) {
        return NetWorkUtils.isNetConnect(context);
    }
}
