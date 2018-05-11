package com.lf.designpattern.abstractfactory.examples;

/**
 * @data on 2018/4/27 13:51
 * @describe: 黄色女性人种
 */

public class FemaleYellowHuman  extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("黄人女性");
    }
}
