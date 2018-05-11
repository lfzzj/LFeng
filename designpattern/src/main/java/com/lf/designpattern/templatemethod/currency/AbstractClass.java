package com.lf.designpattern.templatemethod.currency;

/**
 * @data on 2018/4/27 14:45
 * @describe: 抽象模板类
 */

public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomething();

    //基本方法
    protected abstract void doAnything();

    //模板方法
    final public void templateMethod() {
        /**
         * 调用基本方法，完成相关的逻辑
         */
        this.doAnything();
        this.doSomething();
    }
}
