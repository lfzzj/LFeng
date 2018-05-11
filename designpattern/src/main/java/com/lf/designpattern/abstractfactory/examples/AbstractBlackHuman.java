package com.lf.designpattern.abstractfactory.examples;

/**
 * @data on 2018/4/27 13:48
 * @describe: 黑色人种
 */

public abstract class AbstractBlackHuman implements Human {

    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }

    public void talk() {
        System.out.println("黑色人种会说话，一般人听不懂。");
    }
}
