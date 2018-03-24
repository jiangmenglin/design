package com.jml.design.bridge;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析GIF格式文件并获取其matrix对象
        Matrix matrix = new Matrix();
        imp.doPaint(matrix);
        System.out.println(fileName + "，格式为GIF。");
    }
}
