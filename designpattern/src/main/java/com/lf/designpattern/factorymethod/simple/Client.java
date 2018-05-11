package com.lf.designpattern.factorymethod.simple;

/**
 * @data on 2018/4/27 9:24
 * @describe: 场景类 (简单工厂模式)
 */

public class Client {
    //(当确定工厂类只有一个的时候)
    //示例：汽车生产
    public static void main(String[] args) {
        AodiFactory aodiFactory = new AodiCarFactory();
        AodiCar Q3 = aodiFactory.createAudiCar(AodiQ3.class);
        Q3.diver();
        Q3.selfNav();
        AodiCar Q5 = aodiFactory.createAudiCar(AodiQ5.class);
        Q5.diver();
        Q5.selfNav();
    }
}
