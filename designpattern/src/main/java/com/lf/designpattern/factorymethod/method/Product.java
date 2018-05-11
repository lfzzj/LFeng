package com.lf.designpattern.factorymethod.method;

/**
 * @data on 2018/4/26 16:26
 * @describe: 抽象产品类
 */

public abstract class Product {
    /**
     * 具体的产品类可以有多个，都继承于抽象产品类
     */
    //产品类的公共方法
    public void method1() {
        //业务逻辑处理
    }
    //抽象方法

    public abstract void method2();
}
