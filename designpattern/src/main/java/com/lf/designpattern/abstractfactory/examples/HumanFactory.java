package com.lf.designpattern.abstractfactory.examples;

/**
 * @data on 2018/4/27 13:52
 * @describe: 八卦炉定义
 */

public interface HumanFactory {
    //制造一个黄色人种
    public Human createYellowHuman();

    // 制造一个白色人种
    public Human createWhiteHuman();

    // 制造一个黑色人种
    public Human createBlackHuman();
}
