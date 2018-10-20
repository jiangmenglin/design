package com.jml.design.thread.produceandcomsume;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: jml
 * @Date: 18-7-2
 * @Description:
 */
public class Storage {
    //仓库的最大存储量
    private final int MAX_SIZE = 100;
    //仓库存贮的物资
    private List<Object> list = new LinkedList<>();

    /*
    生产
     */
    public void produce(String producer) {
        synchronized (list) {
            while (list.size() == MAX_SIZE) {
                System.out.println("仓库已满,【" + producer + "】暂时不能生产。");
                try {
                    //由于条件不满足，生产受阻
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.add(new Object());

            System.out.println("【" + producer + "】生产了一个产品\t【仓库现有存量为】" + list.size());
            list.notifyAll();
        }
    }

    /*
    消费者消费
     */
    public void comsume(String comsumer) {
        synchronized (list) {
            //如果仓库存量不足
            while (list.size() == 0) {
                System.out.println("仓库缺货，【" + comsumer + "】暂时不能执行消费任务。");
                try{
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.remove(list.size() - 1);
            System.out.println("【" + comsumer + "】消费了一个产品\t【仓库存量为】" + list.size());
            list.notifyAll();
        }
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public int getMAX_SIZE() {
        return MAX_SIZE;
    }
}
