package com.lf.designpattern.factorymethod.method;

/**
 * @data on 2018/4/26 16:31
 * @describe: 具体工厂类 ———— 具体如何产生一个产品的对象
 */

public class ConcreteCreator extends Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return (T) product;
    }
}
