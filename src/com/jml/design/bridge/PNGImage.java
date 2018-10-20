package com.jml.design.bridge;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class PNGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析PNG格式文件并获取一个像素矩阵 绘制图像
        Matrix matrix = new Matrix();
        imp.doPaint(matrix);
        System.out.println(fileName + "，格式为PNG。");
    }
}
