package com.jwl.atomicbomb.model.net;

import com.jwl.atomicbomb.model.bean.BaseBean;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by jwl on 2016-03-17.
 */
public interface IPostNet {

    @POST("https://api.github.com/")
    Call<BaseBean> get(@Header("opt") String opt,
                             @QueryMap Map<String, Object> query);

}
