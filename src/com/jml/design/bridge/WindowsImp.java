package com.jml.design.bridge;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(Matrix matrix) {
        //调用Windows系统的绘制函数绘制像素矩阵
        System.out.println("在Windows中显示图像");
    }
}
