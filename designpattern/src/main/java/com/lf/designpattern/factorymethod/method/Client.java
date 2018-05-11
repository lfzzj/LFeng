package com.lf.designpattern.factorymethod.method;

/**
 * @data on 2018/4/26 16:35
 * @describe: 场景类 (工厂方法模式)
 */

public class Client {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /**
         * 继续业务处理
         */

    }
}
