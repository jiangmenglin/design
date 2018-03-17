package com.jml.design.singleton;

import javax.management.relation.RoleInfo;

public class SingletonTest {

    public static void main(String[] args) {
        Runnable thread1 = new MyThread();
        Runnable thread2 = new MyThread();
        Runnable thread3 = new MyThread();
        new Thread(thread1).start();
        new Thread(thread2).start();
        new Thread(thread3).start();
    }
}
