package com.lf.designpattern.singleton;

/**
 * @data on 2018/4/26 15:06
 * @describe: 饿汉
 */

public class SingletonHungry {
    /**
     *1.基于classloder机制避免了多线程的同步问题，
     * 不过，instance在类装载时就实例化，这时候初始化instance显然没有达到lazy loading(延迟加载)的效果。
     */
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
