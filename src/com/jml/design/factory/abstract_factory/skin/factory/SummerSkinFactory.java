package com.jml.design.factory.abstract_factory.skin.factory;

import com.jml.design.factory.abstract_factory.skin.box.ComboBox;
import com.jml.design.factory.abstract_factory.skin.box.SummerComboBox;
import com.jml.design.factory.abstract_factory.skin.button.Button;
import com.jml.design.factory.abstract_factory.skin.button.SummerButton;
import com.jml.design.factory.abstract_factory.skin.text.SummerTextField;
import com.jml.design.factory.abstract_factory.skin.text.TextField;

/**
 * @Author: jml
 * @Date: 18-3-23
 * @Description:
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
