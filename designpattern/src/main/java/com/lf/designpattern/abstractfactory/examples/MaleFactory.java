package com.lf.designpattern.abstractfactory.examples;

/**
 * @data on 2018/4/27 13:55
 * @describe: 生产男性的八卦炉
 */

public class MaleFactory {
    //生产出黑人男性
    public Human createBlackHuman() {
        return null;
    }

    // 生产出白人男性
    public Human createWhiteHuman() {
        return null;
    }

    // 生产出黄人男性
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
