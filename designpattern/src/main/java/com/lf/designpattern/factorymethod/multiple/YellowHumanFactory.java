package com.lf.designpattern.factorymethod.multiple;

/**
 * @data on 2018/4/27 9:42
 * @describe: 黄色人种的创建工厂
 */

public class YellowHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
