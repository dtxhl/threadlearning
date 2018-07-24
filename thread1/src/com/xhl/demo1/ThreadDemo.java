package com.xhl.demo1;

public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    public ThreadDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("creating "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("thread:"+threadName);
                //让线程睡眠一会儿
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread "+threadName + "interrupted");
        }
        System.out.println("Thread "+threadName+" exiting");
    }

    public void start(){
        System.out.println("starting "+threadName);
        if (t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }

}
