package com.jwl.atomicbomb.persenter;

import com.jwl.atomicbomb.view.IBaseView;

/**
 * Created by jwl on 2016/3/11.
 */
public interface IPresenter<V extends IBaseView> {

    void attachView(V iBaseView);

    void detachView();
}
