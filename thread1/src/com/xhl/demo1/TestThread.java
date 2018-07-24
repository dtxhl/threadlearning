package com.xhl.demo1;

public class TestThread {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("Thread-1");
        t1.start();

        ThreadDemo t2 = new ThreadDemo("thread-2");
        t2.start();
    }
}
