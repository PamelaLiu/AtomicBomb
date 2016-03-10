package com.jwl.otto;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * 简介：
 * 作者：jwliu
 * 时间：on 2015/5/22 13:42
 * 邮箱：ljw_email@foxmail.com
 */
public class BusProvider
{

    private static final Bus BUS = new Bus(ThreadEnforcer.MAIN);

    public static Bus getInstance() {
        return BUS;
    }

    private BusProvider() {

    }

}
