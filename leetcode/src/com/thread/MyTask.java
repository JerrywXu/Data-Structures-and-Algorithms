package com.thread;

public class MyTask {

    public synchronized void PrintNum(int i){
        this.notify();
        System.out.println(Thread.currentThread().getName()+":"+i);
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
