package com.lf.designpattern.abstractfactory.examples;

/**
 * @data on 2018/4/27 13:52
 * @describe: 黄色男性人种
 */

public class MaleYellowHuman  extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
