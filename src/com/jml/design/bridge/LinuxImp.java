package com.jml.design.bridge;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class LinuxImp implements ImageImp {
    @Override
    public void doPaint(Matrix matrix) {
        //调用了；Linux系统的绘制函数绘制图像
        System.out.println("在Linux中显示图像。");
    }
}
