package com.lf.designpattern.abstractfactory.examples;

/**
 * @data on 2018/4/27 13:56
 * @describe: 场景类：
 */

public class NvWa {
    /**
     * 示例：女娲造人
     */
    public static void main(String[] args) {
        //第一条生产线，男性生产线

        HumanFactory maleHumanFactory = (HumanFactory) new MaleFactory();
        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();
        // 生产线建立完毕，开始生产人了:
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("---生产一个黄色女性---");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        System.out.println("\n---生产一个黄色男性---");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
        /**
         * ......
         * 后面继续创建
         */
    }
}
