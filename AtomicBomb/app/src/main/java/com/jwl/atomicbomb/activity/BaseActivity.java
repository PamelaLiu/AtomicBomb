package com.jwl.atomicbomb.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jwl.atomicbomb.view.IBaseView;
import com.jwl.otto.BusProvider;

import org.xutils.x;

/**
 * BaseActivity
 * Created by jwl on 2015-11-17.
 */
public abstract class BaseActivity extends AppCompatActivity implements IBaseView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BusProvider.getInstance().register(this);
        x.view().inject(this);

        initVariables();
        initViews(savedInstanceState);
        loadData();
    }

    abstract void initVariables();

    abstract void initViews(Bundle savedInstanceState);

    abstract void loadData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BusProvider.getInstance().unregister(this);
    }

    @Override
    public void showLoading(String msg) {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String msg, View.OnClickListener onClickListener) {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener) {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener, int imageId) {

    }

    @Override
    public void showNetError(View.OnClickListener onClickListener) {

    }

}
