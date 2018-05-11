package com.lf.designpattern.factorymethod.multiple;

/**
 * @data on 2018/4/27 9:34
 * @describe: 场景类（多工厂方法模式）
 */

public class Client {
    /**
     * 每一个产品类都对应了一个创建类，
     * 好处：创建类的职责清晰，而且结构简单，
     * 坏处：给可扩展性和可维护性带来了一定的影响。
     * 每一个产品类，都需要创建一个相应的工厂类，这样就增加了扩展的难度。因为工厂类和产品类的数量相同，维护时需要考虑两个对象之间的关系。
     */
    //示例：女娲造人
    public static void main(String[] args) {
        //女娲第一次造人，火候不足，于是白色人种产生了
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        //女娲第二次造人，火候过足，于是黑色人种产生了
        System.out.println("\n--造出的第二批人是黑色人种--");
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        //第三次造人，火候刚刚好，于是黄色人种产生了
        System.out.println("\n--造出的第三批人是黄色人种--");
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
