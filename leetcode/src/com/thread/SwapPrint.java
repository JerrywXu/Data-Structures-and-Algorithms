package com.thread;//package com.thread;

public class SwapPrint {
    static int r =0;
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    r++;
                    task.PrintNum(r);
                    if(r>=10){
                        System.exit(1);
                    }
                }
            }
        });
        thread1.setName("我是线程1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    r++;
                    task.PrintNum(r);
                    if(r>=10){
                        System.exit(1);
                    }
                }
            }
        });
        thread2.setName("我是线程2");
        thread2.start();


    }
}

