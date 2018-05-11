package com.lf.designpattern.singleton;

/**
 * @data on 2018/4/26 15:03
 * @describe: 懒汉式(2)————线程安全
 */

public class SingletonSlacker2 {
    /**
     * 1.在getInstance()方法中加入了synchronized锁。
     * 2.能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading(延迟加载)，
     * 3.但效率很低（因为锁），并且大多数情况下不需要同步。
     */
    private static SingletonSlacker2 instance;

    private SingletonSlacker2() {
    }

    public static synchronized SingletonSlacker2 getInstance() {
        if (instance == null) {
            instance = new SingletonSlacker2();
        }
        return instance;
    }
}
