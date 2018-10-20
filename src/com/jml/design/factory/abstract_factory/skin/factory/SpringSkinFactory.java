package com.jml.design.factory.abstract_factory.skin.factory;

import com.jml.design.factory.abstract_factory.skin.box.ComboBox;
import com.jml.design.factory.abstract_factory.skin.box.SpringComboBox;
import com.jml.design.factory.abstract_factory.skin.button.Button;
import com.jml.design.factory.abstract_factory.skin.button.SpringButton;
import com.jml.design.factory.abstract_factory.skin.text.SpringTextField;
import com.jml.design.factory.abstract_factory.skin.text.TextField;

/**
 * @Author: jml
 * @Date: 18-3-23
 * @Description:
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
