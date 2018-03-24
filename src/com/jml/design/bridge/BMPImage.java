package com.jml.design.bridge;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class BMPImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析BMP格式文件获得像素矩阵对象
        Matrix matrix = new Matrix();
        imp.doPaint(matrix);
        System.out.println(fileName + "，格式为BMP。");
    }
}
