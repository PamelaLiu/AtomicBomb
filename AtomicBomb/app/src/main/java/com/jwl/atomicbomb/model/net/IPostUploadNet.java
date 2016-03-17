package com.jwl.atomicbomb.model.net;

import com.jwl.atomicbomb.model.bean.BaseBean;

import java.io.File;
import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.QueryMap;

/**
 * Created by jwl on 2016/3/17.
 */
public interface IPostUploadNet {

    @Multipart
    @POST("https://api.github.com/")
    Call<BaseBean> get(@Header("opt") String opt,
                             @QueryMap Map<String, String> query,
                             @PartMap Map<String, RequestBody> file);

  //  Call <ResponseBody> upload(@Part("file") RequestBody file,
  //        @PartMap Map<String, RequestBody> params);

}
