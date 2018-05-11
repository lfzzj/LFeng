package com.lf.designpattern.singleton;

/**
 * @data on 2018/4/26 14:56
 * @describe: 双重校验锁
 */

public class SingletonDouble {
    private volatile static SingletonDouble SingletonDouble;

    private SingletonDouble() {
    }

    public static SingletonDouble getSingletonDouble() {
        if (SingletonDouble == null) {
            synchronized (SingletonDouble.class) {
                if (SingletonDouble == null) {
                    SingletonDouble = new SingletonDouble();
                }
            }
        }
        return SingletonDouble;
    }

}
