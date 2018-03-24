package com.jml.design.bridge;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description: 抽象图类
 */
public abstract class Image {

    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
