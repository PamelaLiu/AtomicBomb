package com.jwl.atomicbomb.model.engine;

import android.content.Context;

import com.jwl.atomicbomb.model.bean.BaseBean;
import com.jwl.atomicbomb.model.net.IPostNet;
import com.jwl.atomicbomb.model.net.utils.RetrofitUtils;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by jwl on 2016/3/17.
 */
public class SplashEngine extends BaseEngine {

    private IPostNet postNet = null;
    private Call<BaseBean> call = null;

    public void request(Callback cb)
    {

        postNet = RetrofitUtils.createRetrofit(IPostNet.class);

        call = postNet.get(null, null);

        call.enqueue(cb);

    }

    public void cancel()
    {

        if(call != null && !call.isCanceled())
            call.cancel();
    }

}
