package com.jml.design.factory.abstract_factory.skin;

import com.jml.design.factory.abstract_factory.skin.box.ComboBox;
import com.jml.design.factory.abstract_factory.skin.button.Button;
import com.jml.design.factory.abstract_factory.skin.factory.SkinFactory;
import com.jml.design.factory.abstract_factory.skin.text.TextField;
import com.jml.design.util.XMLUtil;

/**
 * @Author: jml
 * @Date: 18-3-23
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        SkinFactory factory;
        Button button;
        TextField textField;
        ComboBox comboBox;

        factory = (SkinFactory) XMLUtil.getBean("factory.xml");

        button = factory.createButton();
        textField = factory.createTextField();
        comboBox = factory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}
