package com.jwl.atomicbomb.persenter;

import com.jwl.atomicbomb.view.IBaseView;

/**
 * Created by jwl on 2016/3/11.
 */
public class BasePresenter<T extends IBaseView> implements IPresenter<T> {

    private T iBaseView;

    @Override
    public void attachView(T view) {
        iBaseView = view;
    }

    @Override
    public void detachView() {
        iBaseView = null;
    }

    public boolean isViewAttached() {
        return iBaseView != null;
    }

    public T getIBaseView() {
        return iBaseView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new IBaseViewNotAttachedException();
    }

    public static class IBaseViewNotAttachedException extends RuntimeException {
        public IBaseViewNotAttachedException() {
            super("Please call IPresenter.attachView(iBaseView) before requesting data to the Presenter");
        }
    }

}
