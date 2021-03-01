package com.zyt.javacode.demo.thread;

import lombok.SneakyThrows;

public class FlagInterrupt {

    public static void main(String[] args)  throws InterruptedException {
        HelloThread t = new HelloThread();
        t.start();
        Thread.sleep(10);
        t.running = false; // 标志位置为false
    }

    // 线程间共享变量需要使用volatile关键字标记，确保每个线程都能读取到更新后的变量值。
    // volatile关键字的目的是告诉虚拟机：
    //
    //每次访问变量时，总是获取主内存的最新值；
    //每次修改变量后，立刻回写到主内存。
    //volatile关键字解决的是可见性问题：当一个线程修改了某个共享变量的值，其他线程能够立刻看到修改后的值。
    private static class HelloThread extends Thread {
        public volatile boolean running = true;
        public void run() {
            int n = 0;
            while (running) {
                n ++;
                System.out.println(n + " hello!");
            }
            System.out.println("end!");
        }
    }
}



