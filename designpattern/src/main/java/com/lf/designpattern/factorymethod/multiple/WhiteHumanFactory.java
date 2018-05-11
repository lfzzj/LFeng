package com.lf.designpattern.factorymethod.multiple;

/**
 * @data on 2018/4/27 9:40
 * @describe: 白色人种的创建工厂
 */

public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
