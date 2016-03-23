package com.jwl.atomicbomb.model.net.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by jwl on 2016-03-18.
 */
public class RetrofitUtils {

    private static Retrofit singleton;

    public static <T> T createRetrofit(Class<T> cls) {
        if (singleton == null) {
            synchronized (RetrofitUtils.class) {
                if (singleton == null) {
                    Retrofit.Builder builder = new Retrofit.Builder();
                    builder.baseUrl("https://api.github.com/")
                            .addConverterFactory(GsonConverterFactory.create());
                    singleton = builder.build();
                }
            }
        }
        return singleton.create(cls);
    }

}
