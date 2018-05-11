package com.lf.designpattern.templatemethod.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @data on 2018/4/27 14:32
 * @describe: 场景类
 */

public class Client {
    /**
     * 示例：制造悍马
     */

    /**
     * 注意：在软件开发过程中，如果相同的一段代码复制过两次，就需要对设计产生怀疑，
     * 架构师要明确地说明为什么相同的逻辑要出现两次或更多次
     */

    public static void main(String[] args) {
        System.out.println("-------H1型号悍马--------");             System.out.println("H1型号的悍马是否需要喇叭声响？0-不需要   1-需要");
        //XX公司要H1型号的悍马
        HummerH1Model  h1 = new HummerH1Model();
        try {
            String type=(new BufferedReader(new InputStreamReader(System.in))).readLine();
            if(type.equals("0")){
                h1.setAlarm(false);
            }
            // H1模型演示
            h1.run();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
