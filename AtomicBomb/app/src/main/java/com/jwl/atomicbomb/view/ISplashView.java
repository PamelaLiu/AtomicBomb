package com.jwl.atomicbomb.view;

/**
 * 简介：
 * 作者：jwliu
 * 时间：on 2015/11/16 15:52
 * 邮箱：liujiangwei@triphare.com
 */
public interface ISplashView extends IBaseView {

    void showAnimation(float scale);

    void showNetError();
    void startNextActivity();
}
