package com.lf.designpattern.templatemethod.examples;

/**
 * @data on 2018/4/27 14:33
 * @describe: 抽象悍马模型
 */

public abstract class HummerModel {
    /**
     * 定义了悍马模型都必须具有的特质：能够发动、停止，喇叭会响，引 擎可以轰鸣，而且还可以停止
     */

    //首先，这个模型要能够被发动起来，别管是手摇发动，
    // 还是电力发动，反正是要能够发动起来，那这个实现要在实现类里了
    protected  abstract void start();

    //能发动，还要能停下来，那才是真本事
    protected  abstract void stop();

    //喇叭会出声音，是滴滴叫，还是哔哔叫
    protected  abstract void alarm();

    //引擎会轰隆隆地响，不响那是假的
    protected  abstract void engineBoom();

    // 那模型应该会跑吧，别管是人推的，还是电力驱动的，总之要会跑
    final public void run() {//这个run()方法的实现应该出现在抽象类，不应该在实现类上，抽象是所有子类的共性封装
        //先发动汽车
        this.start();
        // 引擎开始轰鸣
        this.engineBoom();
        // 然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
        if (isAlarm()){
            this.alarm();
        }
        // 到达目的地就停车
        this.stop();
    }

    //钩子方法，默认喇叭是会响的
    protected boolean isAlarm(){
        return true;
    }

}
