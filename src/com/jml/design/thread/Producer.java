package com.jml.design.thread;

/**
 * @Author: jml
 * @Date: 18-7-1
 * @Description:
 */
public class Producer {
    private int product = 0;
    private static final int MAX_PRODUCT = 100;
    private static final int MIN_PRODUCT = 10;

    public synchronized void produce() {
        if (this.product >= MAX_PRODUCT) {
            try {
                wait();
                System.out.println("产品已满，请稍后在生产。");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }
        this.product++;
        System.out.println("生产第" + this.product + "产品。");
        notifyAll();
    }

    public synchronized void comsume() {
        if (this.product <= MIN_PRODUCT) {
            try {
                wait();
                System.out.println("缺货，稍后再取。");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }
        System.out.println("消费者取走了第" + this.product + "个产品");
        this.product--;
        notifyAll();
    }
}
