package com.lf.designpattern.singleton;

/**
 * @data on 2018/4/26 15:06
 * @describe: 饿汉(变种)
 */

public class SingletonHungryVariety {
    /**
     * 看起来差别挺大，跟饿汉差不多，都是在类初始化即实例化instance
     */
    private static SingletonHungryVariety instance = null;

    static {
        instance = new SingletonHungryVariety();
    }

    private SingletonHungryVariety() {
    }

    public static SingletonHungryVariety getInstance() {
        return instance;
    }
}
