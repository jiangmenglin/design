package com.jml.design.factory.abstract_factory.skin.text;

/**
 * @Author: jml
 * @Date: 18-3-23
 * @Description:
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅绿色边框文本框");
    }
}
