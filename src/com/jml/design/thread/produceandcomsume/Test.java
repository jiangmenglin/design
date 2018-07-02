package com.jml.design.thread.produceandcomsume;

/**
 * @Author: jml
 * @Date: 18-7-2
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Storage storage = new Storage();

        for (int i = 0; i < 6; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    storage.produce(String.format("生产者%d:", finalI));
                }
            }).start();
        }

        for (int i = 0; i < 4; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    storage.comsume(String.format("消费者%d:", finalI));
                }
            }).start();
        }
    }
}
