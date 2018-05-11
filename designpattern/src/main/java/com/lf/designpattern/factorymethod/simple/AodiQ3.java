package com.lf.designpattern.factorymethod.simple;

/**
 * @data on 2018/4/27 9:29
 * @describe: 具体的汽车: Q3
 */

public class AodiQ3 extends AodiCar{
    @Override
    public void diver() {
        System.out.println("Q3启动");
    }

    @Override
    public void selfNav() {
        System.out.println("Q3导航");
    }
}
