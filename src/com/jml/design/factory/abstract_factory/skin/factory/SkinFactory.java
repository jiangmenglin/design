package com.jml.design.factory.abstract_factory.skin.factory;

import com.jml.design.factory.abstract_factory.skin.box.ComboBox;
import com.jml.design.factory.abstract_factory.skin.button.Button;
import com.jml.design.factory.abstract_factory.skin.text.TextField;

/**
 * @Author: jml
 * @Date: 18-3-23
 * @Description:
 */
public interface SkinFactory {

    Button createButton();

    TextField createTextField();

    ComboBox createComboBox();
}
