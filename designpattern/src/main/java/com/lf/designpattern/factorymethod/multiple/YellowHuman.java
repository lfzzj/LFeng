package com.lf.designpattern.factorymethod.multiple;

/**
 * @data on 2018/4/27 9:41
 * @describe: 黄色人种
 */

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的!");
    }

    @Override
    public void talk() {
        System.out.println("黄色人说的是双字节。");
    }
}
