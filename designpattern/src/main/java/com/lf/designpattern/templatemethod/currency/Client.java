package com.lf.designpattern.templatemethod.currency;

/**
 * @data on 2018/4/27 14:47
 * @describe:
 */

public class Client {
    /**
     * 抽象模板中的基本方法尽量设计为protected类型，符合迪米特法则，
     * 不需要暴露 的属性或方法尽量不要设置为protected类型。
     * 实现类若非必要，尽量不要扩大父类中的访问权限。
     */
    public static void main(String[] args) {
    AbstractClass class1  =new ConcreteClass1();
    AbstractClass class2 = new ConcreteClass2();
    class1.templateMethod();
    class2.templateMethod();
    }
}
