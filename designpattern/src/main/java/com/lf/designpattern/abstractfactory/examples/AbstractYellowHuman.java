package com.lf.designpattern.abstractfactory.examples;

/**
 * @data on 2018/4/27 13:48
 * @describe: 黄色人种
 */

public abstract class AbstractYellowHuman implements Human {

    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节。");
    }
}
