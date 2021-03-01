package com.zyt.javacode.demo.thread;

public class ThreadStatus {

    // 当线程启动后，它可以在Runnable、Blocked、Waiting和Timed Waiting
    // 这几个状态之间切换，直到最后变成Terminated状态，线程终止。
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("hello");
        });
        System.out.println("start");
        t.start();
        t.join();
        System.out.println("end");
    }

}
