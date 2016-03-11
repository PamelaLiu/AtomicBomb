package com.jwl.atomicbomb.view;

import android.view.View;

/**
 * Created by jwl on 2016/3/11.
 */
public interface IBaseView {

    void showLoading(String msg);

    void hideLoading();

    void showError(String msg, View.OnClickListener onClickListener);

    void showEmpty(String msg, View.OnClickListener onClickListener);

    void showEmpty(String msg, View.OnClickListener onClickListener,int imageId);

    void showNetError(View.OnClickListener onClickListener);
}
