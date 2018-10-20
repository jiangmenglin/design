package com.jml.design.factory.abstract_factory.skin.box;

/**
 * @Author: jml
 * @Date: 18-3-23
 * @Description:
 */
public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示浅绿色边框组合框。");
    }
}
