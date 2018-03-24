package com.jml.design.singleton;

/**
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {

    }

    //这种方式只在实例为空 时才锁定创建代码，只要创建了实例后都不会锁定，避免了效率低下的问题
    public DoubleCheckSingleton getInstance() {
        //第一次判断实例是否为空，此后有可能被其他线程获得锁
        if (instance == null) {
            //获取锁
            synchronized (this) {
                //再次判断是否有其他线程创建了实例
                if (instance == null)
                    instance = new DoubleCheckSingleton();
            }
        }
        return instance;
    }
}
