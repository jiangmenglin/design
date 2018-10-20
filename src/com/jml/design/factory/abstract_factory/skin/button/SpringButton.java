package com.jml.design.factory.abstract_factory.skin.button;

import com.jml.design.factory.abstract_factory.skin.button.Button;

/**
 * @Author: jml
 * @Date: 18-3-23
 * @Description:
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}
