package com.lf.designpattern.factorymethod.simple;

/**
 * @data on 2018/4/27 9:29
 * @describe: 具体的汽车: Q5
 */

public class AodiQ5 extends AodiCar{
    @Override
    public void diver() {
        System.out.println("Q5启动");
    }

    @Override
    public void selfNav() {
        System.out.println("Q5导航");
    }
}
