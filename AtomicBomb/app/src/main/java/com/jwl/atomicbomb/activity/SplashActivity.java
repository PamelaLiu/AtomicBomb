package com.jwl.atomicbomb.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.jwl.atomicbomb.R;
import com.jwl.atomicbomb.persenter.SplashPresenter;
import com.jwl.atomicbomb.view.ISplashView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;


/**
 * SplashActivity
 * Created by jwl on 2016-3-12.
 */

@ContentView(R.layout.activity_splash)
public class SplashActivity extends BaseActivity implements ISplashView {

    public SplashPresenter presenter;

    @ViewInject(R.id.splash_logo)
    private ImageView splashLogoImage;

    @Override
    void initViews(Bundle savedInstanceState) {
        presenter = new SplashPresenter(this);
        presenter.attachView(this);

    }

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    void loadData() {

    }

    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return TransitionMode.FADE;
    }


    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }


    @Override
    public void showAnimation(float scale) {

        splashLogoImage.setScaleX(scale);
        splashLogoImage.setScaleY(scale);
        splashLogoImage.setAlpha(scale);
    }

    @Override
    public void startNextActivity() {
        startActivity(new Intent(this, GuideActivity.class));
        this.finish();
    }

    @Override
    protected void onResume() {
        super.onResume();

        presenter.didFinishSplash(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
