package com.lf.designpattern.abstractfactory.examples;

/**
 * @data on 2018/4/27 13:47
 * @describe: 人种接口
 */

public interface Human {
    //每个人种都有相应的颜色
    public void getColor();

    // 人类会说话
    public void talk();

    //每个人都有性别
    public void getSex();
}
