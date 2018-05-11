package com.lf.designpattern.abstractfactory.currency;

/**
 * @data on 2018/4/27 14:04
 * @describe: 抽象产品类B
 */

public abstract class AbstractProductB {
    //每个产品共有的方法
    public void shareMethod() {
    }

    // 每个产品相同方法，不同实现
    public abstract void doSomething();
}
