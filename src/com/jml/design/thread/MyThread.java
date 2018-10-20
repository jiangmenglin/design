package com.jml.design.thread;

/**
 * @Author: jml
 * @Date: 18-7-1
 * @Description:
 */
public class MyThread extends Thread {

    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "   " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "   " + i);
            if (i == 30) {
                Thread myThread1 = new MyThread();
                Thread myThread2 = new MyThread();
                myThread1.start();
                myThread2.start();
            }
        }
    }
}
