package com.lf.designpattern.factorymethod.multiple;

/**
 * @data on 2018/4/27 9:40
 * @describe: 黑色人种的创建工厂
 */

public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
