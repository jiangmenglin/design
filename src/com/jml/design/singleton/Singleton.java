package com.jml.design.singleton;

public class Singleton {

    private String name;

    private static Singleton instance = null;

    private Singleton() {

    }

    //缺点是每次获取 线程都要锁定代码，效率低下
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
