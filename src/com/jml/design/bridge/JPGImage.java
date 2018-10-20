package com.jml.design.bridge;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class JPGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析JPG文件格式并获取一个像素矩阵对象matrix
        Matrix matrix = new Matrix();
        imp.doPaint(matrix);
        System.out.println(fileName + ",格式为JPG。");
    }
}
