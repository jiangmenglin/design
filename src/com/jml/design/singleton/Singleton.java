package com.jml.design.singleton;

public class Singleton {

    private String name;

    private static Singleton instance = null;

    private Singleton() {

    }

    public synchronized static Singleton getInstance() {
        while(instance == null) {
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
