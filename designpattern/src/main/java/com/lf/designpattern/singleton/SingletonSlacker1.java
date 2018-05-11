package com.lf.designpattern.singleton;

/**
 * @data on 2018/4/26 15:03
 * @describe: 懒汉式(1)————线程不安全
 */

public class SingletonSlacker1 {
    /**
     * 这种写法lazy loading(延迟加载)很明显，但不能在多线程中工作。　
     */
    private static SingletonSlacker1 instance;

    private SingletonSlacker1() {
    }

    public static SingletonSlacker1 getInstance() {
        if (instance == null) {
            instance = new SingletonSlacker1();
        }
        return instance;
    }
}
