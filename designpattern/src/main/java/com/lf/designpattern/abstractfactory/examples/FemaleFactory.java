package com.lf.designpattern.abstractfactory.examples;

/**
 * @data on 2018/4/27 13:54
 * @describe: 生产女性的八卦炉
 */

public class FemaleFactory implements HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }

    @Override
    public Human createBlackHuman() {
        return null;
    }
}
