package com.jwl.atomicbomb.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.jwl.atomicbomb.R;
import com.jwl.atomicbomb.persenter.SplashPresenter;
import com.jwl.atomicbomb.view.ISplashView;
import com.jwl.tools.ToastUtils;


/**
 * SplashActivity
 * Created by jwl on 2015-11-17.
 */
public class SplashActivity extends BaseActivity implements ISplashView {

    public SplashPresenter presenter;


    private ImageView splashLogoImage;


    @Override
    void initVariables() {
        presenter = new SplashPresenter(this);

    }

    @Override
    void initViews(Bundle savedInstanceState) {
        setContentView(R.layout.activity_splash);


    }

    @Override
    void loadData() {

    }

    @Override
    public void showAnimation(float scale) {

        splashLogoImage.setScaleX(scale);
        splashLogoImage.setScaleY(scale);
        splashLogoImage.setAlpha(scale);
    }

    @Override
    public void showNetError() {
        ToastUtils.makeLong(R.string.network_error);
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
