package com.jml.design.bridge;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix matrix) {
        //调用Unix操作系统的绘制函数绘制图像
        System.out.println("在Unix系统中绘制图像。");
    }
}
