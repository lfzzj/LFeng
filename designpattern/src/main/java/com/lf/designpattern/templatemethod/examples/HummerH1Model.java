package com.lf.designpattern.templatemethod.examples;

/**
 * @data on 2018/4/27 14:35
 * @describe: H1型号悍马模型
 */

public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;  //要响喇叭

    //悍马H1发动...
    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    //停车
    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    //H1型号的悍马车鸣笛
    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    //引擎轰鸣声
    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }

    //要不要响喇叭，是由客户来决定的
    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }


}
