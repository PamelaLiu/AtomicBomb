package com.jwl.atomicbomb.model.engine;

import retrofit2.Callback;

/**
 * Created by jwl on 2016-03-22.
 */
public abstract class BaseEngine {

    abstract void request(Callback cb);
    abstract void cancel();
}
