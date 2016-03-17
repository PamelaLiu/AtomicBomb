package com.jwl.atomicbomb.persenter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;

import com.jwl.atomicbomb.view.ISplashView;

/**
 * 简介：
 * 作者：jwliu
 * 时间：on 2015/11/16 15:53
 * 邮箱：liujiangwei@triphare.com
 */
public class SplashPresenter extends BasePresenter {

    private ISplashView iView;
    private ValueAnimator splashAnimation = null;
    private final static int SPLASH_DURATION = 2000;

    public SplashPresenter(ISplashView iView){
        this.iView = iView;

        splashAnimation = ValueAnimator.ofFloat(0.5f, 1.0f).setDuration(SPLASH_DURATION);

    }

    public void didFinishSplash(Context context){

        splashAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
            @Override
            public void onAnimationUpdate(ValueAnimator animation)
            {
                float scale = (float) animation.getAnimatedValue();
                iView.showAnimation(scale);
            }
        });

        splashAnimation.addListener(new AnimatorListenerAdapter()
        {
            @Override
            public void onAnimationEnd(Animator animation)
            {
                super.onAnimationEnd(animation);
                splashAnimation.cancel();

                iView.startNextActivity();
            }
        });

        splashAnimation.start();
    }

}

