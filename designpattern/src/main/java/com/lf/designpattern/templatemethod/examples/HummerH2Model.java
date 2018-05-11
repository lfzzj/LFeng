package com.lf.designpattern.templatemethod.examples;

/**
 * @data on 2018/4/27 14:35
 * @describe: H2型号悍马模型
 */

public class HummerH2Model extends HummerModel {

    //悍马H2发动...
    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }

    //停车
    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    //H2型号的悍马车鸣笛
    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    //引擎轰鸣声
    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

    //默认没有喇叭的
    protected boolean isAlarm() {
        return false;
    }
}
