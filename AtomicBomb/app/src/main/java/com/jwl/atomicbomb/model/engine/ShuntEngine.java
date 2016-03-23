package com.jwl.atomicbomb.model.engine;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Callback;

/**
 * Created by jwl on 2016-03-18.
 */
public class ShuntEngine {

    private static Map<Integer, BaseEngine> shunt = new HashMap<>();

    public static void request(int opt, Callback cb)
    {
        switch(opt)
        {
            case 0:
                SplashEngine engine = new SplashEngine();
                engine.request(cb);
                shunt.put(opt, engine);
                break;
            case 1:

                break;
            default:

                break;
        }

    }

    public void cancel(int opt)
    {
        if(shunt.containsKey(opt))
            shunt.get(opt).cancel();
    }

}
