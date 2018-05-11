package com.lf.designpattern.factorymethod.multiple;

/**
 * @data on 2018/4/27 9:37
 * @describe: 人类总称
 */

public interface Human {

    //每个人种的皮肤都有相应的颜色
    public void getColor();

    //人类会说话
    public void talk();
}
