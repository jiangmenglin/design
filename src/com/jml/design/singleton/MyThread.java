package com.jml.design.singleton;

public class MyThread implements Runnable {

    private Singleton singleton;

    @Override
    public void run() {
        singleton = Singleton.getInstance();
        printInfo();
    }

    private void printInfo() {
        System.out.println(singleton);
    }
}
