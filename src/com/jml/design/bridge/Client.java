package com.jml.design.bridge;

import com.jml.design.util.XMLUtil;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Image image;
        ImageImp imp;
        image = (Image)XMLUtil.getBean("bridge.xml", "image");
        imp = (ImageImp) XMLUtil.getBean("bridge.xml", "os");
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
