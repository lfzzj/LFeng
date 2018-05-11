package com.lf.designpattern.factorymethod.multiple;

/**
 * @data on 2018/4/27 9:41
 * @describe: 白色人种
 */

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的!");
    }

    @Override
    public void talk() {
        System.out.println("白色人说的是单字节。");
    }
}
