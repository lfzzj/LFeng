package com.lf.designpattern.factorymethod.simple;

/**
 * @data on 2018/4/27 9:28
 * @describe: 具体的汽车生产工厂：
 */

public class AodiCarFactory extends AodiFactory{
    @Override
    public <T extends AodiCar> T createAudiCar(Class<T> clz) {
        AodiCar aodiCar = null;
        try {
            aodiCar = (AodiCar) (Class.forName(clz.getName())).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) aodiCar;
    }
}
