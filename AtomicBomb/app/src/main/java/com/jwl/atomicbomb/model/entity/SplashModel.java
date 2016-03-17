package com.jwl.atomicbomb.model.entity;

import com.jwl.atomicbomb.model.bean.BaseBean;
import com.jwl.atomicbomb.model.net.IPostNet;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jwl on 2016/3/17.
 */
public class SplashModel {

    public void doSomething()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IPostNet service = retrofit.create(IPostNet.class);

        Call<BaseBean> call = service.get(null, null);

        call.enqueue(new Callback<BaseBean>() {

            @Override
            public void onResponse(Call<BaseBean> call, Response<BaseBean> response) {

            }

            @Override
            public void onFailure(Call<BaseBean> call, Throwable t) {

            }

        });
    }

}
