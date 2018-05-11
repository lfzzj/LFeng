package com.lf.designpattern.abstractfactory.currency;

/**
 * @data on 2018/4/27 14:08
 * @describe: 产品等级1的实现类

 */

public class Creator1 extends AbstractCreator {
    //只生产产品等级为1的A产品
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    // 只生产产品等级为1的B产品
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
