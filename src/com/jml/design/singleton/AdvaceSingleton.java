package com.jml.design.singleton;


/**
 * 饿汉单例模式不能延迟加载，不管是否用到都会创建。而懒汉模式又会用线程来控制创建过程，性能受到影响
 * 现在这种方式，是通过虚拟机 来控制保证线程安全，而且 是懒汉模式
 * @Author: jml
 * @Date: 18-3-24
 * @Description:
 */
public class AdvaceSingleton {

    private AdvaceSingleton() {

    }

    private static class SingletonHolder {
        private static final AdvaceSingleton instance = new AdvaceSingleton();
    }

    public static AdvaceSingleton getInstace() {
        return SingletonHolder.instance;
    }
}
