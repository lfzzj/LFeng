package com.lf.designpattern.abstractfactory.currency;

/**
 * @data on 2018/4/27 14:06
 * @describe: 抽象工厂类  职责是定义每个工厂要实现的 功能，在通用代码中，抽象工厂类定义了两个产品族的产品创建
 */

public abstract class AbstractCreator {
    /**
     * 有N个产品族，在抽象工厂类中就应该有N个创建方法。
     */

    //创建A产品家族
    public abstract AbstractProductA createProductA();

    // 创建B产品家族
    public abstract AbstractProductB createProductB();

    /**
     * 有M个产品等级就应该有M个实现工厂类，在每个实现工厂中，实现不同产品族的生产任务。
     */
}
