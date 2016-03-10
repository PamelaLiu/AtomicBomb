package com.jwl.atomicbomb.activity;

import android.app.Activity;
import android.os.Bundle;

import com.jwl.otto.BusProvider;

/**
 * BaseActivity
 * Created by jwl on 2015-11-17.
 */
public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BusProvider.getInstance().register(this);

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

}
