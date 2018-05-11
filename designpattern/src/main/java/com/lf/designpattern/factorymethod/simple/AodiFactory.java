package com.lf.designpattern.factorymethod.simple;

/**
 * @data on 2018/4/27 9:28
 * @describe: 抽象的汽车厂：
 */

public  abstract class AodiFactory {
    public abstract <T extends AodiCar> T createAudiCar(Class<T> clz);

}
