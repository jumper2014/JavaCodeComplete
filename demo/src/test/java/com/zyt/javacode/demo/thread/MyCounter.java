package com.zyt.javacode.demo.thread;

public class MyCounter {
    private int count = 0;

    public void add(int n) {
        synchronized(this) {
            count += n;
        }
    }

    // 方法上synchronized等价于方法里面synchronized(this)
    public synchronized void dec(int n) {
            count -= n;
    }
    /*
    方法外的 public synchronized static void test(int n)
    等价于方法里面的
    synchronized(Counter.class) 
     */

    public int get() {
        return count;
    }
}
