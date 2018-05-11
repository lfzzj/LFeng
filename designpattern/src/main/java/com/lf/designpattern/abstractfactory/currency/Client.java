package com.lf.designpattern.abstractfactory.currency;

/**
 * @data on 2018/4/27 14:12
 * @describe: 场景类
 */

public class Client {
    public static void main(String[] args) {
        //定义出两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        // 产生A1对象
        AbstractProductA a1 = creator1.createProductA();
        // 产生A2对象
        AbstractProductA a2 = creator2.createProductA();
        // 产生B1对象
        AbstractProductB b1 = creator1.createProductB();
        // 产生B2对象
        AbstractProductB b2 = creator2.createProductB();
        /**
         * 然后在这里就可以为所欲为了
         */
        /**
         *  在这里，不需要任何一个方法与实现类有关系，
         *  对于一个产品来说，我们只要知道它的工厂方法就可以直接产生一个产品对象，无须关心它的实现类。
         *
         *  优点：
         *
         *  1.封装性
         *  2.产品族内的约束为非公开状态，具体的产品族内的约束是在工厂内实现的。
         *
         *  缺点：
         *
         *  是产品族扩展非常困难（但产品等级扩展非常容易）、
         *  横向扩展容易，纵向扩展困难
         *
         */
    }
}
