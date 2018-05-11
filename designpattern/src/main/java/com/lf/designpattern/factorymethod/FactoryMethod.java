package com.lf.designpattern.factorymethod;

/**
 * @data on 2018/4/26 16:22
 * @describe: 工厂方法模式
 */

public class FactoryMethod {
    /**
     *   定义：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类
     */

    //优点
    /**
     * 1.良好的封装性，代码结构清晰。
     * 2.的扩展性非常优秀。
     * 3.屏蔽产品类。产品类的实现如何变化，调用者都不需要关心，它只需要关心产品的接口
     * 4.工厂方法模式是典型的解耦框架。
     */

    /**
     * 模式
     * 1.  修改具体工厂类中需要生产的产品
     * 2.  通过反射来了解对应的产品，客户端调用的时候，传入什么产品就生产什么产品
     * 3.  可以为每个产品都创建一个具体的工厂类要生产哪个就调用哪个工厂。这种叫多工厂方法模式。
     */
}