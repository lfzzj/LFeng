package com.lf.designpattern.factorymethod.multiple;

/**
 * @data on 2018/4/27 9:41
 * @describe: 黑色人种
 */

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的!");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
